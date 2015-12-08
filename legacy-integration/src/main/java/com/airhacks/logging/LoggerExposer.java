package com.airhacks.logging;

import java.util.function.Consumer;
import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class LoggerExposer {

    @Produces
    @Info
    public Consumer<String> expose(InjectionPoint ip) {
        final String name = ip.getMember().getDeclaringClass().getName();
        return Logger.getLogger(name)::info;
    }

    @Produces
    @Emergency
    public Consumer<String> exposeEmergency(InjectionPoint ip) {
        return System.err::println;
    }

}
