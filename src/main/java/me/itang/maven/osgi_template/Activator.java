package me.itang.maven.osgi_template;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("start:" + getClass() + " hello");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("stop:" + getClass());
    }
}
