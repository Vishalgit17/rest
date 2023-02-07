package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Owner;

public interface IOwnerRepo extends JpaRepository<Owner, Long>
{
	
}
