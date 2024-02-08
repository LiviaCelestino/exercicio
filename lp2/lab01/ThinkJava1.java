import java.util.Scanner;

public class ThinkJava1 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String name;
	int age;

	System.out.print("What is your name? ");
	name = in.nextLine();
	System.out.print("Whats is your age? ");
	age = in.nextInt();
	in.nextLin();
	System.out.printf("Hello %s, age %d\n", name, age);
	}
}
