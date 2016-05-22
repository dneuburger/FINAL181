package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;


public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	@Test public void TestCreditScoreVSInterestRate() throws Exception {	
		
	}
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test(expected = RateException.class)
	public void NoRatesForCreditScore() throws Exception {
		
	}

	@Test
	public void test() {
		assert(1==1);
	}

}
