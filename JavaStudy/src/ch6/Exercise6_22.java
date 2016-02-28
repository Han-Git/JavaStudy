package ch6;

public class Exercise6_22 {
	
	public static boolean isNumber(String a){
		boolean isNumber = true;
		
		if(a == "" || a == null || a.equals("")){
			System.out.println("111");
			isNumber = false;
		}else{
			for (int i = 0; i < a.length(); i++) {
				char ch = a.charAt(i);
				if(ch < '0' || ch > '9'){
					System.out.println("222");
					isNumber = false;
				}
			}
		}
		
		
		return isNumber;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "123o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
}
