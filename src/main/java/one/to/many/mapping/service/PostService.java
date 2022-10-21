package one.to.many.mapping.service;

import java.util.List;
import java.util.Optional;

import one.to.many.mapping.Entity.Comment;
import one.to.many.mapping.Entity.Post;

public interface PostService {
	Post saveUser(Post post);
	List<Post> findAllPosts();
	Optional<Post> findById(long id);
	public void deleteByPostId(long id);
	Post updatePost(Post post ,long id);
	
	
 
}
