package dev.angelo.Views;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BmiViewTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
     
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    void testAskWeight() {
       
        String simulatedInput = "68.60\n"; 
        
       
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        
        double expectedResult = 68.60;
        double result = BmiView.askWeight();
        
        assertEquals(expectedResult, result);
    }
    @Test
    void testAskHeight() {
               
        String simulatedInput = "1.69\n";       
             
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            
        double expectedResult = 1.69;
        double result = BmiView.askHeight();
              
        assertEquals(expectedResult, result); 
          
    }
    @Test
    void testShowResults() {
        double bmi = 24.02;
        String clasification = "Normal weight";

        BmiView.showResults(bmi, clasification);
        
        String expectedBMI = "Your BMI is: 24,02";

        String expectedClassification = "Your BMI is: Normal weight";

        
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains(expectedBMI)); 
        assertTrue(output.contains(expectedClassification)); 


    }
}
