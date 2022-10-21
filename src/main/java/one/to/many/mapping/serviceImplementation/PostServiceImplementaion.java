package one.to.many.mapping.serviceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.to.many.mapping.Entity.Comment;
import one.to.many.mapping.Entity.Post;
import one.to.many.mapping.repositary.CommentRepositary;
import one.to.many.mapping.repositary.PostRepositary;
import one.to.many.mapping.service.PostService;

@Service
public class PostServiceImplementaion implements PostService {

	@Autowired
	private PostRepositary postRepositary;
     @Autowired
     private CommentRepositary commentRepositary;
	@Override
	public Post saveUser(Post post) {

		return postRepositary.save(post);

	}

	@Override
	public List<Post> findAllPosts() {
		
		return postRepositary.findAll();
	}

	@Override
	public Optional<Post> findById(long id) {
		
		return postRepositary.findById(id);
	}

	@Override
	public void deleteByPostId(long id) {
		 postRepositary.deleteById(id);
		
	}

	@Override
	public Post updatePost(Post post,long id) {
		/*
		 * postRepositary.findById(id); Post post1=new Post();
		 * 
		 * post.setId(id); post.setTitile(post.getTitile());
		 * post.setDescription(post.getDescription()); post.getComments();
		 */
		 
		Post post1 = new Post();
		post1.setId(id);
		post1.setTitile(post.getTitile());
		post1.setDescription(post.getDescription());
		
		  List<Comment> comments=new ArrayList<>();
		  
		  
		  for(Comment cm:post.getComments()) {
			  Comment comment=new Comment();
			  comment.setId(cm.getId());
			  comment.setText(cm.getText());
			  comments.add(comment);
		  }
		
		  
		 
		  post1.setComments(comments);
		
		 return postRepositary.save(post1);
	}

	

	


}
