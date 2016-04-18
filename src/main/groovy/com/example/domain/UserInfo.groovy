package com.example.domain

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table
class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    enum SEX {
        MAN, WOMAN
    }

    @Id
    @GeneratedValue
    int id

    @Column(name = 'user_id')
    int userId

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    SEX sex

    @Column(nullable = true)
    String email

    @Column(nullable = true)
    String password

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = 'id', referencedColumnName = 'user_id')
    UserTest userTest
}
