package com.example.domain.entity

import com.example.common.EnumBase
import groovy.transform.Canonical

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
@Canonical
class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    int id

    @Column(name = 'user_id')
    int userId

    @Column(nullable = false)
    int sex

    enum Sex implements EnumBase<Integer> {
        MAN(1), WOMAN(2)
        int value

        Sex(value) {
            this.value = value
        }

        @Override
        Integer get() {
            this.value
        }
    }

    @Column(nullable = true)
    String email

    @Column(nullable = true)
    String password

    @OneToOne
    @JoinColumn(name = 'id', referencedColumnName = 'user_id')
    UserTest userTest
}
