/*
 * Copyright (c) 2020 Alexander Iskander
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skanders.rms.config;


import com.skanders.rms.def.RMSException;

/**
 * Helper enum for RMSConfig to select db.type option from the config file for
 * RMSConfig
 *
 * @see RMSConfig
 */
public enum DBType
{
    NONE,
    URL,
    DRIVER;

    /**
     * Gets enum type from String value.
     * <p>
     * If value is null {@link DBType#NONE} is returned
     *
     * @param value string stating the desired type
     * @return an CORSType corresponding with the value
     */
    static DBType getType(String value)
    {
        if (value == null)
            return DBType.NONE;

        switch (value.toLowerCase()) {
            case "none":
                return DBType.NONE;
            case "url":
                return DBType.URL;
            case "driver":
                return DBType.DRIVER;
            default:
                throw new RMSException("Invalid connectionType given.");
        }
    }
}
