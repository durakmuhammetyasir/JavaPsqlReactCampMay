package com.Concrete;

import com.Entity.Game;
import com.Entity.Gamer;
import com.Entity.Promotion;

public class SalesManager {
	public SalesManager(Gamer gamer, Game game, Promotion promotion) {
		if(promotion.getPromotionId()==1) {
			double result = game.getPrice() * 0.80;
			System.out.println(gamer.getFirstName() + 
					" odeyeceginiz tutar : " + (int)result + " TL");
		}else if(promotion.getPromotionId()==2) {
			double result = game.getPrice() * 0.20;
			System.out.println(gamer.getFirstName() +
					" odeyeceginiz tutar : " + (int)game.getPrice() +
					" TL kazandýgýnýz hediye : " + (int)result +" TL");
		}else {
			System.out.println(gamer.getFirstName() + 
					" odeyeceginiz tutar : " + (int)game.getPrice() + " TL");
		}
	}
}
