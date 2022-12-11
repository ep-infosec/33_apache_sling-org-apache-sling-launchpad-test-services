/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.launchpad.testservices.servlets;

import org.osgi.service.component.annotations.Component;

/** Example/test Sling Servlet using a prefix to demonstrate how
 *  PrefixServletZero overrides PrefixServletMinusOne
 */
@Component(
        immediate=true, 
        service = javax.servlet.Servlet.class,
        property = {
                "service.description:String=Prefix Test Servlet Minus One",
                "service.vendor:String=The Apache Software Foundation",
                "sling.servlet.prefix:Integer=-1",
                "sling.servlet.resourceTypes:String=sling/servlet/default",
                "sling.servlet.extensions:String=TEST_EXT_3", 
                "sling.servlet.extensions:String=TEST_EXT_4" 
        })
@SuppressWarnings("serial")
public class PrefixServletMinusOne extends TestServlet {
}