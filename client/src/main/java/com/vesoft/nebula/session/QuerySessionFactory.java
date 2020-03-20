/* Copyright (c) 2019 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.session;

import com.google.common.net.HostAndPort;
import java.util.List;

/**
 *
 */
public class QuerySessionFactory implements SessionFactory<SimpleQuerySession> {

    private final List<HostAndPort> addresses;
    private final int connectionRetry;
    private final int executionRetry;
    private final int timeout;

    public QuerySessionFactory(List<HostAndPort> addresses, int timeout,
                               int connectionRetry, int executionRetry) {
        this.addresses = addresses;
        this.timeout = timeout;
        this.connectionRetry = connectionRetry;
        this.executionRetry = executionRetry;
    }

    @Override
    public SimpleQuerySession create() {
        return new SimpleQuerySession();
    }
}
