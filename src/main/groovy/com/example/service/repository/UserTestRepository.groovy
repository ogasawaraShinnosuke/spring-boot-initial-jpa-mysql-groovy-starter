package com.example.service.repository

import com.example.domain.entity.UserTest
import org.springframework.data.jpa.repository.JpaRepository

import org.springframework.stereotype.Component


@Component('userTestRepository')
interface UserTestRepository extends JpaRepository<UserTest, Integer> {

    UserTest findById(int id)

//    Page<UserTest> findAll(Pageable pageable)

}
