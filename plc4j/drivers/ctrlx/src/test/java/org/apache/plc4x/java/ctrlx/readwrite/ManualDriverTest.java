/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.plc4x.java.ctrlx.readwrite;

import org.apache.plc4x.java.api.PlcConnection;
import org.apache.plc4x.java.api.PlcDriverManager;
import org.apache.plc4x.java.api.authentication.PlcUsernamePasswordAuthentication;
import org.apache.plc4x.java.api.messages.PlcBrowseResponse;
import org.apache.plc4x.java.api.messages.PlcPingResponse;

import java.util.concurrent.CompletableFuture;

public class ManualDriverTest {

    public static void main(String[] args) throws Exception {
        try (PlcConnection connection = PlcDriverManager.getDefault().getConnectionManager().getConnection("ctrlx://192.168.42.100", new PlcUsernamePasswordAuthentication("my-username", "my-password"))) {
            CompletableFuture<? extends PlcPingResponse> ping = connection.ping();
            PlcPingResponse plcPingResponse = ping.get();
            System.out.println(plcPingResponse);
            PlcBrowseResponse plcBrowseResponse = connection.browseRequestBuilder().addQuery("test", "**").build().execute().get();
            System.out.println(plcBrowseResponse);
        }
    }

}
