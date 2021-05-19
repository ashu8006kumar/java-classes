package io.arha.day.seven.overriding;

public class Example {

	public static void main(String[] args) {
		ChidOne chidOne = new ChidOne();
		ChidTwo chidTwo = new ChidTwo();
		
		Base base = new Base();
		 
		Base base2= new ChidOne();
		
		
		
		Base base3= new ChidTwo();
		//base3.area(1);
		
		Example2 example2= new Example2();

		example2.areaCall(base);
		example2.areaCall(base2);
		example2.areaCall(base3);
		example2.areaCall(chidOne);
	}
	

}
