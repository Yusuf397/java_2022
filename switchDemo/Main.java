package switchDemo;

public class Main {

	public static void main(String[] args) {
        
		char grade='F';
		String event ="Geçtiniz";
		String event1 ="Kaldınız!!";
		
		switch (grade) {
		  case 'A':
		        System.out.println("Muhteşem : "+event);
		        break;
		  case 'B':
		        System.out.println("Güzel : "+ event);
		        break;
		  case 'C':
		        System.out.println("İyi : "+ event);
		        break; 
		  case 'D':
		        System.out.println("İdare eder : "+ event);
		        break; 
		  case 'F':
		        System.out.println("Maalesef : "+ event1);
		        break; 
		        default:
		           System.out.println("Geçersiz not girdiniz.");
		
		}
		
		
		
	}

}
