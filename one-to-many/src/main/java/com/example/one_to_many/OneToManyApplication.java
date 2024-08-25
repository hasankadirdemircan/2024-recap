package com.example.one_to_many;

import com.example.one_to_many.model.Comment;
import com.example.one_to_many.model.Post;
import com.example.one_to_many.repository.CommentRepository;
import com.example.one_to_many.repository.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	private CommentRepository commentRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//postSave();
		//commentSave();
		postRepository.deleteById(5L);
		Post post = new Post();
		Comment comment = new Comment();
		comment.setAuthorName("A");
		comment.setText("hello world");
		comment.setPost(post);
		post.setComments(List.of(comment));
		post.setTitle("Post Title3");
		post.setContent("Post Content3");
		post.setUserId(3L);

		postRepository.save(post);
	}

	private void findPost() {
		Post post = postRepository.findById(1L).orElseThrow(() ->new RuntimeException("no data"));
		System.out.println(post.getComments());
	}
	private void commentSave() {
		Comment comment1 = new Comment();
		comment1.setAuthorName("A");
		comment1.setText("hello world");
		comment1.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment1);

		Comment comment2 = new Comment();
		comment2.setAuthorName("B");
		comment2.setText("hello world2");
		comment2.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment2);

		Comment comment3 = new Comment();
		comment3.setAuthorName("C");
		comment3.setText("hello world3");
		comment3.setPost(postRepository.findById(1L).get());
		commentRepository.save(comment3);
	}

	private void postSave() {
		Post post1 = new Post();
		post1.setTitle("Post Title1");
		post1.setContent("Post Content1");
		post1.setUserId(1L);

		Post post2 = new Post();
		post2.setTitle("Post Title2");
		post2.setContent("Post Content2");
		post2.setUserId(2L);

		Post post3 = new Post();
		post3.setTitle("Post Title3");
		post3.setContent("Post Content3");
		post3.setUserId(3L);

		postRepository.save(post1);
		postRepository.save(post2);
		postRepository.save(post3);
	}
}
