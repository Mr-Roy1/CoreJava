package com.factory_Design_2;

public class Website {
	public static void main(String[] args) {
		
		//AccuWeather a=new AccuWeather();
		//IWeatherReport w=new IWeatherReport();
	
		
		String service="accuw";
	
		
		IWeatherReport wr=WeatherFactory.getInstance(service);
		String wd=wr.getWReport("bengaluru", "21apr,10am");
		System.out.println(wd);
	}

}
