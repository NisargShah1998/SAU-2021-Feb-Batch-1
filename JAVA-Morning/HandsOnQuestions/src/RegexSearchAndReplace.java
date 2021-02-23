import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSearchAndReplace {

	public static void main(String[] args) {
		  String input;
		  String pattern_input;
		  String replace;
		  String final_output;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the input String: ");
		  input = sc.nextLine();
		  System.out.println("Enter the Regex which is needed to be replaced: ");
		  pattern_input = sc.nextLine();
		  System.out.println("Enter the String which will replace the substring: ");
		  replace = sc.nextLine();

		  Pattern pattern = Pattern.compile(pattern_input, Pattern.CASE_INSENSITIVE);
	      Matcher matchers = pattern.matcher(input);
		  
	      if(matchers.find()) {
	    	  final_output = matchers.replaceAll(replace);
	    	  System.out.println("Match Found Final Output is: " + final_output);
	      }else {
	    	  System.out.println("No Match Found of Regex");
	    	  
	      }
	  }
}
