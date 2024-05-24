//package com.teky.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.teky.models.Post;
//import com.teky.models.User;
//import com.teky.repository.PostRepository;
//import com.teky.repository.UserRepository;
//
//@Service
//public class PostServiceImplementation implements PostService{
//	
//	@Autowired
//	PostRepository postRepository;
//	
//	@Autowired
//	UserService userService;
//	
//	@Autowired
//	UserRepository userRepository;
//
//	@Override
//	public Post createNewPost(Post post, Integer userId) throws Exception 
//	{
//		
//		User user = userService.findUserById(userId);
//
//		Post newPost=new Post();
//		newPost.setCaption(post.getCaption());
//		newPost.setImage(post.getImage());
//		newPost.setVideo(post.getVideo());
//		newPost.setUser(user);
//
//		return newPost;
//	}
//
////	@Override
////	public String deletePost(Integer postId, Integer userId) throws Exception
////	{
////		
////		Post post = findPostById(postId);
////		User user = userService.findUserById(userId);
////		if(post.getUser().getId()!=user.getId())
////		{
////			throw new Exception("you can't delete anothor users post");
////		}
////		
////		postRepository.delete(post);
////		return "post deleted successfully";
////	}
//
//
//
//	@Override
//	public List<Post> findPostByUserId(Integer userId) {
//		return postRepository.findPostByUserId(userId);
//	}
//
//	@Override
//	public Post findPostById(Integer postId) throws Exception {
//		
//		 Optional<Post> opt=postRepository.findById(postId);
//
//		if(opt.isEmpty()) 
//		{
//			throw new Exception("post not found with id "+postId);
//		}
//
//		return opt.get();
//	}
//	
//	@Override
//	public List<Post>findAllPost()
//	{
//		return postRepository.findAll();
//	}
//
//	@Override
//
//	public Post savedPost(Integer postId, Integer userId) throws Exception { 
//		Post post = findPostById(postId);
//		User user = userService.findUserById(userId);
//
//		if(user.getSavedPost().contains(post)) {
//	
//			user.getSavedPost().remove(post);
//	
//		}
//	
//		else user.getSavedPost().add(post); 
//		userRepository.save(user);
//	
//		return post;
//	}
//
//	@Override
//	public Post likePost(Integer postId, Integer userId) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deletePost(Integer postId, Integer userId) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//}
