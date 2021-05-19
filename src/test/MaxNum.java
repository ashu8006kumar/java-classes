package test;

public class MaxNum {
	public void miniAndMaxValue(int value1, int value2) {

		if (value1 > value2) {
			System.out.println("min value:" + value2);
			System.out.println("max value:" + value1);
		} else {
			System.out.println("min value:" + value1);
			System.out.println("max value:" + value2);
		}
	}

	public static void main(String[] args) {
		MaxNum ob = new MaxNum();
		ob.miniAndMaxValue(30, 60);
		System.out.println("---------");
		ob.miniAndMaxValue(30, 70);
	}
}
