package com.Abstract;

import com.Entity.Game;
import com.Entity.Gamer;
import com.Entity.Promotion;

public interface IPromotionService {
	void madePromotion(Gamer gamer, Game game, Promotion promotion);

}
