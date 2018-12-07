import java.util.ArrayList;
import java.util.List;

public class Word{
    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" was swapped
     *  - letters were swapped at most one
     */
    public static String scrambleWord(String word)
    {
       for(i=0;i<word.length();i++){
           if（）{
              a=word.substring(a.length,a.length+1)+word.substring(a.length+2);
            }
        return a;
    }
        
       Modified
       {
           String temp= " ";
           for(int i=0;i<word.length()-1;i++){
               String a=word.substring(i,i+1);
               String b=word.substring(i+1,i+2);
               if(a.equals("A")&&!b.equals("A")){
                   temp+=b+a;
                   i++
               }else{
                  temp+=a;
               }
           }
               return temp;
           }
    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was 
     *    before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
      for(i=0;i<wordList.size();i++){ 
      String s= scrambleWord(wordList.get(i));
      if(wordList.get(i).equals(s)){
           wordList.remove(i);
      }
    }

    public static void main(String[] args)
    {
        
    }
}
