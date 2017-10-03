/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/



// line 22 "model.ump"
// line 65 "model.ump"
public class Customer2
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer2 Attributes
  private int id;
  private String address;
  private String name;
  private int number;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer2(int aId, String aAddress, String aName, int aNumber)
  {
    id = aId;
    address = aAddress;
    name = aName;
    number = aNumber;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber(int aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public String getAddress()
  {
    return address;
  }

  public String getName()
  {
    return name;
  }

  public int getNumber()
  {
    return number;
  }

  public void delete()
  {}

  // line 30 "model.ump"
   private int getnumber(){
    
  }

  // line 33 "model.ump"
   private String getname(){
    
  }

  // line 36 "model.ump"
   private String getaddress(){
    
  }

  // line 39 "model.ump"
   private int getid(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "address" + ":" + getAddress()+ "," +
            "name" + ":" + getName()+ "," +
            "number" + ":" + getNumber()+ "]";
  }
}