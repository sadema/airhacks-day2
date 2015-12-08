package com.airhacks;

import com.airhacks.Efficiency.Type;
import javax.enterprise.inject.Produces;

/**
 *
 * @author airhacks.com
 */
public class TypeProvider {

    @Produces
    public Type expose() {
        return Type.valueOf("FAST");
    }

}
