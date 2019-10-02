import java.util.Scanner;

public class train3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a= scanner.nextInt();
		b= scanner.nextInt();
		
		if (a==0&&b<45) {
			
			a=24;
		}
		
		int totalSeconds;
		int result;
		
		totalSeconds= a*60*60+b*60;
		result= totalSeconds-45*60;
		
		int hours;
		int minutes;
		
		hours=result/(60*60);
		minutes=(result%(60*60))/60;
		System.out.print(hours);
		System.out.print(" ");
		System.out.print(minutes);
		scanner.close();
	}
}