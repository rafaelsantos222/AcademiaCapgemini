/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package questao03capgemini;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;
import org.hamcrest.*;




/**
 *
 * @author Rafael
 */
public class Questao03capgeminiTest {
    
    
  @Test
    public void vefificaAnagramaEqualsValidoTresOcorrencias() {
        Questao03capgemini q3 = new Questao03capgemini();   
        assertEquals(3, q3.verificaAnagrama("ifailuhkqq"));
    }

    
    @Test
   public void vefificaAnagramaEqualsZeroOcorrencias() {
        Questao03capgemini q3 = new Questao03capgemini();
        assertEquals(0, q3.verificaAnagrama("av"));
    }

    
    @Test
   public void vefificaAnagramaEqualsValidoDuasOcorrencias() {
       Questao03capgemini q3 = new Questao03capgemini();
        assertEquals(2, q3.verificaAnagrama("ovo"));
    }
    
}
