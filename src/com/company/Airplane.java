package com.company;

public class Airplane {
    int setingCapacity;
    int flightRange;
    String company;

    public Airplane ( int setingCapacity , int flightRange , String company ) {
        this.setingCapacity = setingCapacity;
        this.flightRange = flightRange;
        this.company = company;
    }

    public int getSetingCapacity () {
        return setingCapacity;
    }

    public void setSetingCapacity ( int setingCapacity ) {
        this.setingCapacity = setingCapacity;
    }

    public int getFightRange () {
        return flightRange;
    }

    public void setFightRange ( int fightRange ) {
        this.flightRange = fightRange;
    }

    public String getCompany () {
        return company;
    }

    public void setCompany ( String company ) {
        this.company = company;
    }

    @Override
    public boolean equals ( Object obj ) {
        return super.equals ( obj );
    }

    @Override
    public int hashCode () {
        return super.hashCode ();
    }

    public static void main ( String[] args ) {
        Airplane airplaneS7 = new Airplane(250, 30, "S7");
        Airplane airplaneUral = new Airplane(250, 30, "UralAirlines");
        System.out.println(airplaneS7.equals(airplaneUral));
        Airplane airplaneS71 = new Airplane(240, 30, "S7");
        Airplane airplaneUral2 = new Airplane(250, 20, "UralAirlines");
        System.out.println(airplaneS71.equals(airplaneUral2));
        Airplane airplaneS72 = new Airplane(239, 30, "S7");
        Airplane airplaneUral3 = new Airplane(250, 19, "UralAirlines");
        System.out.println(airplaneS72.equals(airplaneUral3));
    }
}