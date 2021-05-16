package com.Entity;

public class Promotion {
	private int _promotionId;
	private String _promotionType;
	
	public Promotion() {
		
	}
	public Promotion(int promotionId, String promotionType) {
		super();
		this._promotionId = promotionId;
		this._promotionType = promotionType;
	}

	
	public int getPromotionId() {
		return _promotionId;
	}
	public void setPromotionId(int promotionId) {
		this._promotionId = promotionId;
	}
	public String getPromotionType() {
		return _promotionType;
	}
	public void setPromotionType(String promotionType) {
		this._promotionType = promotionType;
	}
	
}
