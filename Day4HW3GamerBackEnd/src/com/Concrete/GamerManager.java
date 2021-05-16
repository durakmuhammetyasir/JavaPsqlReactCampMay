package com.Concrete;

import com.Abstract.BasePromotionManager;
import com.Entity.Gamer;

public class GamerManager extends BasePromotionManager {
	public void signUp(Gamer gamer) {
		System.out.println("Yeni uye kayd� al�nd� : " + gamer.getFirstName());
	}
	public void updateAccount(Gamer gamer) {
		System.out.println("Uye bilgileri guncellendi : " + gamer.getFirstName());
	}
	public void removeAccount(Gamer gamer) {
		System.out.println("Uye kayd� silindi : " + gamer.getFirstName());
	} 

}
