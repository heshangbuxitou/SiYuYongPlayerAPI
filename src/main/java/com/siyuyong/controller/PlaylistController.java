package com.siyuyong.controller;

import com.siyuyong.config.ServiceConfig;
import com.siyuyong.domain.ListPlayListResult;
import com.siyuyong.domain.PlayListResult;
import com.siyuyong.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {
    @Autowired
    ServiceConfig serviceConfig;

    @RequestMapping(value = "/show_playlist", method = RequestMethod.GET)
    @Cacheable(value = "listplaylist#${select.cache.timeout}#${select.cache.refresh}", key = "#index + '' + #offset") // SpEL表达式 组合Key 也可以这样 T(String).valueOf(#index).concat(#offset)
    public ListPlayListResult showPlaylist(@RequestParam(value = "source", required = false, defaultValue = "0") int index,
                                           @RequestParam(value = "offset", required = false, defaultValue = "0") String offset) {
        ReplayService service = serviceConfig.getReplayServiceByIndex(index);
        return service.listPlaylist(offset);
    }


    @RequestMapping(value = "/playlist", method = RequestMethod.GET)
    @Cacheable(value = "playlist#${select.cache.timeout}#${select.cache.refresh}", key = "#listId") // SpEL表达式 组合Key 也可以这样 T(String).valueOf(#index).concat(#offset)
    public PlayListResult playlist(@RequestParam(value = "list_id", required = false, defaultValue = "0") String listId) {
        // todo 还有my_list_id 未完成
        ReplayService service = serviceConfig.getReplayServiceByPrefix(listId);
        PlayListResult result = service.getPlaylist(listId);
        result.setIs_mine("0");
        return result;
    }
}
