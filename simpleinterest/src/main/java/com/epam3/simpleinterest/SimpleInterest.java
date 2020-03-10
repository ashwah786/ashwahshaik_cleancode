package com.epam3.simpleinterest;

public class SimpleInterest {
	double principalamount;
	double years;
	double rateofinterestpyear;
	SimpleInterest(double principalamount, double  years, double rateofinterestpyear){
		this.principalamount = principalamount;
		this.years = years;
		this.rateofinterestpyear = rateofinterestpyear;
		}	
	public double findsimpleinterest(){
		double result = (principalamount * years * rateofinterestpyear);
		result /= 100;
		return result;
	}
}
