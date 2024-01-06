package com.projects.One.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsernameExistsResponse {

    /**
     * Username exists
     */
    private Boolean exists;
}


