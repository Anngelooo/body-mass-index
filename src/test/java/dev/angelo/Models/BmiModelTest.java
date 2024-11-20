package dev.angelo.Models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class BmiModelTest {
    
    @Test
    void testCalculateBMI() {
        double weight = 68.60;
        double height = 1.69;
        PersonModel person = new PersonModel(weight, height);
        double actualBMI = BmiModel.calculateBMI( person);

   
    double roundedBMI = Math.round(actualBMI * 100.0) / 100.0;

    double expectedBMI = 24.02;

        assertThat(roundedBMI, is(expectedBMI));

    }

    @Test
    void testGiveResultsBMI() {
       
        assertThat(BmiModel.giveResultsBMI(15.0), is("Severe thinness"));  
        assertThat(BmiModel.giveResultsBMI(16.5), is("Moderate thinness")); 
        assertThat(BmiModel.giveResultsBMI(17.5), is("Mild thinness"));    
        assertThat(BmiModel.giveResultsBMI(22.0), is("Normal weight"));   
        assertThat(BmiModel.giveResultsBMI(28.0), is("Overweight"));        
        assertThat(BmiModel.giveResultsBMI(33.0), is("Mild obesity"));      
        assertThat(BmiModel.giveResultsBMI(37.0), is("Moderate obesity"));  
        assertThat(BmiModel.giveResultsBMI(42.0), is("Morbid obesity"));  

    }
}
