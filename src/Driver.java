
public class Driver extends Person
{
    //instance variables
    private Car car;
    private String licenceID;
    
    //constructor
    public Driver(Car car, String licenceID, String name, String surname,String phone_number, int cash)
	{
        super(name,surname,phone_number,cash);   
        this.car = car;
        this.licenceID = licenceID;    
    }

    //methods
    public void setCar(Car car)
	{
        this.car = car;
    }

    public void setLicenseID(String licenceID)
	{
        this.licenseID = licenseID;
    }

    public Car getCar()
	{
        return this.car;
    }

    public String getLicenceID()
	{
        return  this.licenceID;
    }

    public String toString()
	{
        return super.toString() + " and I am a driver";
    }  
}