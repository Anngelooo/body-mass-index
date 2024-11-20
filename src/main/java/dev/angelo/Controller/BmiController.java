package dev.angelo.Controller;

import dev.angelo.Models.BmiModel;
import dev.angelo.Models.PersonModel;
import dev.angelo.Views.BmiView;

public class BmiController {

    public BmiController(){
        startProgram();
    }


    public static void startProgram(){       
        double weight = BmiView.askWeight();
        double height = BmiView.askHeight();
        PersonModel person = new PersonModel(weight, height);
        getBMI(person);
    }

    public static void getBMI(PersonModel person){
        double bmi = BmiModel.calculateBMI(person);
        String clasification = BmiModel.giveResultsBMI(bmi);
        BmiView.showResults(bmi, clasification);

    }



}