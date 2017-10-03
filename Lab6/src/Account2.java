/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/



// line 42 "model.ump"
// line 70 "model.ump"
public class Account2
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account2 Attributes
  private int code;
  private String number;
  private String type;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account2(int aCode, String aNumber, String aType)
  {
    code = aCode;
    number = aNumber;
    type = aType;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCode(int aCode)
  {
    boolean wasSet = false;
    code = aCode;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumber(String aNumber)
  {
    boolean wasSet = false;
    number = aNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(String aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public int getCode()
  {
    return code;
  }

  public String getNumber()
  {
    return number;
  }

  public String getType()
  {
    return type;
  }

  public void delete()
  {}

  // line 49 "model.ump"
   private String gettype(){
    
  }

  // line 52 "model.ump"
   private String getnumber(){
    
  }

  // line 55 "model.ump"
   private int getcode(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "code" + ":" + getCode()+ "," +
            "number" + ":" + getNumber()+ "," +
            "type" + ":" + getType()+ "]";
  }
}