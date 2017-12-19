/** 
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.dueros.data.response.directive;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * 停止播放一个audio_player stream
 * 
 * @author tianlonglong(tianlong02@baidu.com)
 * @version V1.0
 * @since 2017年10月5日
 */
@JsonTypeName("AudioPlayer.Stop")
public class Stop extends AudioPlayerDirective {

    /**
     * 默认构造方法
     */
    public Stop() {
        super();
    }

    /**
     * 构造方法
     * 
     * @param playBehavior
     *            当前播放状态
     * @param audioItem
     *            多媒体信息
     */
    public Stop(final PlayBehaviorType playBehavior, final AudioItem audioItem) {
        super(playBehavior, audioItem);
    }

    /**
     * 构造方法
     * 
     * @param playBehavior
     *            当前播放状态
     * @param url
     *            链接地址
     * @param offsetInMilliSeconds
     *            当前播放进度
     */
    public Stop(final PlayBehaviorType playBehavior, final String url, final int offsetInMilliSeconds) {
        super(playBehavior, url, offsetInMilliSeconds);
    }

}
