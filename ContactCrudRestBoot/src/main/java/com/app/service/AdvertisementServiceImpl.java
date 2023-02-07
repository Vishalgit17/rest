package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAdvertisementRepo;
import com.app.pojos.Advertisement;


@Service
@Transactional
public class AdvertisementServiceImpl implements IAdvertisementService
{
	@Autowired
	private IAdvertisementRepo advrepo;

	@Override
	public List<Advertisement> getAllProperties() 
	{
		return advrepo.findAll();
	}

	@Override
	public String removeAdvertisement(Long id) {
		String mesg = "Deletion failed !!!!";
		if (advrepo.existsById(id)) 
		{
			advrepo.deleteById(id);
			mesg = "deletion success with :"+id;
		}
		return mesg;
	}

	@Override
	public Advertisement addNewAdvertisement(Advertisement add) {
		return advrepo.save(add);
	}

	@Override
	public Advertisement updateAdvertisement(Advertisement add) 
	{
		return advrepo.save(add);
	}

}
