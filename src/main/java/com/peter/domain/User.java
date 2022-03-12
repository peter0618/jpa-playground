package com.peter.domain;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;

    private String name;

    private int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
