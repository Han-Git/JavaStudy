package example;

public class Autoboxing {
	public static void main(String[] argv) {
		int idx = 0;
		char[] charArray = new char[10];
		charArray[idx++] = '0';
		System.out.println(charArray);
		charArray[idx++] = 65;
		System.out.println(charArray);
		charArray[idx++] = 'A' + 1;
		System.out.println(charArray);
	}
}
