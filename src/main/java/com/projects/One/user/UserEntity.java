package com.projects.One.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {

    /**
     * Username
     */
    @Id
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


