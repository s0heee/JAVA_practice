package sec02_메소드오버라이딩.EX04;

class A {
	
	protected void abc() {
		
	}
}// class

class B1 extends A {
	
	@Override
	public void abc() { }
}// class

class B2 extends A {
	
	@Override
	protected void abc() { }
}// class

class B3 extends A {
	
//	@Override
//	void abc() { }	//default 접근제한자 (오버라이딩시 부모 접근제한자보다 좁아져서 불가능)
}// class

class B4 extends A {
	
//	@Override
//	private void abc() { }	//(오버라이딩시 부모 접근제한자보다 좁아져서 불가능)
}// class


public class MethodOverriding_4 {
	public static void main(String[] args) {
		
	}// main
}// end class





























