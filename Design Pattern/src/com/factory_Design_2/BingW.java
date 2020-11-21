package com.factory_Design_2;

public class BingW implements IWeatherReport {

	@Override
	public String getWReport(String pl, String dt) {
		String wd = "Bing weather condition on " + dt + " at " + pl + "is 19degC,moderate temp,shiny";
		return wd;
	}

}
