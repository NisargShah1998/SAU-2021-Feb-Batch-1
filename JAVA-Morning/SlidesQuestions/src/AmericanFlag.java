
public class AmericanFlag {
	public static void main(String[] args) {
		String star_pattern1 = "* * * * * * ==============================";
		String star_pattern2 = " * * * * *  ==============================";
		String line_pattern =  "==========================================";
		
		System.out.println("             American Flag                 ");
		System.out.println();
		for(int i=1;i<=4;i++) {
			System.out.println(star_pattern1);
			System.out.println(star_pattern2);
		}
		System.out.println(star_pattern1);
		for(int i=1;i<=5;i++) {
			System.out.println(line_pattern);
		}
    }
}
