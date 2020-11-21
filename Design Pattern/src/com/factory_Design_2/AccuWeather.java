package com.factory_Design_2;

public class AccuWeather implements IWeatherReport{

	@Override
	public String getWReport(String pl, String dt) {
		String wd="Accu weather in "+pl+" at "+dt+"is 30degC,hot,sunny";
		return wd;
	}

}
