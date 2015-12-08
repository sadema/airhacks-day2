package com.airhacks;

import javax.enterprise.inject.Specializes;

/**
 *
 * @author airhacks.com
 */
@Specializes
public class CustomAlgorithm extends Algorithm {

    @Override
    public String message() {
        return "super custom " + super.message();
    }

}
