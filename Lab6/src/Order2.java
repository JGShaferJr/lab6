/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/



// line 2 "model.ump"
// line 60 "model.ump"
public class Order2
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order2 Attributes
  private double total;
  private String date;
  private double tax;
  private String items;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order2(double aTotal, String aDate, double aTax, String aItems)
  {
    total = aTotal;
    date = aDate;
    tax = aTax;
    items = aItems;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTotal(double aTotal)
  {
    boolean wasSet = false;
    total = aTotal;
    wasSet = true;
    return wasSet;
  }

  public boolean setDate(String aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setTax(double aTax)
  {
    boolean wasSet = false;
    tax = aTax;
    wasSet = true;
    return wasSet;
  }

  public boolean setItems(String aItems)
  {
    boolean wasSet = false;
    items = aItems;
    wasSet = true;
    return wasSet;
  }

  public double getTotal()
  {
    return total;
  }

  public String getDate()
  {
    return date;
  }

  public double getTax()
  {
    return tax;
  }

  public String getItems()
  {
    return items;
  }

  public void delete()
  {}

  // line 10 "model.ump"
   private String getdate(){
    
  }

  // line 13 "model.ump"
   private double gettax(){
    
  }

  // line 16 "model.ump"
   private double gettotal(){
    
  }

  // line 19 "model.ump"
   private String getitems(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "total" + ":" + getTotal()+ "," +
            "date" + ":" + getDate()+ "," +
            "tax" + ":" + getTax()+ "," +
            "items" + ":" + getItems()+ "]";
  }
}