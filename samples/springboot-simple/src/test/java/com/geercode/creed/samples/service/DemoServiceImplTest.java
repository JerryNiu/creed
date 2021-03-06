package com.geercode.creed.samples.service;

import com.geercode.creed.samples.buildtest.group.BuildTests;
import com.geercode.creed.samples.buildtest.spring.SpringJ;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>Title       : DemoServiceImplTest</p>
 * <p>Description : service层测试</p>
 * <p>Copyright   : Copyright 2018-2050</p>
 * <p>Company     : www.juxiangfen.com</p>
 * <p>created on  : 2018-08-17 14:26</p>
 *
 * @author jerryniu
 * @version 1.0.0
 */
@Slf4j
@Category(BuildTests.class)
public class DemoServiceImplTest extends SpringJ {
    @Autowired
    private DemoService demoService;

    @Test
    public void helloTest() {
        String hello = demoService.hello();
        Assert.assertEquals("hi, I'm jerry", hello);
    }
}
