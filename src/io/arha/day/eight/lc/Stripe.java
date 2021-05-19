package io.arha.day.eight.lc;

public class Stripe implements PaymentGateway, MarkerInferce {

	@Override
	public void doPayment() {
		System.out.println("Payment by Stripe.");

	}

}
