package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf='E';
		
	    
		switch (harf) {
		   case 'A':
		   case 'U':
		   case 'I':
		   case 'O':
			   System.out.println("Kalın sesli harf");
			   break;
		   default:
				   System.out.println("İnce sesli harf");
		}
		
	}

}
