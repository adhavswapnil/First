package test;

public class LocalInner1 {

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }


	public static void main(String a[]) {
		LocalInner1 srr = new LocalInner1();
		//System.out.println("Result: " + srr.reverseString("Java2novice"));
		new Foo() {
		};
		
	}
	
	 

}