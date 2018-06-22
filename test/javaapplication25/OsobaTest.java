/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aleksandra
 */
public class OsobaTest {
    
    public OsobaTest() {
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
     * Test of czyPelnoletni method, of class Osoba.
     */
    @Test
    public void testCzyPelnoletni() {
        System.out.println("czyPelnoletni");
        int wiek = 10;
        Osoba instance = new Osoba();
        boolean expResult = false;
        boolean result = instance.czyPelnoletni(wiek);
        assertEquals(expResult, result);
        
        assertTrue(instance.czyPelnoletni(18));
        assertTrue(instance.czyPelnoletni(25));
        assertTrue(instance.czyPelnoletni(120));
        
        assertFalse(instance.czyPelnoletni(10));
        assertFalse(instance.czyPelnoletni(11));
        
        
        try{
            assertTrue(instance.czyPelnoletni(-231));
            fail("Błąd w zakresie!");
        }catch(IllegalArgumentException e){
            
        }
        
    }

    /**
     * Test of zwrocSredniaWieku method, of class Osoba.
     */
    @Test
    public void testZwrocSredniaWieku() {
        System.out.println("zwrocSredniaWieku");
        Osoba instance = new Osoba();
        int[] tab = null;
        int result, expResult;
        try{
            result = instance.zwrocSredniaWieku(tab);
            fail("Nie ma tablicy!");
        }catch(IllegalArgumentException e){
            
        }
        tab = new int[0];
        try{
            result = instance.zwrocSredniaWieku(tab);
            fail("Tablica pusta!");
        }catch(IllegalArgumentException e){
            
        }
        
        tab = new int[4];
        
        tab[0] = 10;
        tab[1] = 22;
        tab[2] = 20;
        tab[3] = 30;
        
        
        expResult = 24;
        result = instance.zwrocSredniaWieku(tab);
        assertEquals(expResult, result);
        
        
        result = instance.zwrocSredniaWieku(tab);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of main method, of class Osoba.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Osoba.main(args);
    }
    
}
