package reCapDemo2;

public class Main {

	public static void main(String[] args) {
        
		double[] myList= {1.5,5.3,3.7,4.8};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
			    max=number;
			}
			total= total +number;
			System.out.println(number);
		}
		System.out.println("toplam: "+total);
		System.out.println("En büyük sayı: "+max);
	}

}
