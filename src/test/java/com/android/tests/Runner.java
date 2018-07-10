package com.android.tests;

import com.appium.manager.ParallelThread;
import org.testng.annotations.Test;

/**
 * Created by arun on 06/07/2018.
 */
public class Runner {

    @Test
    public void testApp() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        parallelThread.runner("com.android.tests");
    }
}
