package com.sevitha.UMA.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COUNTRY_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUNTRY_ID")
	private Integer countryid;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
}
