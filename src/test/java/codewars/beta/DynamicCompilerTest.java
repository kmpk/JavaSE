package codewars.beta;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class DynamicCompilerTest {

    @Test
    public void testExample0() throws Exception {
        Class<?> testClass = DynamicCompiler.compileAndLoad(
                "org.codewars.kata.dynamicjava.$_ExampleClass0_$", "package org.codewars.kata.dynamicjava; public class $_ExampleClass0_$ { public static int test() {return 42;} }");
        Method testMethod = testClass.getMethod("test");
        Assert.assertEquals(testMethod.invoke(null), 42);
    }

    @Test
    public void testExample1() throws Exception {
        Class<?> testClass = DynamicCompiler.compileAndLoad(
                "org.codewars.kata.dynamicjava.$_ExampleClass1_$", "package org.codewars.kata.dynamicjava; public class $_ExampleClass1_$ { private class Inner {} }");
        Assert.assertEquals(testClass.getDeclaredClasses().length, 1);
    }
}