package com.epam3.simpleinterest;

public class compoundInterest {
	double principalamount;
	double years;
	double rateofinterestpyear;
	compoundInterest(double p, double y, double r){
		this.principalamount = p;
		this.years = y;
		this.rateofinterestpyear = r;
		}	
	public double findcompoundinterest(){
		double result = principalamount * Math.pow((1 + rateofinterestpyear/100), years);
		return result;
	}
}
