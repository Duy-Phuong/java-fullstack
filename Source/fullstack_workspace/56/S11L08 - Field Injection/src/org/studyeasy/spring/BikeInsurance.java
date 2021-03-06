package org.studyeasy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myInsurance")
public class BikeInsurance implements Insurance {
	@Autowired
    Offers currentOffer;
	
	@Override
	public String showStatus() {
		
		return "Your Bike is Insured";
	}
    @Override
	public Offers getCurrentOffer() {
		return currentOffer;
	}
}


