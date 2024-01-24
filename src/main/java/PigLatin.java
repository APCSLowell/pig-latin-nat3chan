import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

 class PigLatin {
    
    public void tester() {
        //String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
      System.out.println("there are " + lines.length + " lines");
      for (int i = 0 ; i < lines.length; i++) {
          System.out.println(pigLatin(lines[i]));
      }
    }
public int findFirstVowel(String word){
    for(int i = 0; i < word.length(); i++)
       if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || 
          word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
      return i;
  return -1;
}

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        if(findFirstVowel(sWord) > -1){
         if(findFirstVowel(sWord)==0){return sWord.substring(findFirstVowel(sWord),sWord.length())+sWord.substring(0,findFirstVowel(sWord))+"way";}
         if(sWord.substring(0,2).equals(qu)){return sWord.substring(2,sWord.length())+"quay";}
        return sWord.substring(findFirstVowel(sWord),sWord.length())+sWord.substring(0,findFirstVowel(sWord))+"ay";}
      if(findFirstVowel(sWord) == -1) {
        return sWord + "ay";
      }
      else {
    return "ERROR!";
      }
    }
}//end PigLatin class
