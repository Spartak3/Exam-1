package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private int weight;
    private int topSpeed;
    private int seats;
    private int coast;

    public Plane(String model, String country, int year) {
        setModel(model);
        setCountry(country);
        setYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.isEmpty()) {
            this.model = model;
        }
        else {
            System.out.println("not valid model");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!model.isEmpty()) {
            this.country = country;
        }
        else{
            System.out.println("not valid country name");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1903 &&year<=2020) {
            this.year = year;
        }
        else{
            System.out.println("invalid year");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>=0 && hours<=1000) {
            this.hours = hours;
        }
        else{
            System.out.println("invalid Hours");

        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight>=1000 && weight<=160000) {
            this.weight = weight;
        }
        else{
            System.out.println("invalid weight");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed>=0) {
            this.topSpeed = topSpeed;
        }
        else {
            System.out.println("invalid speed");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats>=0) {
            this.seats = seats;
        }
        else {
            System.out.println("invalid number of seats");
        }
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        if(coast>=0) {
            this.coast = coast;
        }
        else {
            System.out.println("invalid coast");
        }
    }


    public void printPlane()
    {
        System.out.printf("Model: %s, Country: %s, Year: %d, Hours: %d, IsMilitary: %s, Weight: %d," +
                "TopSpeed: %d, Seats: %d, Cost: %d",model,country,year,hours,isMilitary?"Yes":"No",weight,topSpeed,
                seats,coast);
        System.out.println();
    }
}
