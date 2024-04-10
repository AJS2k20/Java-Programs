 class OuterClass {
	private int outerVariable = 10;
	static class StaticInnerClass{
		void display() {
			System.out.println("Static Inner Class");								
		}
	}
	
	class InnerClass {
		void display() {
			System.out.println("Non-static Inner Class");
			System.out.println("Outer variable: "+outerVariable);			
		}
	}
	void methodWithInnerClass() {
		class MethodLocalInnerClass {
			void display() {
				System.out.println("Method Local Inner Class");
			}
		}
		MethodLocalInnerClass methodLocalInner = new MethodLocalInnerClass();
		methodLocalInner.display();
	}
	interface Greeting {
		void greet();
	}
	void displayGreeting() {
		Greeting greeting = new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello, from Anonymous Inner Class");
			}
		};
		greeting.greet();
	}
}

 class InnerClassExample {
	public static void main(String args[])
	{
		OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
		staticInner.display();
//	non static inner class
	OuterClass outerObj = new OuterClass();
	OuterClass.InnerClass inner = outerObj.new InnerClass();
	
	inner.display();
	//METHOD LOCAL INNER CLASS
	outerObj.methodWithInnerClass();
	//USING ANONYMOUS INNER CLASS
	outerObj.displayGreeting();
	}
}


	