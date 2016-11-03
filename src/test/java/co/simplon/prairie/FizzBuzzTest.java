package co.simplon.prairie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Classe de tests de la classe FizzBuzz
 */
public class FizzBuzzTest {

    @Test
    public void la_correspondance_de_0_est_0() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 0 doit être 0.",
                "0",
                fizzBuzz.determinerCorrespondance(0)
        );
    }

    @Test
    public void la_correspondance_de_3_est_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 3 doit être Fizz.",
                "Fizz",
                fizzBuzz.determinerCorrespondance(3)
        );
    }

    @Test
    public void la_correspondance_de_5_est_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 5 doit être Buzz.",
                "Buzz",
                fizzBuzz.determinerCorrespondance(5)
        );
    }

    @Test
    public void la_correspondance_de_6_est_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
               "La correspondance pour 6 doit être Fizz.",
               "Fizz",
               fizzBuzz.determinerCorrespondance(6)
       );
    }
 
    @Test
    public void la_correspondance_de_10_est_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
               "La correspondance pour 10 doit être Buzz.",
               "Buzz",
               fizzBuzz.determinerCorrespondance(10)
       );
    }
    
    @Test
    public void la_correspondance_de_15_est_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
               "La correspondance pour 15 doit être FizzBuzz.",
               "FizzBuzz",
               fizzBuzz.determinerCorrespondance(15)
       );
    }
}
