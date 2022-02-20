/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao02capgemini;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import org.hamcrest.*;


/**
 *
 * @author Rafael
 */
public class Questao02capgeminiTest {
    
    @Test
    public void testVerificaSenha() {
       // System.out.println("verificaSenha");
        //Questao02capgemini.verificaSenha(senha);
        Questao02capgemini q2 = new Questao02capgemini(); 
        
        assertEquals(false, q2.verificaSenhaForte("asdd"));
    }

    
   
    
}
