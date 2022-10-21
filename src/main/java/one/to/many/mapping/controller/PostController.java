package one.to.many.mapping.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import one.to.many.mapping.Entity.Comment;
import one.to.many.mapping.Entity.Post;
import one.to.many.mapping.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping("/post")
	public Post savePost(@RequestBody Post post) {
		Post postresponce = postService.saveUser(post);
		return postresponce;
	}

	@GetMapping("All")
	public List<Post> findAllPosts() {
		return postService.findAllPosts();
	}

	@GetMapping("postId")
	public Optional<Post> findByPostId(@RequestParam long id) {
		return postService.findById(id);
	}

	@DeleteMapping("DeletePostId")
	public ResponseEntity<String> deletePostId(long id) {
		postService.deleteByPostId(id);
		return new ResponseEntity<String>("User details deleted Successfully ", HttpStatus.OK);
	}

	@PutMapping("update")
	public Post updatePost( @RequestBody Post post,@RequestParam long id) {
		
		 
		return postService.updatePost(post,id);
	}

}
