package quest;

public class charArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++, ch++){
			alphabets[i] = ch;
		}
		for(int i = 0; i < alphabets.length; i++){
			alphabets[i] = (char)(alphabets[i]+32);
		}
		for(int i = 0; i < alphabets.length; i++,ch++){
			System.out.println(alphabets[i]);
		}
		

	}

}
