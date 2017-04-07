import java.util.Scanner;

public class threes {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();

      while (N != 1) {
	    if (N % 3 == 0) {
		N = (N / 3);
		System.out.println(N);
	    }

	   else {
		if ((N + 1) % 3 == 0) {
			N = (N + 1);
			System.out.println(N);
		}

		if ((N - 1) % 3 == 0) {
			N = (N - 1);
			System.out.println(N);
		}

	   }
      }

   }
}
