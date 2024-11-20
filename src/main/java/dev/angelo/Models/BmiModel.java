package dev.angelo.Models;

public class BmiModel {
    
    public static double calculateBMI(PersonModel person){
        double bmi = person.getWeight() / (Math.pow(person.getHeight(),2));   
       
        return bmi;

    }

    public static String giveResultsBMI(double bmi){
        if (bmi < 16){
            return "Severe thinness";
        }else if(bmi < 17){
            return "Moderate thinness";

        }else if(bmi < 18.5){
            return "Mild thinness";

        }else if(bmi < 25){
            return "Normal weight";

        }else if(bmi < 30){
            return "Overweight";

        }else if(bmi < 35){
            return "Mild obesity";

        }else if(bmi < 40){
            return "Moderate obesity";

        }else{
            return "Morbid obesity";

        }

    }
}
