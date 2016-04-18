package com.example.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table
class UserTest implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    int id

    @Column(nullable = false)
    String name

    @Column(nullable = false)
    Date created

    @Column(nullable = false)
    Date updated

    @OneToOne(mappedBy = 'userTest')
    UserInfo userInfo
}
