package com.FoodPlaza21297.dao;

import java.util.List;

import com.FoodPlaza21297.pojo.FeedBack;

public interface FeedBackDao {
	
	boolean insertFeedback(FeedBack f);
	List<FeedBack> selectAll();
	
	
	

}
