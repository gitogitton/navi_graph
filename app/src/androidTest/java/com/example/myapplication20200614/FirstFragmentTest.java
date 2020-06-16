package com.example.myapplication20200614;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstFragmentTest {

    private FirstFragment firstFragment;

    @Before
    public void setUp() throws Exception {
        firstFragment = new FirstFragment();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        assertEquals("error (sum)", 6, firstFragment.sum(1,5));
    }

    @Test
    public void substract() {
        assertEquals("error (substract)", -4, firstFragment.substract(1,5));
    }
}