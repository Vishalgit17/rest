package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class Advertisement extends BaseEntity
{
	@JsonProperty("description")
	@Column(length = 50)
	private String description;
	
	@JsonProperty("price")
	private double price;
	
	@JsonProperty("proptype")
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private PropertyType propType;
	
	@JsonProperty("proppurpose")
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private PropertyPurpose propPurpose;
	
	@JsonProperty("owner_id")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "owner_id")
	private Owner ownerProp;
}
