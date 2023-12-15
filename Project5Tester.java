import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class Project5Tester {
  //Tests for ArtMuseum class
  
  //test add
  @Test
  public void testAdd() {
    ArtMuseum muse = new ArtMuseum("MOCA");
    assertEquals(true, muse.add(new Art(1,1,1,"1","1")));
  }
  //test sort
  @Test
  public void testSort() {
    ArtMuseum muse = new ArtMuseum("MOCA");
    Art a1 = new Art(12,15,22,"beauty","bob");
    Art a2 = new Art(45, 100000, 1, "imp", "andy");
    Art a3 = new Art(3, 400, 15, "collage", "anderson");
    //test database length 0
    assertEquals(true, muse.sort("height", 0).isEmpty());
    //test database length 1
    muse.add(a1);
    assertEquals(a1, muse.sort("height", 0).get(0));
    //test sort by height
    muse.add(a2);
    muse.add(a3);
    assertEquals(a3, muse.sort("height", 0).get(0));
    assertEquals(a1, muse.sort("height", 0).get(1));
    assertEquals(a2, muse.sort("height", 0).get(2));
    //test sort by height reverse
    assertEquals(a2, muse.sort("height", -1).get(0));
    assertEquals(a1, muse.sort("height", -1).get(1));
    assertEquals(a3, muse.sort("height", -1).get(2));
    //test sort by price
    assertEquals(a1, muse.sort("price", 0).get(0));
    assertEquals(a3, muse.sort("price", 0).get(1));
    assertEquals(a2, muse.sort("price", 0).get(2));
    //test sort by price reverse
    assertEquals(a2, muse.sort("price", -1).get(0));
    assertEquals(a3, muse.sort("price", -1).get(1));
    assertEquals(a1, muse.sort("price", -1).get(2));
    //test sort by width
    assertEquals(a2, muse.sort("width", 0).get(0));
    assertEquals(a3, muse.sort("width", 0).get(1));
    assertEquals(a1, muse.sort("width", 0).get(2));
    //test sort by width reverse
    assertEquals(a1, muse.sort("width", -1).get(0));
    assertEquals(a3, muse.sort("width", -1).get(1));
    assertEquals(a2, muse.sort("width", -1).get(2));
    //test sort by name
    assertEquals(a1, muse.sort("names", 0).get(0));
    assertEquals(a3, muse.sort("names", 0).get(1));
    assertEquals(a2, muse.sort("names", 0).get(2));
    //test sort by name reverse
    assertEquals(a2, muse.sort("names", -1).get(0));
    assertEquals(a3, muse.sort("names", -1).get(1));
    assertEquals(a1, muse.sort("names", -1).get(2));
    //test sort by artist name
    assertEquals(a3, muse.sort("artistName", 0).get(0));
    assertEquals(a2, muse.sort("artistName", 0).get(1));
    assertEquals(a1, muse.sort("artistName", 0).get(2));
    //test sort by artist name reverse
    assertEquals(a1, muse.sort("artistName", -1).get(0));
    assertEquals(a2, muse.sort("artistName", -1).get(1));
    assertEquals(a3, muse.sort("artistName", -1).get(2));
  }
  
  //test findArts
  @Test
  public void testFindArts() {
    ArtMuseum muse = new ArtMuseum("MOCA");
    Art a1 = new Art(12,15,22,"beauty","bob");
    muse.add(a1);
    Art a2 = new Art(45, 100000, 1, "imp", "andy");
    muse.add(a2);
    Art a3 = new Art(42, 42, 42, "aim for ground and miss", "hitchhiker");
    muse.add(a3);
    Art a4 = new Art(3, 400, 15, "collage", "cooper");
    muse.add(a4);
    Art a5 = new Art(42, 42, 42, "answer to life the universe and everything", "hitchhiker");
    muse.add(a5);
    Art a6 = new Art(53, 24000, 20, "nasy", "nosey");
    muse.add(a6);
    Art a7 = new Art(42, 42, 42, "hamster", "hitchhiker");
    muse.add(a7);
    Art a8 = new Art(59, 1, 22, "youth", "Genvieve");
    muse.add(a8);
    //test 0
    assertEquals(true, muse.findArts("Leonardo").isEmpty());
    //test one
    assertEquals(a2, muse.findArts("andy").get(0));
    //test many
     assertEquals(a3, muse.findArts("hitchhiker").get(0));
     assertEquals(a5, muse.findArts("hitchhiker").get(1));
     assertEquals(a7, muse.findArts("hitchhiker").get(2));
    //test front of database list
    assertEquals(a1, muse.findArts("bob").get(0));
    //test middle database list
    assertEquals(a4, muse.findArts("cooper").get(0));
    //test end of database list
    assertEquals(a8, muse.findArts("Genvieve").get(0));
  }
  
  //test randomizeArts
  @Test
  public void testRandomizeArts() {
    ArtMuseum muse = new ArtMuseum("MOCA");
    //test n <=0
    assertEquals(true, muse.randomizeArts(0).isEmpty());
    //test n == 1
    assertEquals(1, muse.randomizeArts(1).size());
    //test n > 1
    assertEquals(5, muse.randomizeArts(5).size());
    //test that all art fields initialzied correctly
    assertEquals(true, muse.randomizeArts(1).get(0).getHeight() > 0);
    assertEquals(true, muse.randomizeArts(1).get(0).getPrice() > 0);
    assertEquals(true, muse.randomizeArts(1).get(0).getWidth() > 0);
    assertEquals(true, muse.randomizeArts(1).get(0).getName() instanceof String);
    assertEquals(true, muse.randomizeArts(1).get(0).getArtistName() instanceof String);
  }
  
  //test randomSort
  @Test
  public void testRandomSort() {
    ArtMuseum muse = new ArtMuseum("MOCA");
    ArrayList<Art> list = new ArrayList<Art>();
    Art a1 = new Art(12,15,21,"beauty","bob");  
    Art a2 = new Art(45, 100000, 1, "imp", "andy");
    Art a3 = new Art(40, 40, 40, "aim for ground and miss", "hitcher");
    Art a4 = new Art(3, 400, 15, "collage", "cooper");
    Art a5 = new Art(41, 41, 41, "answer to life the universe and everything", "hitchhiker");
    Art a6 = new Art(53, 24000, 20, "nasy", "nosey");
    Art a7 = new Art(42, 42, 42, "hamster", "ridealong");
    Art a8 = new Art(59, 1, 22, "youth", "Genvieve");
    Art a9 = new Art(13,21, 2020, "death", "badboy");
    Art a10 = new Art(6, 7, 6, "failed", "effeff");
    Art a11 = new Art(99, 99, 99, "ninetynine", "carpie");
    //test empty list
    assertEquals(true, muse.randomSort(list).isEmpty());
    //test list length < 5
    list.add(a1);
    list.add(a2);
    list.add(a3);
    assertEquals(a1, muse.randomSort(list).get(0));
    assertEquals(a2, muse.randomSort(list).get(1));
    assertEquals(a3, muse.randomSort(list).get(2));
    //test list length multiple of 5
    list.add(a4);
    list.add(a5);
    list.add(a6);
    list.add(a7);
    list.add(a8);
    list.add(a9);
    list.add(a10);
    assertEquals(a1, muse.randomSort(list).get(0));
    assertEquals(a2, muse.randomSort(list).get(1));
    assertEquals(a3, muse.randomSort(list).get(2));
    assertEquals(a4, muse.randomSort(list).get(3));
    assertEquals(a6, muse.randomSort(list).get(4));
    assertEquals(a5, muse.randomSort(list).get(5));
    assertEquals(a7, muse.randomSort(list).get(6));
    assertEquals(a8, muse.randomSort(list).get(7));
    assertEquals(a9, muse.randomSort(list).get(8));
    assertEquals(a10, muse.randomSort(list).get(9));
    //test list length > 5 and non-multiple of 5
    list.add(a11);
    assertEquals(a1, muse.randomSort(list).get(0));
    assertEquals(a2, muse.randomSort(list).get(1));
    assertEquals(a3, muse.randomSort(list).get(2));
    assertEquals(a4, muse.randomSort(list).get(3));
    assertEquals(a6, muse.randomSort(list).get(4));
    assertEquals(a5, muse.randomSort(list).get(5));
    assertEquals(a7, muse.randomSort(list).get(6));
    assertEquals(a8, muse.randomSort(list).get(7));
    assertEquals(a9, muse.randomSort(list).get(8));
    assertEquals(a11, muse.randomSort(list).get(9));
    assertEquals(a10, muse.randomSort(list).get(10));
  }
  
  //Tests for Art class
  
  //test getHeight
  @Test
  public void testGetHeight() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    assertEquals(12, a1.getHeight());
  }
  
  //test getPrice
  @Test
  public void testGetPrice() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    assertEquals(15, a1.getPrice());
  }
   
  //test getWidth
  @Test
  public void testGetWidth() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    assertEquals(21, a1.getWidth());
  }
   
  //test getName
  @Test
  public void testGetName() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    assertEquals("beauty", a1.getName());
  }
   
  //testGetArtistName
  @Test
  public void testGetArtistName() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    assertEquals("bob", a1.getArtistName());
  }
  
  //test setHeight
  @Test
  public void testSetHeight() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    a1.setHeight(2);
    assertEquals(2, a1.getHeight());
  }
  
  //test setPrice
  @Test
  public void testSetPrice() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    a1.setPrice(2);
    assertEquals(2, a1.getPrice());
  }
  
  //test setWidth
  @Test
  public void testSetWidth() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    a1.setWidth(2);
    assertEquals(2, a1.getWidth());
  }
  
  //test setName
  @Test
  public void testSetName() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    a1.setName("unbeauty");
    assertEquals("unbeauty", a1.getName());
  }
  //test setArtistName
  @Test
  public void testSetArtistName() {
    Art a1 = new Art(12,15,21,"beauty","bob"); 
    a1.setArtistName("notbob");
    assertEquals("notbob", a1.getArtistName());
  }
  
  //test comapare - helper method not specified by project instructions
  @Test
  public void testCompare() {
    Art a1 = new Art(12,15,21,"beauty","bob");
    Art a2 = new Art(59, 1, 22, "youth", "genvieve");
    //test compare height
    assertEquals(true, a1.compare(a2, 0) < 0);
    assertEquals(true, a2.compare(a1, 0) > 0);
    //test compare price
    assertEquals(true, a1.compare(a2, 1) > 0);
    assertEquals(true, a2.compare(a1, 1) < 0);
    //test compare width
    assertEquals(true, a1.compare(a2, 2) < 0);
    assertEquals(true, a2.compare(a1, 2) > 0);
    //test compare name
    assertEquals(true, a1.compare(a2, 3) < 0);
    assertEquals(true, a2.compare(a1, 3) > 0);
    //test compare artist name
    assertEquals(true, a1.compare(a2, 4) < 0);
    assertEquals(true, a2.compare(a1, 4) > 0);
  } 
}