package com.airhacks;

import com.airhacks.Efficiency.Type;
import javax.enterprise.inject.Any;
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
    @Any
    Instance<Compressor> compressors;

    @Inject
    Type type;

    public String getMessage() {
        return boundary.message();
    }

    public String getCompressors() {
        String retVal = "";
        for (Compressor compressor : compressors.select(new EfficiencyInstance(type))) {
            retVal += "-" + compressor.getClass().getName();
            compressor.compress();;
        }
        return retVal;
    }

}
