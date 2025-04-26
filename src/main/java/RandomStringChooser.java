import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
 private ArrayList <String> words;
  //change array of strings "a" to arraylist of words
 public RandomStringChooser(String[] a)
 {
 words = new ArrayList<String>();
 for (int i = 0; i < a.length; i++){ 
   words.add(a[i]); //a[i] is for index of array
 }
 }
 public String getNext()
 {
 if (words.size() == 0)
   return "NONE"; 
 int i = (int)(Math.random() * words.size());
 return words.remove(i); 
 }
 
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
