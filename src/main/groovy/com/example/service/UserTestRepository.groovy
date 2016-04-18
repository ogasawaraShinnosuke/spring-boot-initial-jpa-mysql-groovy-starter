package com.example.service

import com.example.domain.UserTest

//import org.springframework.data.domain.Page
import org.springframework.data.repository.Repository
import org.springframework.stereotype.Component

//import java.awt.print.Pageable

@Component('userTestRepository')
interface UserTestRepository extends Repository<UserTest, Integer> {

    UserTest findById(int id)

//    Page<UserTest> findAll(Pageable pageable)

}
