/*
 * Represents a candy that can be sold at a 7/11
 * Candy is a type of product
 */
public class Soda extends Product  {

  private boolean isBubbly;   // Whether or not a candy has chocolate in it

  /*
   * Sets chocolate to true
   */
  public Soda() {
    isBubbly = false;
  }

  /*
   * Sets the brand to the specified brand, the price to the
   * specified price, and isBubbly to the specified status
   */
  public Soda(String brand, double price, boolean sale, boolean isBubbly) {
    super(brand, price, sale);
    this.isBubbly = isBubbly;
  }

  /*
   * Returns the value assigned to isBubbly
   */
  public boolean getIsBubbly() {
    return isBubbly;
  }

  /*
   * Sets isChewy to newIsBubbly
   */
  public void setIBubbly(boolean newIsBubbly) {
    isBubbly = newIsBubbly;
  }

  
  public String toString() {
    return super.toString() + "\n" + " Is it carbonated? " + isBubbly;
  }
}