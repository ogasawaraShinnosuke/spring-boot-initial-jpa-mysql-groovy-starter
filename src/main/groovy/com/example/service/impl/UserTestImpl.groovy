package com.example.service.impl

import com.example.domain.entity.UserHistory
import com.example.domain.entity.UserInfo
import com.example.domain.entity.UserTest
import com.example.service.repository.UserHistoryRepository
import com.example.service.repository.UserInfoRepository
import com.example.service.repository.UserTestRepository
import com.example.service.UserTestService
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

    @Autowired
    UserHistoryRepository userHistoryRepository

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

    @Override
    List<UserInfo> findByUserId(int userId) {
        userInfoRepository.findByUserId(userId)
    }

    @Override
    List<UserInfo> findByEmail(String email) {
        userInfoRepository.findByEmail(email)
    }

    @Override
    List<UserInfo> findByUserIdAndEmail(int userId, String email) {
        userInfoRepository.findByUserIdAndEmail(userId, email)
    }

    @Override
    List<UserInfo> findByUserIdAndSexAndEmail(int userId, int sex, String email) {
        userInfoRepository.findByUserIdAndSexAndEmail(userId, sex, email)
    }

    @Override
    List<UserHistory> findHistoryById(int id) {
        userHistoryRepository.findById(id)
    }

    @Override
    List<UserHistory> findHistoryByUserId(int userId) {
        userHistoryRepository.findByUserId(userId)
    }

    @Override
    List<UserHistory> findByBillingFlg(boolean billingFlg) {
        userHistoryRepository.findByBillingFlg(billingFlg)
    }
//    @Override
//    List<UserInfo> getUserInfoByUserId(int id) {
//        userInfoRepository.findByUserId id
//    }

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
