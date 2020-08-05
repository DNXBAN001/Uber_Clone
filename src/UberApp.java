import java.util.*;

public class UberApp
{
    public static void main(String[] args)
	{
        System.out.println("Welcome to Uber App");

        Passenger sima = new Passenger("sima@gmail.com", "Simamkele", "Danxa","0605062383", 5000);        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your current starting location");
        String startPoint = sc.nextLine();//get the pick up location

        System.out.println("Please enter your final destination location");
        String endPoint = sc.nextLine();//get the end location

        System.out.println("Please vehicle of your choice, either XL or X");
        String vehicleType = sc.nextLine();//get the vehicle type
        
        System.out.println("Starting Point: "+startPoint);
        System.out.println("End Point: "+endPoint);
        System.out.print("Vehicle Type: "+vehicleType);

        UberRide uberRide = new UberRide(startPoint, endPoint, lonwabo);

        Driver assignedDriver = uberRide.assignDriver();

        System.out.println("\nCalculating cost...");
        uberRide.calculateCost(startPoint, endPoint);
        
        System.out.println("\nFinding you a driver...");
        System.out.println("Assigned driver: " + assignedDriver.getName() + " " + assignedDriver.getSurname());
        System.out.println("Assigned car: " + assignedDriver.getCar());
        
        System.out.println("\nYour ride is complete. Processing payment...");
        uberRide.completePayment(assignedDriver, sima);
    }

}