package com.FoodPlaza21297.pojo;

public class Food {
	
	int foodId;
	String foodName;
	double foodPrise;
	String foodCatagory;
	
	public Food(int foodId, String foodName, double foodPrise,String foodCatagory) 
	{
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrise = foodPrise;
		this.foodCatagory = foodCatagory;
	}

	public Food() {
		// TODO Auto-generated constructor stub
	}

	

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrise() {
		return foodPrise;
	}

	public void setFoodPrise(double foodPrise) {
		this.foodPrise = foodPrise;
	}

	public String getFoodCatagory() {
		return foodCatagory;
	}

	public void setFoodCatagory(String foodCatagory) {
		this.foodCatagory = foodCatagory;
	}

	
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName
				+ ", foodPrise=" + foodPrise + ", foodCatagory=" + foodCatagory
				+ "]";
	}
	

}
