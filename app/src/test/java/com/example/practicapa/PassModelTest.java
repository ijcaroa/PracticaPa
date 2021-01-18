package com.example.practicapa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;


import static org.junit.Assert.*;

public class PassModelTest {

    private PassModel model;

    @Before
    public void setUp() throws Exception {
        model = new PassModel();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void verificarPass() {
        //Given
        String pass = "abc";
        //When
        String resultado = model.verificarPass(pass);
        //Then
        assertEquals("Weak",resultado);

    }
    @Test
    public void verificarPass_Strong() {
        //Given
        String pass = "abSDeS";
        //When
        String resultado = model.verificarPass(pass);
        //Then
        assertEquals("Strong",resultado);

    }
    @Test
    public void verificarPass_Medium() {
        //Given
        String pass = "abcde";
        //When
        String resultado = model.verificarPass(pass);
        //Then
        assertEquals("Medium",resultado);

    }

    @Test
    public void verificarMayusc() {
        //Given
        String pass = "prueba";
        //When
        boolean resultado = model.verificarMayusc(pass);
        //Then
        assertThat(resultado).isTrue();

    }
}