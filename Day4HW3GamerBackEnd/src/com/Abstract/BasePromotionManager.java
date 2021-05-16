package com.Abstract;

import com.Entity.Game;
import com.Entity.Gamer;
import com.Entity.Promotion;

public abstract class BasePromotionManager implements IPromotionService{
	/*public void boughtGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() +" "+ game.getTitle() + " adl� oyunu sat�n ald�.");
	}*/
	public void madePromotion(Gamer gamer, Game game, Promotion promotion) {
		System.out.println(gamer.getFirstName() +" "
				+ game.getTitle() + " adl� oyunu al�rken " 
				+ promotion.getPromotionType() + " kampanyas�ndan yararland�.");
	}
	

}
