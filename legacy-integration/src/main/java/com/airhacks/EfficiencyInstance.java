package com.airhacks;

import java.lang.annotation.Annotation;

/**
 *
 * @author airhacks.com
 */
public class EfficiencyInstance implements Efficiency {

    Type type;

    public EfficiencyInstance(Type type) {
        this.type = type;
    }

    @Override
    public Type value() {
        return this.type;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return Efficiency.class;

    }

}
