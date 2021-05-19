package io.arha.day.eight.lc;

public class Ex2 {

	public static void main(String[] args) {
		markercheck(new Paypal());
		markercheck(new Stripe());
	}

	static void markercheck(PaymentGateway paymentGateway) {
		if (paymentGateway instanceof MarkerInferce) {
			System.out.println("IMP payment");
			System.out.println("SMS");
		}
		paymentGateway.doPayment();
	}

}
