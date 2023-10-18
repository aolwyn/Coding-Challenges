
import java.util.HashMap;

public class Solution {
	  public HashMap<Character, Integer> numDots = new HashMap<>();
	  public HashMap<Character, Integer> numLines = new HashMap<>();
	  
	  public static void main(String[] args) {
		  Solution solution = new solution();

		  String[] morseMappings = {"A .-", "B -...", "C -.-.", "D -..", "E .", "F ..-.", "G --.", "H ....", "I ..", "J .---", 
				  "K -.-", "L .-..", "M --", "N -.", "O ---", "P .--.", "Q --.-", "R .-.", "S ...", "T -", "U ..-", "V ...-", 
				  "W .--", "X -..-", "Y -.--", "Z --.."};

		  for (String mapping : morseMappings) {
	            char character = mapping.charAt(0);
	            String morse = mapping.substring(2);
	            int dotCount = 0;
	            int dashCount = 0;
	            for (char symbol : morse.toCharArray()) {
	                if (symbol == '.') {
	                    dotCount++;
	                } else if (symbol == '-') {
	                    dashCount++;
	                }
	            }
	            solution.numDots.put(character, dotCount);
	            solution.numLines.put(character, dashCount);
	        }
		  String[] testing = {"S","K","HELLO","CODE"};
		  for (String test : testing) {
	            
	            System.out.println("Result for " + test + ": " + solution.countNums(test));
	        }
		  
	  }
	  public int countNums(String test) {
	        if (test == " " || test == null || test.length() == 0) return 0; //idk what to do if dots and dashes are equal . . .
	        int dots = 0;
	        int lines = 0;
	        for (int i = 0; i < test.length(); i++) {
	            char character = test.charAt(i);
	            if (numDots.containsKey(character)) {
	                dots += numDots.get(character);
	                lines += numLines.get(character);
	            }
	        }
	        return dots > lines ? 1 : -1;
	    }
}
