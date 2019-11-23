package com.FoodPlaza21297.pojo;

public class FeedBack {
	
	int FeedId;
	String cusName;
	String Message;
	String cusEmail;
	
	public FeedBack()
	{
		
	}

	public int getFeedId() {
		return FeedId;
	}

	public void setFeedId(int feedId) {
		FeedId = feedId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	@Override
	public String toString() {
		return "FeedBack [FeedId=" + FeedId + ", cusName=" + cusName
				+ ", Message=" + Message + ", cusEmail=" + cusEmail + "]";
	}
	
	
	

}
