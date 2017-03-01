/*
 * Copyright (c) SSI Schaefer IT Solutions
 */
package com.wamas.ide.launching;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private static BundleContext ctx;

    @Override
    public void start(BundleContext context) throws Exception {
        ctx = context;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        ctx = null;
    }

    public static ILog getLog() {
        return Platform.getLog(ctx.getBundle());
    }

    public static void log(int severity, String message, Throwable t) {
        getLog().log(new Status(severity, ctx.getBundle().getSymbolicName(), message, t));
    }

}
