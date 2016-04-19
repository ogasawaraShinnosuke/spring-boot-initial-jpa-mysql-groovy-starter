package com.example.service

import com.example.domain.UserInfo
import com.example.domain.UserTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component('userTestService')
@Transactional(readOnly = false)
class UserTestImpl implements UserTestService {

    @Autowired
    UserTestRepository userTestRepository

    @Autowired
    UserInfoRepository userInfoRepository

    @Override
    def saveUserTests(List<UserTest> users) {
        users.each { user -> userTestRepository.save(user) }
    }

    @Override
    def saveUserInfoList(List<UserInfo> users) {
        users.each { user -> userInfoRepository.save(user) }
    }

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
