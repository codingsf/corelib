package com.michael.corelib.internet.core;

import android.content.Context;
import com.michael.corelib.aop.ProxyFactory;
import com.michael.corelib.config.CoreConfig;
import com.michael.corelib.extend.defaultNetworkImpl.HttpClientInternalImpl;

public class HttpClientFactory {

    private static HttpClientInterface gHttpClientInterface;

	public synchronized static HttpClientInterface createHttpClientInterface(Context context) {
        if (gHttpClientInterface == null) {
            Object ret = ProxyFactory.newProxyObj(new HttpClientInternalImpl());

            CoreConfig.LOGD("[[createHttpClientInterface]] proxy type = " + ret.getClass().getName());

            gHttpClientInterface = (HttpClientInterface) ret;
            gHttpClientInterface.init(context);
        }

        return gHttpClientInterface;
	}

}
