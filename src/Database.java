import java.io.*;
import java.util.*;

public class Database
{
    //attributes
    private String filePath = "drivers.csv";
    private int numberOfXL;
    private int numberOfX;
    private ArrayList<Driver> drivers = new ArrayList<>();

    //constructor
    public Database()
	{
		
	}

    public void printArray(Driver[] drivers)
	{
        System.out.print("[ ");
        for(Driver d: drivers)
		{
            System.out.print(d);
            System.out.print(",");
            System.out.println("");
        }
        System.out.print(" ]");
    }
    //methods
    public void getDriversArray()
	{
        try 
		{
            BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
            String row = null;
            int i = 0;
            while ((row = csvReader.readLine()) != null)
			{
                if(i > 0) 
				{
                    String[] data = row.split(",");
					//create our car object from the csv file content
                    Car car = new Car(data[5], data[6], data[7], data[8]);
					//create our driver object from the csv file content
                    Driver driver = new Driver(car, data[0], data[1], data[2], data[3], Integer.parseInt(data[4]));

                    if(data[8].equals("X"))
                        this.numberOfX++;
                    
                    if(data[8].equals("XL"))
                        this.numberOfXL++;
                    
                    this.drivers.add(driver);
                }
                i++;
            }
            csvReader.close();
        }
        catch(Exception e)
		{
            System.out.println("An error occurred while trying to read the file");
        }
    }

    public Driver[] getArrayByVehicleType(String vehicleType)
	{
        Driver[] XDrivers = new Driver[this.numberOfX];
        Driver[] XLDrivers = new Driver[this.numberOfXL];

        int xindex = 0;
        int xlindex = 0;
        for(int i = 0; i < this.drivers.size(); i++)
		{
            if(this.drivers.get(i).getCar().getVehicleType().equals("X"))
			{
                XDrivers[xindex] = this.drivers.get(i);
                xindex++;
            }
            if(this.drivers.get(i).getCar().getVehicleType().equals("XL"))
			{
                XLDrivers[xlindex] = this.drivers.get(i);
                xlindex++;
            }
        }

        if(vehicleType.equals("X"))
            return Xdrivers;

        return XLdrivers;
    }
}