package model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

// Changed in order to allow same passwords but not same emails
@Data
@MappedSuperclass
public class User {
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;

    private String name;
    private String password;
    private String address;


}
