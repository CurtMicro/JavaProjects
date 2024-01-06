package com.projects.One.user;

import lombok.Data;

@Data
public class UserRequest {

    /**
     * Username
     */
    private String username;

    /**
     * User's full name
     */
    private String fullName;

    /**
     * User's Password
     */
    private String password;
}


