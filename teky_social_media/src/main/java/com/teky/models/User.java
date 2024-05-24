package com.teky.models;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "user")
public class User {	
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String gender;
	private List<Integer> followers = new ArrayList<>();
	private List<Integer> following = new ArrayList<>();
	//private List<Post>savedPost = new ArrayList<>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	

	public User(int id, String firstname, String lastname, String email, String password, String gender,
			List<Integer> followers, List<Integer> following) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.followers = followers;
		this.following = following;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public List<Integer> getFollowers() {
		return followers;
	}


	public void setFollowers(List<Integer> followers) {
		this.followers = followers;
	}


	public List<Integer> getFollowing() {
		return following;
	}


	public void setFollowing(List<Integer> following) {
		this.following = following;
	}
	
	



	
	

}
