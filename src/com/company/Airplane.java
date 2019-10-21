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
        if (this == obj) return true;
        if (obj == null || getClass () != obj.getClass ()) return false;
        Airplane airplane = (Airplane) obj;

        if (setingCapacity != airplane.setingCapacity ) return  false;
        return flightRange == airplane.flightRange;

    }


    public static void main ( String[] args ) {
        Airplane airplaneS7 = new Airplane(222, 33, "S7");
        Airplane airplaneUral = new Airplane(222, 33, "UralAirlines");
        System.out.println(airplaneS7.equals(airplaneUral));
        Airplane airplaneS71 = new Airplane(444, 33, "S7");
        Airplane airplaneUral2 = new Airplane(444, 22, "UralAirlines");
        System.out.println(airplaneS71.equals(airplaneUral2));
        Airplane airplaneS72 = new Airplane(432, 33, "S7");
        Airplane airplaneUral3 = new Airplane(321, 54, "UralAirlines");
        System.out.println(airplaneS72.equals(airplaneUral3));
    }
}