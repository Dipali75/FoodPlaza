package com.FoodPlaza21297.pojo;

public class Cart {
	int cartId;
	int foodId;
	String cusEmail;
	int quantity;
	double foodPrise;
	String foodName;
	public Cart()
	{
		
	}
	
	
	public Cart(int cartId, int foodId, String cusEmail, int quantity,double foodPrise,String foodName) {
		super();
		this.cartId = cartId;
		this.foodId = foodId;
		this.cusEmail = cusEmail;
		this.quantity = quantity;
		this.foodPrise=foodPrise;
		this.foodName=foodName;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getFoodPrise() {
		return foodPrise;
	}
	public void setFoodPrise(double foodPrise) {
		this.foodPrise = foodPrise;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", foodId=" + foodId + ", cusEmail="
				+ cusEmail + ", quantity=" + quantity + ", foodPrise="
				+ foodPrise + ", foodName=" + foodName + "]";
	}
	
	

	

}
