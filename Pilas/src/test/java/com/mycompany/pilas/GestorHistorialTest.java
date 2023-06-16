/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pilas;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leona
 */
public class GestorHistorialTest {
    
    public GestorHistorialTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of VisitarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testVisitarWeb() {
        System.out.println("VisitarWeb");
        PaginaWeb pagina = null;
        GestorHistorial instance = new GestorHistorial();
        instance.VisitarWeb(pagina);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }Título


    /**
     * Test of cerrarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testCerrarWeb() {
        System.out.println("cerrarWeb");
        GestorHistorial instance = new GestorHistorial();
        instance.cerrarWeb();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarWeb method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarWeb() {
        System.out.println("eliminarWeb");
        GestorHistorial instance = new GestorHistorial();
        instance.eliminarWeb();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUltimaWebVisitada method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerUltimaWebVisitada() {
        System.out.println("obtenerUltimaWebVisitada");
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerUltimaWebVisitada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerVisitaDispositivos method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testObtenerVisitaDispositivos() {
        System.out.println("obtenerVisitaDispositivos");
        String dispositivos = "";
        GestorHistorial instance = new GestorHistorial();
        PaginaWeb expResult = null;
        PaginaWeb result = instance.obtenerVisitaDispositivos(dispositivos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historial method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testHistorial() {
        System.out.println("historial");
        GestorHistorial instance = new GestorHistorial();
        instance.historial();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPila method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testGetPila() {
        System.out.println("getPila");
        GestorHistorial instance = new GestorHistorial();
        Stack expResult = null;
        Stack result = instance.getPila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPila method, of class GestorHistorial.
     */
    @org.junit.jupiter.api.Test
    public void testSetPila() {
        System.out.println("setPila");
        Stack pila = null;
        GestorHistorial instance = new GestorHistorial();
        instance.setPila(pila);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
