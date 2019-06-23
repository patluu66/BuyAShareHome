package com.in28minutes.rest.webservices.restfulwebservice.users;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



//@ApiModel(description="All details about the user. ")
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="birthDate")
	private Date birthDate;
	
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;
	
	@Column(name="name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="street")
	private String street;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	protected User() {
		
	}
	
	public User(Integer id, Date birthDate, String name, String city, String state, String street, String comment,
			String email, String phoneNumber) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.name = name;
		this.city = city;
		this.state = state;
		this.street = street;
		this.comment = comment;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", city=" + city + ", state=" + state
				+ ", street=" + street + ", comment=" + comment + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ "]";
	}	

}

