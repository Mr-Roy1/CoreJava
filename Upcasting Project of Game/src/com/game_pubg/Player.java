package com.game_pubg;

class Player {
	String name="pk yadav";
	public static void main(String[] args) {
		Game g=new Game();
	Weapon w=g.pressButton();//up-casting
	System.out.println("pk yadav you played well...");
	System.out.println("and your Score is !!");
	
	w.use();//call invoking or overridden method
	
	}

}
