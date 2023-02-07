package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Owner;
import com.app.service.IOwnerService;

@RestController
@RequestMapping("/api/owners")
public class OwnerController 
{
	
	@Autowired
	private IOwnerService conserv;
	
	public OwnerController()
	{
		System.out.println("in ctor of : "+getClass());
	}
	
	
	@PostMapping
	public Owner addNewOwner(@RequestBody Owner newOwner)
	{
		System.out.println("In Save Owner "+newOwner);
		return conserv.saveNewOwner(newOwner);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOwner(@PathVariable Long id)
	{
		System.out.println("In delete Owner");
		return conserv.removeOwner(id);
	}
	
	@GetMapping("/{id}")
	public Owner getOwnerById(@PathVariable Long id)
	{
		System.out.println("in Ownerbyid ");
		return conserv.getOwnerDetails(id);
	}
	
	@PutMapping
	public Owner updateOwner(@RequestBody Owner existOwner)
	{
		System.out.println("in update Owner");
		return conserv.updateOwner(existOwner);
	}
}
