package com._bin.auth.model;

import jakarta.persistence.*;

@Entity
@Table(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    public  String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
