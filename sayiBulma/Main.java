package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar=new int[] {1,2,5,6,7};
		int aranacak=2;
		
		boolean varMi= false;
		
		for(int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi=true;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
		

	}

}
