package reCapDemo;

public class Main {

	public static void main(String[] args) {
		int number1=24;
		int number2=22;
		int number3=10;
		int bigNumber=number1;
		
		if (bigNumber<number2) {
			bigNumber=number2;
			}
		if(bigNumber<number3) {
			bigNumber=number3;
		}
		
		System.out.println("En büyük sayı:"+ bigNumber);
	}

}
