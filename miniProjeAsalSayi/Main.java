package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
        int number=23;
        
        if (number==1) {
			System.out.println("Sayı Asal Değildir.");
			return;
		}
        if (number<1) {
			System.out.println("Sayı Geçersizdir.");
			return;
		}
        boolean isPrime=true;
        
        for (int i=2; i<number; i++) {
        	if(number % i == 0) {
        		isPrime=false;
        	}
        }
		
       if (isPrime) {
    	   System.out.println("Sayı asaldır");
       }else {
    	   System.out.println("Sayı asal değildir.");
       }
        

        	
 
	}

}
