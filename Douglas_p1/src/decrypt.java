import java.util.Scanner;
public class decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		int [] decrypt = new int[4];
		int [] inOrder = new int[4];
		System.out.println("Enter encrypted Number: ");
		num = scnr.nextInt();
		for(int i = 3; i >= 0; i--) {
			decrypt[i] = num % 10;
			num /= 10;
		}
		inOrder[0] = decrypt[2];
		inOrder[1] = decrypt[3];
		inOrder[2] = decrypt[0];
		inOrder[3] = decrypt[1];
		for(int i = 0; i < 4; i++) {
			inOrder[i] = (inOrder[i] + 3) % 10;
		}
		for(int i = 0; i < 4; i++) {
			System.out.print(inOrder[i]);
		}
	}

}
