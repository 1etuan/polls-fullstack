package com.example.polls.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;

    public Role() {

    }

    public RoleName name() {
        return name;
    }

    public RoleName getName() {
        return name;
    }

    public RoleName setName(RoleName name) {
        this.name = name;
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
