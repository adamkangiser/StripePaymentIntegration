package com.adamkangiser.stripepayments;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StripePaymentsApplication {

	@PostConstruct
	public void setup() {
		Stripe.apiKey = "sk_test_51MtcZbGbY7ZFyfeLZ8PEIcN8klSihBSWbPAqHeyBsOYoIljQL3lOZAehxtQbbRMoF1ew2DaM1rdKepyAP1sxGxmD00gIdFMAvX";

	}

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentsApplication.class, args);
	}

}
