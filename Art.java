public class Art {
  
  //fields
  private int height;
  private int price;
  private int width;
  private String name;
 // private double nameAlphaCode;        //place of field in alphabetical order
  private String artistName;
 // private double artistNameAlphaCode;  //place of field in alphabetical order
  
  //has compareMode field that dictates what to order by
//  private int compareMode;  -uneccessary - can pass compare mode in without field
  //has compare method that changes based on compareMode field
  
  //constructor
  public Art(int height, int price, int width, String name, String artistName) {
    this.height = height;
    this.price = price;
    this.width = width;
    this.name = name;
    this.artistName = artistName;
  }
  
  //helper method to compare two Arts based on given attribute
  public int compare(Art a, int compareMode){ //NOTE EVERY TIME CALL COMPARE PASS IN COMPARE MODE
    if (compareMode <= 0) { //compare on height 
      return (getHeight() - a.getHeight());
    }
    else if (compareMode == 1) {   //compare on price
      return (getPrice() - a.getPrice());
    }
    else if (compareMode == 2) {   //compare on width
      return (getWidth() - a.getWidth());
    }
    else if (compareMode == 3) { //compare on name
      return (getName().compareTo(a.getName()));  //greater if first in alphabet
    }
    else { //compare on artists name
      return (getArtistName().compareTo(a.getArtistName())); //greater if first in alphabet
    }
  }
  //returns height
  public int getHeight() {
    return this.height;
  }
  
  //returns price
  public int getPrice() {
    return this.price;
  }
  
  //returns width
  public int getWidth() {
    return this.width;
  }
  
  //returns name
  public String getName() {
    return this.name;
  }
  
  //returns artist name
  public String getArtistName() {
    return this.artistName;
  }
  
  
  //changes value of height to input
  public void setHeight(int height) {
    this.height = height;
  }
  
  //changes value of price to input
  public void setPrice(int price) {
    this.price = price;
  }
  
  //changes value of width to input
  public void setWidth(int width) {
    this.width = width;
  }
  
  //changes value of name to input
  public void setName(String name) {
    this.name = name;
  }
  
  //changes value of artistName to input
  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }
}