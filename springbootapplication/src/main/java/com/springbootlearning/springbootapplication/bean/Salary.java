package com.springbootlearning.springbootapplication.bean;

public class Salary {
    private int baseSalary;
    private int bonus;

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                '}';
    }
}
