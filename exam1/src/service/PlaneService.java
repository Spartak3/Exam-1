package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {

    //task 1
    public void printIfMilitaryOrPrintOther(Plane plane)
    {
        System.out.println(plane.isMilitary()?"Coast: "+plane.getCoast()+",TopSpeed: "
                +plane.getTopSpeed():"Model: "+plane.getModel()+",Country:  "+plane.getCountry());
    }

    //task 2
    public Plane getNewestPlan(Plane p1,Plane p2){
        return p1.getYear()>=p2.getYear()?p1:p2;
    }

    //task -3
    public void printCountryWhichPlaneHaveLessSeats(Plane p1,Plane p2,Plane p3)
    {

        Plane smallest=p1;
        if(smallest.getSeats()>p2.getSeats())
            smallest=p2;
        if(smallest.getSeats()>p3.getSeats())
            smallest=p3;

        System.out.println(smallest.getCountry());
    }

    //task 4
    public void printAllNoneMilitaryPlanes(Plane[] planes)
    {
        for (Plane p:planes) {
            if(!p.isMilitary()){
                p.printPlane();
            }
        }
    }

    //task 5
    public void printMilitaryPlanesThatWereInAirFor100Hours(Plane[] planes){
        for (Plane p:planes)
        {
            if(p.isMilitary() &&p.getHours()>=100){
                p.printPlane();
            }
        }
    }

    //task 6
    public Plane returnPlaneWithMinimalWeight(Plane[] planes){
        Plane minimal=planes[0];
        for (int i = 1; i < planes.length; i++) {
            if(planes[i].getWeight()<=minimal.getWeight()){
                minimal=planes[i];
            }
        }
        return minimal;
    }



    //task 7
    public Plane minimalCostPlaneInMilitaries(Plane[] planes)
    {
        Plane minimal=null;
        for (int i = 0; i < planes.length; i++) {
            if(planes[i].isMilitary())
            {
                if(minimal==null){
                    minimal=planes[i];
                }
                else if(minimal.getCoast()>planes[i].getCoast()){
                    minimal=planes[i];
                }
            }
        }
        return minimal;
    }


    //task 8
    public void orderPlanesByYear(Plane[] planes)
    {
        int counter=0;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 0; j < planes.length-1-counter; j++) {
                if(planes[j].getYear()>=planes[j+1].getYear()){
                    Plane tmp=planes[j];
                    planes[j]=planes[j+1];
                    planes[j+1]=tmp;
                }
            }
        }
        for (Plane p:planes)
        {
            p.printPlane();
        }
    }



    public Plane createPlan()
    {
        Scanner scanner=new Scanner(System.in);
        String model,country;
        int year,hours,weight,topSpeed,seats,cost;
        boolean isMilitary;
        System.out.println("Enter model");
        model=scanner.next();
        System.out.println("Enter country");
        country=scanner.next();
        System.out.println("Enter year");
        year=scanner.nextInt();
        System.out.println("Enter hours");
        hours=scanner.nextInt();
        System.out.println("Enter weight");
        weight=scanner.nextInt();
        System.out.println("Enter topSpeed");
        topSpeed=scanner.nextInt();
        System.out.println("Enter seats");
        seats=scanner.nextInt();
        System.out.println("Enter cost");
        cost=scanner.nextInt();
        System.out.println("Enter isMilitary (y/n)");
        isMilitary=scanner.next().charAt(0)=='y';

        Plane plane=new Plane(model,country,year);
        plane.setCoast(cost);
        plane.setHours(hours);
        plane.setMilitary(isMilitary);
        plane.setWeight(weight);
        plane.setSeats(seats);
        plane.setTopSpeed(topSpeed);

        return plane;

    }











}
