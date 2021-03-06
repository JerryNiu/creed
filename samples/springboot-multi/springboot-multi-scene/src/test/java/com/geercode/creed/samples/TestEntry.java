/*
 * Copyright 2018-2050 the original author or authors.
 * Powered by Yimei Corp.
 * All Rights Reserved.
 */

package com.geercode.creed.samples;

import com.geercode.creed.samples.scene.ClassNameTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * <p>Description : 测试套件入口</p>
 * <p>Created on  : 2018-09-11 17:24</p>
 *
 * @author jerryniu
 * @since 1.0.0
 */
@RunWith(Categories.class)
@SuiteClasses(ClassNameTest.class)
public class TestEntry {
}