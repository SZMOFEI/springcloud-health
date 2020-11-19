package com.mofei.user;

import org.springframework.web.bind.annotation.*;

/**
 * @author mofei
 * @since   2020/11/19 17:54
 */
@RequestMapping("user")
@RestController
public class UserController {
    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return "user success " + id;
    }
}
