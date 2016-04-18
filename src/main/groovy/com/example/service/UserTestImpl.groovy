package com.example.service

import com.example.domain.UserTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component('userTestService')
@Transactional(readOnly = true)
class UserTestImpl implements UserTestService {

    @Autowired
    UserTestRepository userTestRepository

    @Override
    UserTest getUserTestById(int id) {
        userTestRepository.findById id
    }

//    @Override
//    List<UserTest> getUserTestByName(String name) {
//
//    }
//
//    @Override
//    List<UserTest> getUserTestAll() {
//        userTestRepository.findAll()
//    }
}
