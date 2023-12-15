import java.util.List;
import java.util.ArrayList;

public class ArtMuseum {
  
  private String museumName;
  private ArrayList<Art> artsList;       //art database of museum
  private String[] namesList;   //possible art names for randomize
  private String[] artistList;  //possible artist names for randomize
  
  //constructor
  public ArtMuseum(String museumName) {
    this.museumName = museumName;
    artsList = new ArrayList<Art>();
    String[] tempNames = {"Mona Lisa", "The Starry Night", "The Persistence of Memory", "The Scream", 
      "The Last Supper", "Guernica", "Les Demoiselles d'Avignon", "The Kiss", "Girl with a Pearl Earring",
      "Water Lilies", "The Thinker", "The Birth of Venus", "The Garden of Earthly Delights",
      "The Creation of Adam", "The Night Watch", "American Gothic", "Whistler's Mother", "Campbell's Soup Cans",
      "Les Nymphéas", "Composition VIII", "Black Square", "Broadway Boogie Woogie", "No. 61 (Rust and Blue)",
      "Nighthawks", "The Dance", "The Great Wave off Kanagawa", "The Kiss", "The Sleeping Gypsy",
      "The Son of Man", "A Sunday Afternoon on the Island of La Grande Jatte", "The Treachery of Images",
      "Wanderer Above the Sea of Fog", "Bal du moulin de la Galette", "Blue Nude", "Les Saltimbanques",
      "The Persistence of Memory", "La Grande Odalisque", "The Raft of the Medusa", "The Night Cafe",
      "The Oath of the Horatii", "Composition VII", "The Arnolfini Portrait", "The Death of Marat",
      "The Birth of Tragedy", "The Anatomy Lesson of Dr. Nicolaes Tulp", "The Calling of St. Matthew",
      "The Ambassadors", "The Creation of the Sun, Moon, and Vegetation", "The Garden of Earthly Delights",
      "Impression, Sunrise", "At the Moulin Rouge", "The School of Athens", "The Raising of Lazarus",
      "Dora Maar au Chat", "Self-Portrait with Thorn Necklace and Hummingbird", "The Yellow Christ",
      "La Danseuse au Bouquet", "Le Pont Neuf", "The Card Players", "Portrait of Madame X", "The Swing",
      "The Fighting Temeraire", "The Birth of Venus", "The Nightingale's Nest", "The Sunflower",
      "Las Meninas", "The Triumph of Death", "The Starry Night", "The Birth of Adam", "The Potato Eaters",
      "The Storm on the Sea of Galilee", "Impression III (Concert)", "The Drunkenness of Noah",
      "The Anatomy Lesson of Dr. Tulp", "The Blue Boy", "Portrait of a Young Man", "Sunflowers",
      "The Return of the Prodigal Son", "The Death of Sardanapalus", "The Ghent Altarpiece",
      "The Madonna and Child", "The Four Horsemen of the Apocalypse", "The Painter and his Model",
      "The Treachery of Images", "The Crucifixion of Saint Peter", "The Music Lesson",
      "The Lady with the Unicorn", "The Tower of Babel", "The Old Guitarist", "The Dream",
      "The Descent from the Cross", "The Swing", "The Starry Night Over the Rhone", "The Hay Wagon",
      "The Ship of Fools", "The Tower of Blue Horses", "The Swing", "Blue Banjoon", "Happy Times", "Domineus"};
    namesList = tempNames;
    String[] tempArtists = {"Adrian Abramovic", "Salvador Irwin", "Sol Swoon", "Swoon Serra", "Cindy Sherman",
      "Jenny Wiley", "Jeff da Vinci", "Artemisia Buonarroti", "Willem Irwin", "Niki Banksy", "Cassatt Abramovic",
      "Jeff Pollock", "Hans Richter", "Camille Kahlo", "Lee Dali", "Ellsworth Koons", "Betye Pollock", 
      "Georgia Monet", "Yoko Klimt", "Marlene Judd", "Vincent Andre", "Richard Turrell", "Tracey Judd", 
      "Alma Walker", "Camille Gonzalez-Torres", "Camille van Rijn", "Berthe Buonarroti", "Cindy Flavin", 
      "Jackson Close", "Michelangelo de Lempicka", "Lorraine de Lempicka", "Yayoi Kandinsky", "Frida Buonarroti",
      "Salvador Flavin", "Georgia Walker", "Yayoi Jacobs", "Damien Swoon", "Kiki Swoon", "Pablo Kiefer", 
      "Lee Hepworth", "Alfred Hepworth", "Angelica Turrell", "Richard Kiefer", "Pablo Serra", "Kehinde Andre", 
      "Niki Turrell", "Marcel Jacobs", "Sofonisba Monet", "Angelica Judd", "Anselm Ono", "Jackson Mondrian", 
      "Ellsworth Kruger", "Henri Swoon", "Louise Swoon", "Richard Graffiti", "Wassily Kiefer", "Hans Lynch", 
      "Zinaida Andre", "Frida Kruger", "Alice Hirst", "Willem Richter", "Pablo Kandinsky", "Richard da Vinci", 
      "Zarina Dali", "Michelangelo Munch", "Georgia Ono", "Cassatt Ono", "Anselm Dali", "Alfred Mondrian", 
      "Lorraine Hepworth", "Zinaida Wiley", "Donald Richter", "Anselm Swoon", "Ellsworth Kahlo", "Jasper Kruger", 
      "Sol Irwin", "Edvard Richter", "Tamara Andre", "Joan Mondrian", "Pablo da Vinci", "JR de Lempicka", 
      "Yoko Gonzalez-Torres", "Kehinde Emin", "Helen Serra", "Franz Lynch", "Louise de Lempicka", "Keith Close", 
      "Jean-Michel Kiefer", "Jackson Richter", "Yoko Bourgeois", "Kara Close", "Donald Picasso", "Louise Dali", 
      "Shirin Gonzalez-Torres", "Gerhard Sultan", "Rembrandt Klimt", "Barbara Hepworth", "Frida Jacobs", 
      "Barbara Dali", "JR Weiwei"};
    artistList = tempArtists;
  }
  
