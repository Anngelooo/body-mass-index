package dev.angelo.Controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.angelo.Models.PersonModel;

public class BmiControllerTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        
        System.setOut(new PrintStream(outputStreamCaptor));
         
    }

  

    @Test
    void testGetBMI() {

        double weight = 68.60;
        double height = 1.69;

        PersonModel person = new PersonModel(weight, height);

        BmiController.getBMI(person);

        String expectedBMI = "Your BMI is: 24,02";

        String expectedClassification = "Your BMI is: Normal weight";
                
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains(expectedBMI)); 
        assertTrue(output.contains(expectedClassification));

    }
}
