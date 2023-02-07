package com.app.service;

import java.util.List;

import com.app.pojos.Advertisement;

public interface IAdvertisementService 
{
	List<Advertisement> getAllProperties();
	
	String removeAdvertisement(Long id);
	
	Advertisement addNewAdvertisement(Advertisement add);
	
	Advertisement updateAdvertisement(Advertisement add);
}
