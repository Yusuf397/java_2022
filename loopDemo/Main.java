package loopDemo;

public class Main {

	public static void main(String[] args) {
        //for loop
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti!!!");
		
		//odd number
		for (int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti!!!");
		
		//even number
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti!!!");
		
		//while loop
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Döngü bitti!!!");
		//do-while loop 
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
			
		
	}

}
