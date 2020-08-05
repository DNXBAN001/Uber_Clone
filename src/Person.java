
public class Person
{
    //instance variables: attributes
    private String name;
    private String surname;
    private String phoneNumber;
    private double cash;

    //constructor
    public Person(String name, String surname, String phoneNumber, double cash) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.cash = cash;
    }

    //methods: behaviour
    
    //setters
    public void setName(String name)
	{
        this.name = name;
    }

    public void setSurname(String surname)
	{
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber)
	{
        this.phoneNumber = phoneNumber;
    }

    public void setCash(double cash)
	{
        this.cash = cash;
    }

    public String getName()
	{
        return this.name;
    }

    public String getSurname()
	{
        return this.surname;
    }
    
    public String getPhoneNumber()
	{
        return this.phone_number;
    }
    
    public double getCash()
	{
        return this.cash;
    }

    public String toString()
	{
        return this.name + " " + this.surname;
    }
}