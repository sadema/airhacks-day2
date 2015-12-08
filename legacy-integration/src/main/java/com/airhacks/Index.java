package com.airhacks;

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

    public String getMessage() {
        return boundary.message();
    }

}
