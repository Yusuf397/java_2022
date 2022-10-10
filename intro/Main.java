package intro;

public class Main {

	public static void main(String[] args) {
        
		System.out.println("Hello World!!!");
		//değişkenlerin ilk harfi küçük ikinci harfi büyük (camelCase)
		String metinOrta="ilginizi çekebilir";
		
		System.out.println(metinOrta);
		
		int vade=20;
		double dolarDun=18.14;
		double dolarBugun=18.14;
		
		boolean dolarDustuMu=false;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {//true or false
			okYonu="down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);

		}
				
		String[] krediler= {"konut kredisi","ihtiyac krdeisi","emekli kredisi"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
