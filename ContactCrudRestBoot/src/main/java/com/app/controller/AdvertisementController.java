package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IAdvertisementRepo;
import com.app.pojos.Advertisement;
import com.app.service.IAdvertisementService;

@RestController
@RequestMapping("/api/advertisements")
public class AdvertisementController 
{
	@Autowired
	private IAdvertisementService advserv;
	
	public AdvertisementController()
	{
		System.out.println("in ctor : "+getClass());
	}
	
	@GetMapping
	public List<Advertisement> getAllAdvertisements()
	{
		return advserv.getAllProperties();
	}
	
	@PostMapping
	public Advertisement addnewAdvertisement(@RequestBody Advertisement add)
	{
		return advserv.addNewAdvertisement(add);
	}
	
	@PutMapping
	public Advertisement updateAdvertisement(@RequestBody Advertisement add)
	{
		return advserv.updateAdvertisement(add);
	}
	
	@DeleteMapping("/{id}")
	public String deleteAdvertisement(@PathVariable Long id)
	{
		return advserv.removeAdvertisement(id); 
	}
}
