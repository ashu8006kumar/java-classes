package io.arha.day.eight.lc;

public class Paypal implements PaymentGateway ,MarkerInferce {

	@Override
	public void doPayment() {
		System.out.println("Payment done by paypal.");
	}
}
