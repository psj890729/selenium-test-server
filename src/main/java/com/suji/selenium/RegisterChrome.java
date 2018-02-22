/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
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
 *
 */
package com.suji.selenium;

import org.openqa.grid.selenium.GridLauncherV3;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * Register a Chrome browser in the Selenium Hub.
 *
 * @author Boni Garcia (boni.gg@gmail.com)
 * @since 1.0.0
 */
public class RegisterChrome {

    public static void main(String[] args) throws Exception {
        ChromeDriverManager.getInstance().setup();
        GridLauncherV3.main(new String[] { "-role", "node", "-hub",
                "http://localhost:4445/grid/register", "-browser",
                "browserName=chrome,version=59", "-port", "5555" });
    }

}
