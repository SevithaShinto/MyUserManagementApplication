package com.sevitha.UMA.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_ACCOUNTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer userid;
//	USER_FIRST_NAME
	@Column(name = "USER_FIRST_NAME")
	private String firstName;
//	USER_LAST_NAME
	@Column(name = "USER_LAST_NAME")
	private String lastName;
//	USER_EMAIL
	@Column(name = "USER_EMAIL")
	private String email;
//	USER_PHNO
	@Column(name = "USER_PHNO")
	private String phoneNum;
//	USER_DOB
	@Column(name = "USER_DOB")
	private Date dob;
//	GENDER
	@Column(name = "GENDER")
	private String gender;
//	COUNTRY
	@Column(name = "COUNTRY")
	private String country;
//	STATE
	@Column(name = "STATE")
	private String state;
//	CITY
	@Column(name = "CITY")
	private String city;
//	ACTIVE_SW
	@Column(name = "ACTIVE_SW")
	private Character activeSwitch;
//	CREATED_DATE
	@Column(name = "CREATED_DATE" , updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
//	UPDATED_DATE
	@Column(name = "UPDATED_DATE" , insertable = false)
	@UpdateTimestamp
	private LocalDate  updateDate;
//	USER_PASSWORD
	@Column(name = "USER_PASSWORD")
	private String password;
}
