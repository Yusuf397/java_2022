package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number=-25;
		int total=0;
		
		if (number==1 ) {
			System.out.println("Mükemmel sayıdır.");
			return;
		}
		if (number<1) {
			System.out.println("Sayı geçersizdir.");
			return;
		}
		
		for (int i=1; i<number; i++) {
			if (number % i == 0) {
				total=total+i;
				
			}
		}
        if (total==number) {
			System.out.println("Mükemmel sayıdır.");
		} else {
            System.out.println("Mükemmel sayı değildir.");
		}
		
	}

}
