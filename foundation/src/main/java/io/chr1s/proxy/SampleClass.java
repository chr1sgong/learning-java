package io.chr1s.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SampleClass {

    public String test() {
        return "hello, world";
    }

    public static void main(final String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println(method.getName());
                System.out.println(method.getDeclaringClass() == Object.class);
                System.out.println(Object.class.getSimpleName());
                System.out.println("before method run...");
                Object obj = methodProxy.invokeSuper(o, args);
                System.out.println(obj);
                System.out.println("after method run...");
                return obj;
            }
        });
        SampleClass sampleClass = (SampleClass) enhancer.create();
        sampleClass.test();
    }
}
