package com.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IOwnerRepo;
import com.app.pojos.Owner;

import custom_exception.ResourceNotFoundException;

@Service
@Transactional
public class OwnerServiceImpl implements IOwnerService
{
	
	@Autowired
	private IOwnerRepo OwnerRepo;

	@Override
	public Owner saveNewOwner(Owner newOwner)
	{
		return OwnerRepo.save(newOwner);
	}

	@Override
	public String removeOwner(Long id) 
	{
		String mesg = "Deletion Failed";
		if (OwnerRepo.existsById(id)) 
		{
			OwnerRepo.deleteById(id);
			mesg = "Owner deleted with id : "+id;
		}
		return mesg;
	}

	@Override
	public Owner updateOwner(Owner updatedDetachedOwner) 
	{
		return OwnerRepo.save(updatedDetachedOwner);
	}

	@Override
	public Owner getOwnerDetails(Long id) 
	{
		return OwnerRepo.findById(id).orElseThrow(() -> new
				ResourceNotFoundException("Invalid Owner id !!!! "+id));
	}
}
