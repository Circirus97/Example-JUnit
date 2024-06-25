package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class UserTest {

    private User user;
    private String emailValid;
    private String emailInvalid;


    @Before
    public void setUp() {
        user = new User();
        emailValid = "aleja@gmail.com";
        emailInvalid = "123gmail";
    }

    @Test
    public void shouldIsValidEmailAndReturnTrue() {

        //primero le paso lo esperado "TRUE" y luego lo que obtengo(Aca se llama la clase y el metodo que voy a probar)
        assertEquals(Boolean.TRUE, user.isValidEmail(emailValid));

        //Que sea diferente a lo que se está esperando, en este caso se espera "TRUE" que es diferente a "FALSE"
        assertNotEquals(Boolean.FALSE, user.isValidEmail(emailValid));

    }

    @Test
    public void shouldExecuteIsValidEmailAndReturnFalse(){

        assertEquals(Boolean.FALSE, user.isValidEmail(emailInvalid));

    }
}