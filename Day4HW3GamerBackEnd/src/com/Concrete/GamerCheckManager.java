package com.Concrete;

import com.Abstract.IGamerCheckService;
import com.Adapter.MernisServiceAdapter;
import com.Entity.Gamer;

public class GamerCheckManager extends MernisServiceAdapter implements IGamerCheckService{
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		super.save(gamer);
		return true;
	}


	
	
	
	
}
	