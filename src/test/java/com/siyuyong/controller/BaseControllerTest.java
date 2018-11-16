package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class BaseControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;
    Logger logger = LoggerFactory.getLogger(BaseControllerTest.class);


    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
    }

    public void baseTest(String url, Map<String, Object> map) throws Exception {
        baseTest(url, map, false);
    }

    public void baseTest(String url, Map<String, Object> map, boolean outputResult) throws Exception {
        MockHttpServletRequestBuilder mockReqBuler = MockMvcRequestBuilders.get(url);
        if (map != null) {
            StringBuffer params = new StringBuffer("?");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                mockReqBuler = mockReqBuler.param(entry.getKey(), (String) entry.getValue());
                params.append("&" + entry.getKey() + "=" + entry.getValue());
            }
            logger.info("Request URL:" + url + params);
        }
        ResultActions resultActions = mvc.perform(mockReqBuler
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                ).andExpect(MockMvcResultMatchers.status().isOk());
        if (outputResult) {
            resultActions.andDo(MockMvcResultHandlers.print());
        }
    }

    @After
    public void tearDown() throws Exception {
    }
}
