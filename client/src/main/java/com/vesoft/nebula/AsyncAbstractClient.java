/* Copyright (c) 2019 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula;

import com.facebook.thrift.async.TAsyncClientManager;
import com.facebook.thrift.protocol.TProtocolFactory;
import com.facebook.thrift.transport.TNonblockingTransport;
import com.google.common.net.HostAndPort;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.vesoft.nebula.graph.ErrorCode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AsyncAbstractClient extends AbstractClient {
    private ExecutorService executor = Executors.newFixedThreadPool(1);
    protected ListeningExecutorService service = MoreExecutors.listeningDecorator(executor);
    protected TAsyncClientManager manager;
    protected TNonblockingTransport nonblockingTransport;
    protected TProtocolFactory protocolFactory;

    public AsyncAbstractClient(List<HostAndPort> addresses, int timeout,
                               int connectionRetry, int executionRetry) {
        super(addresses, timeout, connectionRetry, executionRetry);
    }

    public AsyncAbstractClient(List<HostAndPort> addresses) {
        super(addresses);
    }

    public AsyncAbstractClient(String host, int port) {
        super(host, port);
    }

    @Override
    public int connect() {
        int retry = connectionRetry;
        while (retry-- != 0) {
            int code = doConnect(addresses);
            if (code == 0) {
                return ErrorCode.SUCCEEDED;
            }
        }
        return ErrorCode.E_FAIL_TO_CONNECT;
    }

    @Override
    public void close() {
        service.shutdown();
        nonblockingTransport.close();
        try {
            manager.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
