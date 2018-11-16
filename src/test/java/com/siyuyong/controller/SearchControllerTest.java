package com.siyuyong.controller;

import cn.hutool.core.lang.Dict;
import org.junit.Test;

import java.util.stream.IntStream;


public class SearchControllerTest extends BaseControllerTest {


    @Test
    public void searchTest() throws Exception {
        for (int source : IntStream.range(0, 3).toArray()) {
            baseTest("/search", Dict.create()
                    .set("source", String.valueOf(source))
                    .set("keywords", "11"));
        }
    }
}