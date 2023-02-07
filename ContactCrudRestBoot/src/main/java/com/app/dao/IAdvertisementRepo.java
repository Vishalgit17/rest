package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Advertisement;

public interface IAdvertisementRepo extends JpaRepository<Advertisement, Long>
{

}