  //adds Art to database
  public boolean add(Art art) {
    return artsList.add(art);
  }
  
  //sorts art in database based on given attribute in given direction
  public List<Art> sort(String attribute, int direction) {
    //attributes could b any field of Art class
    //sorts based on attribute - ascending if direction >= 0, descending if direction < 0
    if (attribute.equals("height"))
      artsList = mergeSort(artsList, 0);   //use sort mode 0
    else if (attribute.equals("price"))  
      artsList = mergeSort(artsList, 1);  //sort mode 1
    else if (attribute.equals("width"))
      artsList = mergeSort(artsList, 2);  //sort mode 2
    else if (attribute.equals("names")) {
      artsList = mergeSort(artsList, 3); //sort mode 3
      StringBuilder b = new StringBuilder();
      for (int x = 0; x < artsList.size(); x++) {
        b.append(artsList.get(x).getName() + ", ");
      }
    }
    else if (attribute.equals("artistName"))
      artsList = mergeSort(artsList, 4); //sort mode 4
    
    //reverse order if direction <0
    if (direction < 0) {
      ArrayList<Art> temp = new ArrayList<Art>();     //temp holds reversed array
      for (int i = 0; i < artsList.size(); i++)
        temp.add(artsList.get(artsList.size() - 1 - i));
      artsList = temp;    //set arts list to temp
    }
    return artsList;
  }
  
  //Helper method - mergeSort
  private ArrayList<Art> mergeSort(ArrayList<Art> arr, int sortMode) {
    if (arr.size() <= 1)   //base case
      return arr;
    ArrayList<Art> leftArr = new ArrayList<Art>();   //holds left side of array  
    ArrayList<Art> rightArr = new ArrayList<Art>();  //holds right side of array
    split(arr, leftArr, rightArr);
    //recursive call left side of array
    leftArr = mergeSort(leftArr, sortMode);
    //recursive call right side of array
    rightArr = mergeSort(rightArr, sortMode);
    arr = merge(leftArr, rightArr, arr, sortMode);    //set array equal to merge of left and right
    return arr;
  }
  
  //Helper method for mergeSort - split
  private void split(ArrayList<Art> arr, ArrayList<Art> leftArr, ArrayList<Art> rightArr) {
    int leftArrSize = arr.size() - arr.size()/2; //target size left half
    int rightArrSize = arr.size()/2;             //target size right half
    //copy left side into left array
    for (int i = 0; i < leftArrSize; i++) {
      leftArr.add(i,arr.get(i));
    }
    //copy right side into right array
    for (int i = 0; i < rightArrSize; i++) {
      rightArr.add(i, arr.get(i + leftArr.size()));
    }
  }
  
