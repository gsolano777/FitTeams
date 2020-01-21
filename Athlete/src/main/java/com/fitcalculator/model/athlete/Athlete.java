package com.fitcalculator.model.athlete;

import com.fitcalculator.model.Person;

public class Athlete extends Person {

    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
