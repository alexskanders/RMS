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

package com.skanders.rms.def;

import com.skanders.jbel.def.SkandersException;

public class RMSException extends SkandersException
{
    /**
     * {@inheritDoc}
     */
    public RMSException()
    {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public RMSException(String message)
    {
        super(message);
    }

    /**
     * {@inheritDoc}
     */
    public RMSException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * {@inheritDoc}
     */
    public RMSException(Throwable cause)
    {
        super(cause);
    }

    /**
     * {@inheritDoc}
     */
    protected RMSException(
            String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
