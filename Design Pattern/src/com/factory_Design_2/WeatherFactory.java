package com.factory_Design_2;

public class WeatherFactory {
	public static IWeatherReport getInstance(String service){
		if(service.equals("accuw")){
			AccuWeather ac=new AccuWeather();
			return ac;
		}
		else if (service.equals("bingw")){
			BingW bw=new BingW();
			return bw;
		}
		else{
			return null;
		}
	}

}
