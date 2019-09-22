import java.util.Scanner;
public class encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int data;
		int encrypt;
		int [] dat = new int[4];
		int [] swapped = new int[4];
		System.out.println("Enter your data: ");
		data = scnr.nextInt();
		for(int i = 3; i >= 0; i--) {
			dat[i] = data%10;
			data = data/10;
		}

		for(int i = 0; i < 4; i++) {
			dat[i] = (dat[i] + 7) % 10;
		}
	
	
		swapped[0] = dat[2];
		swapped[1] = dat[3];
		swapped[2] = dat[0];
		swapped[3] = dat[1];
		for(int i = 0; i < 4; i++) {
			System.out.print(swapped[i]);
		}
		
	}
	
}
