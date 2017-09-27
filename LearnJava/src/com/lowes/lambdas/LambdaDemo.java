package com.lowes.lambdas;

public class LambdaDemo {
	public static void main(String[] args) {
		
		Greet g = new GreetImp();
		g.greet();
		
		Greet newGreet = new Greet() {
			
			@Override
			public void greet() {
				System.out.println("Aur aek Lowe's India");
			}
		};
		newGreet.greet();
		
		Greet lambdaGreet = () -> System.out.println("Himanshu");		//Lambda Expression implemented for inner class
		lambdaGreet.greet();
	}
}

@FunctionalInterface
interface Greet {		//Functional Interface involves only one abstract method...
	void greet();
	default void oneFunc(){
		
	}
	default void twoFunc(){
		
	}
}


class GreetImp implements Greet {

	@Override
	public void greet() {
		
		System.out.println("Lowe's india");
	}
	
}