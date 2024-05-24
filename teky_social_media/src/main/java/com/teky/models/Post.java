//package com.teky.models;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Post {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	private String caption;
//	private String image;
//	private String video;
//	private String user;
//	private List<User>liked = new ArrayList<>();
//	
//	
//	public Post()
//	{
//		
//	}
//	
//
//	public Post(Integer id, String caption, String image, String video, String user, List<User> liked) {
//		super();
//		this.id = id;
//		this.caption = caption;
//		this.image = image;
//		this.video = video;
//		this.user = user;
//		this.liked = liked;
//	}
//
//
//	public Integer getId() {
//		return id;
//	}
//
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//
//	public String getCaption() {
//		return caption;
//	}
//
//
//	public void setCaption(String caption) {
//		this.caption = caption;
//	}
//
//
//	public String getImage() {
//		return image;
//	}
//
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//
//	public String getVideo() {
//		return video;
//	}
//
//
//	public void setVideo(String video) {
//		this.video = video;
//	}
//
//
//	public String getUser() {
//		return user;
//	}
//
//
//	public void setUser(String user) {
//		this.user = user;
//	}
//
//
//	public List<User> getLiked() {
//		return liked;
//	}
//
//
//	public void setLiked(List<User> liked) {
//		this.liked = liked;
//	}
//
//
//	public void setUser(User user2) {
//		
//		
//	}
//
//
//
//
//
//
//
//
//
//	
//
//}
