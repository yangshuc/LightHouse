package com.lighthouse.controller;

import com.lighthouse.entity.Posts;
import com.lighthouse.entity.Users;
import com.lighthouse.service.PostsService;
import com.lighthouse.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ysc
 * @since 2024-10-27
 */
@RestController
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    PostsService postsService;
    @Autowired
    UsersService usersService;
    @GetMapping("/searchPostsByName/{name}")
    public List<Posts> searchPostsByName(@PathVariable("name") String name){
        Users users = usersService.searchUserByName(name);
        List<Posts> posts = postsService.searchPostByUserId(users.getId());
        return posts;
    }

    @GetMapping("/searchPostById/{name}/{id}")
    public List<Posts> searchPostById(@PathVariable("name") String name,@PathVariable("id") Integer id){
        List<Posts> posts = postsService.searchPostByUserId(id);
        return posts;
    }
}
