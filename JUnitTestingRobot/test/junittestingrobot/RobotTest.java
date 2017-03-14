/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittestingrobot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class RobotTest
{
    
    public RobotTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testMove()
    {
        Robot r = new Robot("Peter Test", 100, 100, 34, Robot.VoiceType.MALE);
        r.move(1, 1);
        assertEquals(r.getPosX(), 101);
        assertEquals(r.getPosY(), 101);
        
        r.move(1, 1);
        assertEquals(r.getPosX(), 102);
        assertEquals(r.getPosY(), 102);
        
        r.move(-1, -2);
        assertEquals(r.getPosX(), 101);
        assertEquals(r.getPosY(), 100);
    }
    
    @Test
    public void testGetDistanceToPoint()
    {
        Robot r = new Robot("Peter Test", 100, 100, 34, Robot.VoiceType.MALE);
        assertEquals("All your base are belong to us!",5d, r.getDistanceToPoint(103, 104),0);
    }
    
}
