package main;

import model.Plane;
import service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {

        PlaneService planeService=new PlaneService();
        boolean menu=true;
        Scanner scanner =new Scanner(System.in);
        int comNumber=0;

        Plane plane1=planeService.createPlan();
        Plane plane2=planeService.createPlan();
        Plane plane3=planeService.createPlan();
        Plane[] planes=new Plane[]{plane1,plane2,plane3};




        while (menu)
        {
            System.out.println("Please enter number to call method");
            System.out.println("1. printIfMilitaryOrPrintOther");
            System.out.println("2. getNewestPlan");
            System.out.println("3. printCountryWhichPlaneHaveLessSeats");
            System.out.println("4. printAllNoneMilitaryPlanes");
            System.out.println("5. printMilitaryPlanesThatWereInAirFor100Hours");
            System.out.println("6. returnPlaneWithMinimalWeight");
            System.out.println("7. minimalCostPlaneInMilitaries");
            System.out.println("8. orderPlanesByYear");
            System.out.println("0. cancel");
            comNumber=scanner.nextInt();

            switch (comNumber)
            {
                case 0:{
                    menu=false;
                    break;
                }
                case 1:{
                    planeService.printIfMilitaryOrPrintOther(plane1);
                    break;
                }
                case 2:{
                    Plane newest=planeService.getNewestPlan(plane1,plane2);
                    newest.printPlane();
                    break;
                }
                case 3:{
                    planeService.printCountryWhichPlaneHaveLessSeats(plane1,plane2,plane3);
                    break;
                }
                case 4:{
                    planeService.printAllNoneMilitaryPlanes(planes);
                    break;
                }
                case 5:{
                    planeService.printMilitaryPlanesThatWereInAirFor100Hours(planes);
                    break;
                }
                case 6:{
                    Plane minCostPlane=planeService.returnPlaneWithMinimalWeight(planes);
                    minCostPlane.printPlane();
                    break;
                }
                case 7:{
                    Plane minP=planeService.minimalCostPlaneInMilitaries(planes);
                    minP.printPlane();
                    break;
                }
                case 8:{
                    planeService.orderPlanesByYear(planes);
                    break;
                }
            }

        }
    }
}
