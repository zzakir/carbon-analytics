/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.siddhi.editor.core.util.designview.designgenerator.generators.query.input.types.patternsequencesupporters;

/**
 * Configuration class for logical statement element.
 */
public class LogicalStateElementConfig implements StateElementConfig {

    private StreamStateElementConfig streamStateElement1;
    private String type;
    private StreamStateElementConfig streamStateElement2;
    private String within;

    public StreamStateElementConfig getStreamStateElement1() {

        return streamStateElement1;
    }

    public void setStreamStateElement1(StreamStateElementConfig streamStateElement1) {

        this.streamStateElement1 = streamStateElement1;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public StreamStateElementConfig getStreamStateElement2() {

        return streamStateElement2;
    }

    public void setStreamStateElement2(StreamStateElementConfig streamStateElement2) {

        this.streamStateElement2 = streamStateElement2;
    }

    public String getWithin() {

        return within;
    }

    public void setWithin(String within) {

        this.within = within;
    }
}
