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

package com.geercode.creed.core.modular.event.ancester;

/**
 * <p>Description : 总线</p>
 * <p>Created on  : 2019-02-26 15:18</p>
 *
 * @author jerryniu
 * @since 1.0.0
 */
public interface EventBus {
    /**
     * <p>description : 注册</p>
     * <p>create   on : 2019-03-06 16:56:39</p>
     *
     * @author jerryniu
     * @param listener 注册的监听器
     * @since 1.0.0
     */
    void register(EventListener listener);

    /**
     * <p>description : 发布</p>
     * <p>create   on : 2019-03-06 16:56:23</p>
     *
     * @author jerryniu
     * @param event 事件
     * @since 1.0.0
     */
    void post(Event event);
}
