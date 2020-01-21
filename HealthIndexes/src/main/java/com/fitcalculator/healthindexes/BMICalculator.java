package com.fitcalculator.healthindexes;

import com.fitcalculator.model.athlete.Athlete;

public class BMICalculator {

    public static double calculate(Athlete athlete) {
        return athlete.getWeight() / Math.pow(athlete.getHeight(), 2);
    }

    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        athlete.setName("Gabriel");
        athlete.setLastName("Solano");
        athlete.setHeight(1.86);
        athlete.setWeight(85);

        System.out.println("BMI: " + BMICalculator.calculate(athlete));
    }
}
