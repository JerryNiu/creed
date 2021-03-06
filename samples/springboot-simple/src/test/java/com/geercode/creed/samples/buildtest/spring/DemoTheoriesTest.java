/*
 * Copyright 2018-2050 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.geercode.creed.samples.buildtest.spring;

import lombok.extern.slf4j.Slf4j;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * <p>Title       : DemoTheoriesTest</p>
 * <p>Description : 测试Theories提供参数,排列组合提供测试用例</p>
 * <p>Copyright   : Copyright 2018-2050</p>
 * <p>Company     : www.juxiangfen.com</p>
 * <p>created on  : 2018-08-16 14:11</p>
 *
 * @author jerryniu
 * @version 1.0.0
 */
@Slf4j
@RunWith(Theories.class)
public class DemoTheoriesTest {
    @DataPoints
    public static String[] names = {"Tony", "Jim"};
    @DataPoints
    public static int[] ageValue1 = {10, 20};

    @Theory
    public void testMethod(String name, int age) {
        log.debug(String.format("%s's age is %s", name, age));
    }
}
