public class Palindrome {
	public static void main(String[] args) {
		String word1 = "Mad";
		String word2 = "";
		System.out.println("Word : " +word1);
		for( int i = word1.length()-1; i>=0; i--) {
			word2 += word1.charAt(i);
		}

       if(word1.equals(word2)) {
       	System.out.println(word2 +" is a palindrome word.");
       }
       else {
       	System.out.println (word2 + " is not a palindrome word.");
      
	}

		 }
	 }
