package com.example.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
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

    @OneToOne(mappedBy = 'userTest')
    UserHistory userHistory
}
