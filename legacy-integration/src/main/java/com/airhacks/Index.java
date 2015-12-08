package com.airhacks;

import com.airhacks.Efficiency.Type;
import com.airhacks.logging.Emergency;
import com.airhacks.logging.Info;
import java.util.function.Consumer;
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

    @Inject
    @Info
    Consumer<String> LOG;

    @Inject
    @Emergency
    Consumer<String> ERROR;

    public String getMessage() {
        return boundary.message();
    }

    public String getCompressors() {
        LOG.accept("Who logs that?");
        String retVal = "";
        for (Compressor compressor : compressors.select(new EfficiencyInstance(type))) {
            retVal += "-" + compressor.getClass().getName();
            compressor.compress();;
        }
        ERROR.accept("something happened");
        return retVal;
    }

}
