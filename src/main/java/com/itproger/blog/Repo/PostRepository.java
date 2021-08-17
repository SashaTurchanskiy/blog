package com.itproger.blog.Repo;

import com.itproger.blog.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long > {
}
