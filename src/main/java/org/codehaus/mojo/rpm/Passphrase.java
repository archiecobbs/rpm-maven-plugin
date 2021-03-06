package org.codehaus.mojo.rpm;

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

/**
 * Wraps a pass phrase in such a way that it is not stored as a {@link String}.
 *
 * @author Brett Okken, Cerner Corporation
 * @since 2.0-beta-4
 */
public final class Passphrase
{
    /**
     * The passphrase stored as a {@code char[]} to avoid being written to log in plain text.
     */
    private char[] passphrase;

    /**
     * Sets the passphrase.
     *
     * @param passphrase The passphrase to set.
     */
    public void setPassphrase( String passphrase )
    {
        this.passphrase = passphrase != null ? passphrase.toCharArray() : null;
    }

    /**
     * @return Returns the {@link #passphrase}.
     */
    public char[] getPassphrase()
    {
        return this.passphrase;
    }
}
