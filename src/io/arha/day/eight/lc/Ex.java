package io.arha.day.eight.lc;

public class Ex {

	public static void main(String[] args) { 
		PaymentGateway p= new Wepay();
		p.doPayment();
		// 2
		PaymentGateway paymentGatewayStripe= new Stripe();
		paymentGatewayStripe.doPayment();
	}

}
