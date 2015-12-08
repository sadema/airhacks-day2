package com.airhacks.legacy;

/**
 *
 * @author airhacks.com
 */
public class OldStuff {

    private String connectionString;
    private boolean connected;

    public OldStuff(String connectionString) {
        this.connectionString = connectionString;
    }

    public void initialize() {
        this.connected = true;
    }

    public void businessLogic() {
        if (!this.connected) {
            throw new IllegalStateException("Please connect");
        }
        System.out.println("some business");
    }

}
