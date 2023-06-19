/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sofia
 */
public class RoundRobinTest {
    
    public RoundRobinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RoundRobin method, of class RoundRobin.
     */
    @Test
    public void testRoundRobin() {
        int[] arrivalTime = {0, 1, 3};
        int[] burstTime = {5, 2, 4};
        int quantum = 2;

        RoundRobin.RoundRobin(arrivalTime, burstTime, quantum);

        assertEquals(3.3333333, RoundRobin.getAverageWaitingTime(), 0.01);
        assertEquals(7.0, RoundRobin.getAverageResponseTime(), 0.01);
    }
    
}
