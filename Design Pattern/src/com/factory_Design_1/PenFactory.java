package com.factory_Design_1;

public class PenFactory {
	public static IPen getInstance(String type){
		if(type.equals("mk")){
			MarkerPen mkp=new MarkerPen();
			return mkp;
		}
		else if(type.equals("ik")){
			InkPen ikp=new InkPen();
			return ikp;
		}
		else if(type.equals("sk")){
			SketchPen skp=new SketchPen();
			return skp;
		}
		else{
			return null;
		}
	}

}
