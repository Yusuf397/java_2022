package arraysDemo;

public class Main {

	public static void main(String[] args) {
        /*
		String[] students=new String[4];
		students[0]="Yusuf";
		students[1]="Ahmet";
		students[2]="Ali";
		students[3]="Mehmet";
		*/
		
		String[] students= {"Yusuf","Ahmet","Ali","Mehmet"};
		
		for( int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("-----------------------");
		
		for (String stdts:students) {
			System.out.println(stdts);
		}
		
	}

}
