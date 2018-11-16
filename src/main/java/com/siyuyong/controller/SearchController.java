package com.siyuyong.controller;

import com.siyuyong.config.ServiceConfig;
import com.siyuyong.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    ServiceConfig serviceConfig;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "source", required = false, defaultValue = "0") int index,
                             @RequestParam(value = "keywords") String searchKey) {
        ReplayService service = serviceConfig.getReplayServiceByIndex(index);
        return service.searchTrack(searchKey);
    }
}
