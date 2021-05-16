package com.Entity;

public class Game {
	private int _gameId;
	private String _title;
	private double _price;
	private int _stockOfGame;
	
	public Game() {
		
	}
	
	public Game(int gameId, String title, double price, int stockOfGame) {
		super();
		this._gameId = gameId;
		this._title = title;
		this._price = price;
		this._stockOfGame = stockOfGame;
	}

	public int getGameId() {
		return _gameId;
	}

	public void setGameId(int gameId) {
		this._gameId = gameId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		this._title = title;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockOfGame() {
		return _stockOfGame;
	}

	public void setStockOfGame(int stockOfGame) {
		this._stockOfGame = stockOfGame;
	}

}
