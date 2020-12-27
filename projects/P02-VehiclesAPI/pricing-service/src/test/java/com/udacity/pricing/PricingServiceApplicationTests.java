package com.udacity.pricing;

import static org.junit.Assert.assertEquals;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceRepository;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

	@Autowired
	private PriceRepository priceRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void checkPriceJsonPopulator() {
		List<Price> prices = priceRepository.findAll();
		assertEquals("Expecting 20", 20, prices.size());

		Price price = prices.get(0);
		assertEquals(1L, price.getVehicleId().longValue());
		assertEquals("15189.51", price.getPrice().toString());
		assertEquals("USD", price.getCurrency());
	}

}
