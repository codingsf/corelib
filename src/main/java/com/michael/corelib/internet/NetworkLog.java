package com.michael.corelib.internet;

import com.michael.corelib.config.CoreConfig;
import com.michael.corelib.log.DebugLog;

/**
 * Created by michael on 15/1/6.
 */
public class NetworkLog {

    public static final boolean DEBUG = CoreConfig.DEBUG;

    public static final int SIG_PARAM_MAX_LENGTH = 5000;

    public static void LOGD(String msg) {
        DebugLog.d("", msg);
    }

}