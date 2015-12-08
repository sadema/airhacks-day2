package com.airhacks.legacy;

import javax.enterprise.inject.Produces;

/**
 *
 * @author airhacks.com
 */
public class OldStuffFactory {

    @Produces
    public OldStuff expose() {
        OldStuff oldStuff = new OldStuff("localhost");
        oldStuff.initialize();
        return oldStuff;
    }

}
