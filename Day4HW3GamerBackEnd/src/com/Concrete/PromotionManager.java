package com.Concrete;

import com.Abstract.BasePromotionManager;
import com.Entity.Game;
import com.Entity.Promotion;

public class PromotionManager extends BasePromotionManager{
	public void updatePromotion() {
		
	}
	public void addPromotion() {
		
	}
	public void deletePromotion() {
		
	}
	
	public void promotedGame(Game game) {
		if(game.getStockOfGame()>=7) {
			System.out.println(game.getTitle() + " oyununda kampanya baslat");
			addPromotion();
		}else if (game.getStockOfGame()>=10) {
		 	System.out.println(game.getTitle() + " oyununda kampanyayý guncelle");			
		 	updatePromotion();
		}else if (game.getStockOfGame()<3) {
			System.out.println(game.getTitle() + " oyunundan siparis et");
		} else {
			System.out.println(game.getTitle() + " oyununda kampanya veya yeni siparis icin kararsýz");
			deletePromotion();
		}
	}
	

}
