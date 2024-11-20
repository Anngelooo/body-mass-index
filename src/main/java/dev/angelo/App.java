package dev.angelo;

import dev.angelo.Controller.BmiController;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
 public static void main(String[] args) {
        System.out.println("                       ");
        System.out.println("Welcome to BMI calculator!");
        System.out.println("--------------------------");
        System.out.println( "                          ");
        
        new BmiController();
        
    }
}
