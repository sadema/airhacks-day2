package com.airhacks;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author airhacks.com
 */
@Model
public class Index {

    @Inject
    Algorithm boundary;

    @Inject
    Instance<Compressor> compressors;

    public String getMessage() {
        return boundary.message();
    }

    public String getCompressors() {
        String retVal = "";
        for (Compressor compressor : compressors) {
            retVal += compressor.getClass().getName();
            compressor.compress();;
        }
        return retVal;
    }

}
