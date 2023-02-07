package com.app.service;

import java.util.List;

import com.app.pojos.Owner;

public interface IOwnerService 
{	
	Owner saveNewOwner(Owner newOwner);
	
	String removeOwner(Long id);
	
	Owner updateOwner(Owner updatedDetachedOwner);
	
	Owner getOwnerDetails(Long id);
}
