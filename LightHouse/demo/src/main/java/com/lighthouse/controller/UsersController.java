package com.lighthouse.controller;

import com.lighthouse.entity.Comments;
import com.lighthouse.entity.Posts;
import com.lighthouse.entity.Users;
import com.lighthouse.service.PostsService;
import com.lighthouse.service.UsersService;
import com.lighthouse.service.impl.PostsServiceImpl;
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
@RequestMapping("/users")
public class UsersController {

}
