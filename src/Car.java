public class Car implements Vehicle 
{
    //instance variables
    private String numberPlate;
    private String color;
    private String model;
    private String type;
    private double base_rate;

    //constructor
    public Car(String numberPlate, String color, String model, String type)
	{
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) 
            this.base_rate = 13.00;
        else
           this.base_rate = 10.00;
    }

    //methods
    public String getNumberPlate()
	{
        return this.numberPlate;
    }

    public double getBaseRate()
	{
        return this.base_rate;
    }

    public String getColor()
	{
        return this.color;
    }
    public String getModel()
	{
        return this.model;
    }

    public String getVehicleType()
	{
        return this.type;
    }

    public String toString()
	{
        return this.model + " car of " + this.color + " color, with number plate: " + this.numberPlate;
    }
}