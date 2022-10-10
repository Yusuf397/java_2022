package stringsDemo;

public class Main {

	public static void main(String[] args) {
        
		String message=" The weather is very good. ";
		System.out.println(message);
		
		/*System.out.println("Element number:"+message.length());
		System.out.println("5. elements:"+message.charAt(5));
		System.out.println(message.concat(" What do you think?"));
	    System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		char[] character= new char[5];
		message.getChars(0,5,character,0);
		System.out.println(character);
		System.out.println(message.indexOf("o"));
		System.out.println(message.lastIndexOf("o"));
		*/
		String newMessage=message.replace("","-");
		System.out.println(newMessage);
		System.out.println(message.substring(6));
	    for (String word:message.split(" ")) {
	    	System.out.println(word);
	    }
	    System.out.println(message.toLowerCase());
	    System.out.println(message.toUpperCase());
	    System.out.println(message.trim());
	}

}
