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

package com.geercode.creed.core;

import com.geercode.creed.core.modular.config.PlainConfigurationTest;
import com.geercode.creed.core.modular.event.PlainEventTest;
import com.geercode.creed.core.system.log.LogTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * <p>Description : jerry的测试集</p>
 * <p>Created on  : 2019-03-11 15:26</p>
 *
 * @author jerryniu
 * @since 1.0.0
 */
@RunWith(Categories.class)
@SuiteClasses({LogTest.class,
        PlainEventTest.class,
        PlainConfigurationTest.class
})
public class JerrySuiteTest {
}
