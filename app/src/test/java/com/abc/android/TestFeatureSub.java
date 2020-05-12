package com.abc.android;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFeatureSub {

    @Test
    public void testSub() {
        assertEquals("Sub failure", 3 - 1, 2);
    }
}
