package ch7;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine){
			System.out.println("this is a Fire Engine instance");
		}
		
		if(fe instanceof Car){
			System.out.println("this is a car instance");
		}
		
		if(fe instanceof Object){
			System.out.println("this is an Object instance");
		}
		
		// 어떤 타입에 대한 instanceof 연산의 결과가 true 라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다. 
	}
}
