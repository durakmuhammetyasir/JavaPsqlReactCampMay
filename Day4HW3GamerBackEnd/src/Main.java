import java.util.Date;

import com.Concrete.GamerCheckManager;
import com.Concrete.GamerManager;
import com.Concrete.PromotionManager;
import com.Concrete.SalesManager;
import com.Entity.Game;
import com.Entity.Gamer;
import com.Entity.Promotion;
public class Main {

	public static void main(String[] args) {
		Promotion promotion1 = new Promotion(1,"Yuzde 20 indirim");
		Promotion promotion2 = new Promotion(2,"Yuzde 20 hediye kuponu");
		
		Gamer gamer1 = new Gamer(1, "ARDA", "KIRMIZI", "53351235352", new Date(1999, 5, 14));
		Gamer gamer2 = new Gamer(1, "SEDA", "KIZIL", "53876135352", new Date(1989, 8, 24));
		
		Game game1 = new Game(1, "NBA2K", 299, 9);
		Game game2 = new Game (2, "Assassins Creed", 199, 3);
		
		SalesManager salesManager1 = new SalesManager(gamer1,game2, promotion1);
		SalesManager salesManager2 = new SalesManager(gamer2,game2, promotion2);
		SalesManager salesManager3 = new SalesManager(gamer1,game1, promotion2);
		SalesManager salesManager4 = new SalesManager(gamer2,game1, promotion1);
		System.out.println("____________________________________________________________");
		
		
		PromotionManager promotionManager = new PromotionManager();
		promotionManager.madePromotion(gamer2, game2, promotion2);
		promotionManager.promotedGame(game2);
		promotionManager.promotedGame(game1);
		System.out.println("____________________________________________________________");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.madePromotion(gamer1, game1, promotion1);
		gamerManager.signUp(gamer2);
		gamerManager.updateAccount(gamer1);
		gamerManager.removeAccount(gamer2);
		System.out.println("____________________________________________________________");
		
		GamerCheckManager gamerCheckManager = new GamerCheckManager();
		gamerCheckManager.CheckIfRealPerson(gamer2);
		System.out.println("____________________________________________________________");
	}
}
