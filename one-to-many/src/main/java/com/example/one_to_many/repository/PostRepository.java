package com.example.one_to_many.repository;

import com.example.one_to_many.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
