/*
 * Represents a product found at a 7/11
 */
public class Product{

  private String brand;    // The brand of a Product
  private double price;     // The price of a Product
  public boolean sale;     // the product on sale
  /*
   * Sets product to "not available" , price to 0.00 , and sale set to false.
   */
  public Product() {
    this("not available",0.00,false);
  }

  /*
   * Sets brand to the specified brand and
   * price to the specified price
   */
  public Product(String brand, double price, boolean sale) {
    this.brand = brand;
    this.price = price;
    this.sale = sale;
  }

  /*
   * Returns the value assigned to brand
   */
  public String getbrand() {
    return brand;
  }

  /*
   * Returns the value assigned to price
   */
  public double getPrice() {
    return price;
  }
    public boolean getSale() {
    return sale;
    }
  /*
   * Sets brand to newbrand
   */
  public void setBrand(String newBrand) {
    brand = newBrand;
  }
 public void setSale(boolean newSale) {
    sale = newSale;
 }
  /*
   * Sets price to newPrice
   */
  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }
  public String toString() {
    return " Your product: " + brand + "\n" + " Price: " + price + "\n" + " Is it on Sale? " + sale;
  }
}