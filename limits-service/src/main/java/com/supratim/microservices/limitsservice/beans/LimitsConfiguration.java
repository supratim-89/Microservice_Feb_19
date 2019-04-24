package com.supratim.microservices.limitsservice.beans;

public class LimitsConfiguration {
	private int  minimum;
	private int  maximum;
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public LimitsConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public LimitsConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LimitsConfiguration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
	

}
