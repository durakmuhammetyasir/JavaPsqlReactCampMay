package com.Adapter;

import com.Abstract.IGamerCheckService;
import com.Abstract.IGamerService;
import com.Entity.Gamer;

public class MernisServiceAdapter implements IGamerCheckService, IGamerService{
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

	@Override
	public void save(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " uyelige uygundur.");
		
	}	
}
