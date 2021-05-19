package io.arha.day.eight;

public interface InterfaceDemo2 extends InterfaceDemo {
	
	int X=10; // public and final
	
	void sum();// java 8 abstract 
	
	default void sum2() {
		
	}

}
