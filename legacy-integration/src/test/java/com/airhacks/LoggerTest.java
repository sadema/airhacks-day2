package com.airhacks;

import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class LoggerTest {

    @Test
    public void consumer() {
        Log LOG = this::something;
        LOG.log("hey joe");
    }

    public void something(String msg) {
        System.out.println("-- " + msg);
    }

}
