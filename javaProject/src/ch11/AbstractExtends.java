package ch11;

public class AbstractExtends extends AbstractClass {

	//오버라이딩은 부모쪽에 있는 미완성된 메소드를 구현한다는 의미도 포함
	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
	}
	public static void main(String[] args) {
		//AbstractClass a=new AbstractClass();//주의점 : 추상메소드가 있는 추상클래스, 인터페이스는
		//new를 통해서 인스턴스화할 수 없다.즉, 스스로 객체생성이 안된다.
		AbstractExtends ex=new AbstractExtends();
		ex.method1();
		ex.method2();
	}
}
