package com.example.domain

import org.hibernate.annotations.NaturalId

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class UserTest implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    int id

    @Column(nullable = false)
    @NaturalId
    String name

    @Column(nullable = false)
    @NaturalId
    Date created

    @Column(nullable = false)
    @NaturalId
    Date updated
}
