package com.company;

public class Run {

    final static double DEFAULT_WEATHER = 0;
    int numberOfRunners;
    private String stadiumName;
    private double weather;

    public Run(int numberOfRunners, String stadiumName, double weather) {
        this.numberOfRunners = numberOfRunners;
        this.stadiumName = stadiumName;
        this.weather = weather;
    }

    public Run(int numberOfRunners, String stadiumName) {
        this(numberOfRunners, stadiumName, DEFAULT_WEATHER);
    }

    public Run(Run run) {
        this.numberOfRunners = run.getNumberOfRunners();
        this.stadiumName = run.getStadiumName();
        this.weather = run.getWeather();
    }

    int getNumberOfRunners() {
        return this.numberOfRunners;
    }

    String getStadiumName() {
        return this.stadiumName;
    }

    double getWeather() {
        return this.weather;
    }

    public static void main(String[] args) {

        Run run1 = new Run(7, "Spartak", 15);
        Run run2 = new Run(3, "Dinamo");

        System.out.println("Количество бегунов - " + run1.getNumberOfRunners());
        System.out.println("Погода - " + run1.getWeather());

        System.out.println("Количество бегунов - " + run2.getNumberOfRunners());
        System.out.println("Погода - " + run2.getWeather());

        Run run3 = new Run(run1);
        System.out.println("Количество бегунов - " + run3.getNumberOfRunners());
        System.out.println("Погода - " + run3.getWeather());

    }
}
