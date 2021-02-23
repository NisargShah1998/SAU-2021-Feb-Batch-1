import java.util.Scanner;
import java.util.TreeMap;

public class ReverseOrderCollection {
    public static void main(String args[]) {

	 TreeMap <String,String> student = new TreeMap <String,String> ();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter 5 Key value pair where key is student name and value is his/her college");
	 String name,college;
	 int i=1;
		 while(i<=5) {
		 name = sc.next();
		 college = sc.nextLine();
		 student.put(name,college);
		 i++;
	 }
	 System.out.println("Orginal Order: " + student);
	 System.out.println("Reverse order view of the keys: " + student.descendingKeySet());
	}
}
