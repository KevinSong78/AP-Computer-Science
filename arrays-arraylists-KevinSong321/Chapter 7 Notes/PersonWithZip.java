public class PersonWithZip
{
    String firstName;
    String lastName;
    int zipCode;
    public PersonWithZip(String fname, String lname, int code)
    {
        firstName = fname;
        lastName = lname;
        zipCode = code;
    }
    public int getZip()
    {
        return zipCode;
    }
    public String toString()
    {
        String info = ("Name: " + firstName + " " + lastName + "Zip code: " + zipCode);
        return info;
    }
}
