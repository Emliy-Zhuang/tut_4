package com.projectname.Demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.awt.geom.Area;

/**
 * Unit test for simple App.
 */
public class TestCalc
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCalc( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalc.class );
    }

    /**
     * Rigourous Test :-)
     *
     *
     */

    public void testAdd()
    {
        Calc c = new Calc();
        assertEquals(6, c.subtract(4,2));
    }

    public void testSubtract()
    {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4,2));
    }

}
