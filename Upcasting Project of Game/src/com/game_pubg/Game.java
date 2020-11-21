package com.game_pubg;

class Game {
	String name="PUBG";
	
		Weapon pressButton()
		{
			//rturn either knife/bomb/gun
			//int score=//comes from database/storage
			int score=750;
			if(score<=300)
			{
				Knife k=new Knife();
				return k;
			}
			else if(score>300 && score<=600)
			{
				Gun g=new Gun();
				return g;
			}
			else
			{
				Bomb b=new Bomb();
				return b;
				
			}
		}
	

}
