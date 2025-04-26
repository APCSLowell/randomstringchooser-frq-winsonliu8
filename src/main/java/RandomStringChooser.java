import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  public class RandomStringChooser{
    public ArrayList<String>words; 
    public RandomStringChooser(wordArray{}){
      words = new <String> wordArray; 
      for (int i = 0; i < wordArray.size(); i++)
        words.add(i); 
    }
    public string getNext(){
      if (words.size() == 0)
        return "NONE"; 
    }
    else{
    int i = (int)(Math.random () * words.size()); 
    return words.get(i); 
    words.remove(i); 
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
