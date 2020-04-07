package codingBat;

/**
 * Returns the character before and after
 * the input word.
 * 
 * @author melissamoffitt
 *
 */

public class CodingBat {
    
	/**
	 * Takes in a string to be searched returns
	 * the characters before and after the word.
	 * 
	 * @param str string to be searched
	 * @param word pull characters before and after
	 * @return
	 */

	public static String wordEnds(String str, String word) {
		String result = "";
		
		if(word.equals(str)) {
			return result;
		}
		
		if(str.startsWith(word)) {
			result = result + str.charAt(word.length());
		}
		
		int i = 1;
		while(i < (str.length() - word.length())) {
		 
			if(str.substring(i).startsWith(word)) {
				result = result + str.charAt(i-1)+str.charAt(i+word.length());
				i = i + word.length();
			}
			else{
				i++;
			}
		}
		if (str.endsWith(word)) {
			result = result + str.charAt(str.length()-word.length()-1);
		}
		return result;
	}
}


