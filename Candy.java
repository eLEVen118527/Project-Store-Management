/*
 * Represents a candy that can be sold at a 7/11
 * Candy is a type of product
 */
public class Candy extends Product  {

  private boolean isChocolate;   // Whether or not a candy has chocolate in it

  /*
   * Sets chocolate to true
   */
  public Candy() {
    isChocolate = false;
  }

  /*
   * Sets the brand to the specified brand, the price to the
   * specified price, and isChocolate to the specified status
   */
  public Candy(String brand, double price, boolean sale, boolean isChocolate) {
    super(brand, price,sale);
    this.isChocolate = isChocolate;
  }

  /*
   * Returns the value assigned to isChocolate
   */
  public boolean getIsChocolate() {
    return isChocolate;
  }

  /*
   * Sets isChewy to newIsChocolate
   */
  public void setIsChocolate(boolean newIsChocolate) {
    isChocolate = newIsChocolate;
  }

  
  public String toString() {
    return super.toString() + "\n" + " Does it have chocolate in it? " + isChocolate;
  }
  

  

}