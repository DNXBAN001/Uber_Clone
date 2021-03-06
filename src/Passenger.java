public class Passenger extends Person
{
    //instance variables
    private String email;

    //constructor
    public Passenger(String email, String name, String surname,String phoneNumber, int cash)
	{
        super(name,surname,phoneNumber, cash);
        this.email = email;
    }

    //methods
    public void setEmail(String email)
	{
        this.email  = email;
    }

    public String getEmail()
	{
        return this.email;
    }
	
    public String toString()
	{
        return super.toString() + " and I am a passenger";
    }
}