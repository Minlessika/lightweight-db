/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020-2021 Minlessika, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.minlessika.lightweight.db;

/**
 * Embedded HSQLDB DataSource.
 * @see <a href="http://h2database.com/html/features.html?highlight=Oracle%20Compatibility%20Mode&search=Oracle%20Compatibility%20Mode#firstFound">H2 - PostgreSQL Compatibility Mode</a>
 * @since 0.1
 */
public final class EmbeddedOracleDataSource extends EmbeddedDataSource {

    /**
     * Mode.
     */
    private static final String MODE = "Oracle";

    /**
     * Ctor.
     */
    public EmbeddedOracleDataSource() {
        super(EmbeddedOracleDataSource.MODE);
    }

    /**
     * Ctor.
     * @param dbname Database name
     */
    public EmbeddedOracleDataSource(final String dbname) {
        super(dbname, EmbeddedOracleDataSource.MODE);
    }
}
