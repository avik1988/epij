public class Reversal {

  public char[] wordReversal(char[] word, int start, int end) {
   while(start<end) {
     char tmp = word[start];
     word[start] = word[end];
     word[end] = tmp;
     start++;
     end--;
   }

   return word;
  }


  public String reverseString(String input) {
    char[] charArray = input.toCharArray();

    // Reverse whole string
    char[] reverseArray = wordReversal(charArray, 0, charArray.length - 1);
    int wordStart = 0;
    int wordEnd = 0;

    while (wordStart < reverseArray.length) {
      // Ignore all the white spaces
      while (wordStart < reverseArray.length && reverseArray[wordStart] == ' ') {
        wordStart++ ;
      }

      wordEnd = wordStart;
      while (wordEnd < reverseArray.length && reverseArray[wordEnd] != ' ') {
        wordEnd++;
      }

      // Reverse the word
      wordReversal(reverseArray, wordStart, wordEnd-1);

      wordStart = wordEnd;
    }
    return new String(reverseArray);
  }

  public static void main(String[] args){
    Reversal solution = new Reversal();
    String string = "STRING REVERSE";
    // Word Reversal test
    //    String word = "WORDREVERSE";
    //    char[] result = solution.wordReversal(word.toCharArray(),0, word.length()-1);
    //    System.out.println(new String(result));

    // String Reversal test
    String result = solution.reverseString(string);
    System.out.println(result);
  }
}