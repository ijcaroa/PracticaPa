package com.example.practicapa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class PassPresenterTest {
    private PassPresenter presentador;

    @Mock
    private IViewPresenter view;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presentador = new PassPresenter(view);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void verificadorPassword() {
        //Given
        String pass = "asd";
        //Then
        presentador.verificadorPassword(pass);
        //When
        //Mockito.verify(view,Mockito.times(1));
        Mockito.verify(view,Mockito.times(1)).showPass("#DA1212","Weak");
    }
    @Test
    public void verificadorPassword_strong() {
        //Given
        String pass = "asdSDE";
        //Then
        presentador.verificadorPassword(pass);
        //When
        //Mockito.verify(view,Mockito.times(1));
        Mockito.verify(view,Mockito.times(1)).showPass("#4BCF51", "Strong");
    }
    @Test
    public void verificadorPassword_medium() {
        //Given
        String pass = "asdsdef";
        //Then
        presentador.verificadorPassword(pass);
        //When
        //Mockito.verify(view,Mockito.times(1));
        Mockito.verify(view,Mockito.times(1)).showPass("#E3F433", "Medium");
    }
}