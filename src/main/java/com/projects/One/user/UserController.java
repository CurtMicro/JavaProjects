package com.projects.One.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Request to check if the username exists
     *
     * @param username the username to check
     * @return {@link UsernameExistsResponse} if the username exists
     * @Todo suggest a username
     */
    @GetMapping("/exists/{username}")
    public ResponseEntity<UsernameExistsResponse> getUsernameExists(@PathVariable String username) {
        return ResponseEntity.ok(userService.usernameExists(username));
    }

    /**
     * Request to return all users
     *
     * @return {@link List<UserResponse>} a list of users
     */
    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Request to return a User by username
     *
     * @param username a username to search
     * @return {@link UserResponse} the user response
     */
    @GetMapping("/{username}")
    public UserResponse getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    /**
     * Request to create a new User
     *
     * @param userRequest {@link UserRequest} a new User request
     * @return {@link UserResponse} the new User created
     */
    @PostMapping
    public UserResponse addUser(@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }

}
