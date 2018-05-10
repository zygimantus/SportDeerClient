/*
 * The MIT License
 *
 * Copyright 2018 Zygimantus.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.zygimantus.sportdeerclient;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Zygimantus
 */
public class Utils {

    public static String getPropertyValueFromProperties(String property) {
        Properties prop = new Properties();

        try {

            ClassLoader classLoader = Utils.class.getClassLoader();
            // load a properties file
            try (InputStream input = classLoader.getResource("client.properties").openStream()) {
                // load a properties file
                prop.load(input);
            }

            // get the property value and print it out
            return prop.getProperty(property);

        } catch (IOException ex) {
        }
        return null;
    }
}
