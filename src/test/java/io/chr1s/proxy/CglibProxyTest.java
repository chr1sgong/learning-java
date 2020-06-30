package io.chr1s.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import org.junit.Test;

public class CglibProxyTest {

    @Test
    public void testFixVal() throws IllegalAccessException, InstantiationException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "hello, cglib";
            }
        });
        Class<?> sampleClazz = enhancer.createClass();
        SampleClass sampleClass = (SampleClass) sampleClazz.newInstance();
        System.out.println(sampleClass.test());
        System.out.println(sampleClass.toString());
        System.out.println(sampleClass.getClass());
        System.out.println(sampleClass.hashCode());
    }
}
