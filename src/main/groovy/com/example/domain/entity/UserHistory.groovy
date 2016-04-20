package com.example.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class UserHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    int id

    @Column(name = 'user_id')
    int userId

    @Column
    boolean billingFlg

    @Column
    String userAgent

    @Column
    int loginFailCount

    @OneToOne
    @JoinColumn(name = 'id', referencedColumnName = 'user_id')
    UserTest userTest
}