  //Helper method for mergeSort - merge
  private ArrayList<Art> merge(ArrayList<Art> arr1, ArrayList<Art> arr2, 
                               ArrayList<Art> outputArray, int sortMode) {
    ArrayList<Art> mergedArray = new ArrayList<Art>();
    int i = 0;    //index arr1
    int j = 0;    //index arr2
    int k = 0;    //index mergedArray
    while (i < arr1.size() && j < arr2.size()) {
      if ( arr1.get(i).compare(arr2.get(j), sortMode) <= 0) {  //element in arr1 is smaller
        mergedArray.add(k, arr1.get(i));
        i++;
      }
      else {                                 //element in arr2 is smaller
        mergedArray.add(k, arr2.get(j));
        j++;
      }
      k++;
    }
    //if arr1 not fully copied
    while (i < arr1.size()) {
      mergedArray.add(k, arr1.get(i));
      i++;
      k++;
    }
    //if arr2 not fully copied
    while (j < arr2.size()) {
      mergedArray.add(k, arr2.get(j));
      j++;
      k++;
    }
    return outputArray = mergedArray;
  }
  
  //return all arts of given artistName
  public List<Art> findArts(String artistName) {
    ArrayList<Art> returnList = new ArrayList<Art>();
    for (int i = 0; i < artsList.size(); i++) {
      if (artsList.get(i).getArtistName().equals(artistName))
        returnList.add(artsList.get(i));
    }
    return returnList;
  }
  
  //randomly generates list of n arts
  public List<Art> randomizeArts(int n) {
    ArrayList<Art> randomArts =  new ArrayList<Art>();
    for (int i = 0; i < n; i++) {
      int height = (int)(Math.random()*50) + 5;  //random height from 5 - 55
      int width = (int)(Math.random()*50) + 5;   //random width from 5 - 55
      int price = (int)(Math.random()*100 + 5) * (int)Math.pow(10, (int)(Math.random()*6 + 1)); //random price
      String name = namesList[(int)(Math.random()*namesList.length)];
      String artistName = artistList[(int)(Math.random()*namesList.length)];
      randomArts.add(new Art(height, price, width, name, artistName));
    }
    return randomArts;
  }
  
  //return list with each fifth sorted according to different parameter
  public List<Art> randomSort(List<Art> arts) {
    int groupSize = arts.size() / 5;     //length of each group
    if (groupSize == 0)                  //for if list is less than 5 long
      groupSize = 1;
    //ArrayLists to hold portions of list
    ArrayList<Art> heightList = new ArrayList<Art>();
    ArrayList<Art> priceList = new ArrayList<Art>();
    ArrayList<Art> widthList = new ArrayList<Art>();
    ArrayList<Art> nameList = new ArrayList<Art>();
    ArrayList<Art> artistNameList = new ArrayList<Art>();
    ArrayList<Art> returnList = new ArrayList<Art>();
    
    int i = 0;      //index through list
    //generate height list
    while (i < groupSize) {
      if (i < arts.size())
        heightList.add(arts.get(i));
      i++;
    }
    heightList = mergeSort(heightList, 0); //use sort mode 0
    returnList.addAll(heightList);         //concatenate to return list
    //generate price list
    while (i < 2*groupSize) {
      if (i < arts.size())
        priceList.add(arts.get(i));
      i++;
    }
    priceList = mergeSort(priceList, 1);  //use sort mode 1
    returnList.addAll(priceList);         //concatenate to return list
    //generate width list
    while (i < 3*groupSize) {
      if (i < arts.size())
        widthList.add(arts.get(i));
      i++;
    }
    widthList = mergeSort(widthList, 2);  //use sort mode 2
    returnList.addAll(widthList);         //concatenate to return list
    //generate name list
    while (i < 4*groupSize) {
      if (i < arts.size())
        nameList.add(arts.get(i));
      i++;
    }
    nameList = mergeSort(nameList, 3);   //use sort mode 
    returnList.addAll(nameList);         //concatenate to return list
    //generate artist name list
    while (i < arts.size()) {             //append all remaining arts
      artistNameList.add(arts.get(i));
      i++;
    }
    artistNameList = mergeSort(artistNameList, 4); //use sort mode 4
    returnList.addAll(artistNameList);             //concatenate to return list
    
    return returnList;
  }
}