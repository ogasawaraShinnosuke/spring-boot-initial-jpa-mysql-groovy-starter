package com.example.service

import com.example.domain.entity.UserHistory
import com.example.domain.entity.UserInfo
import com.example.domain.entity.UserTest

interface UserTestService {

    def saveUserTests(List<UserTest> users)

    def saveUserInfoList(List<UserInfo> userInfoList)

    UserTest getUserTestById(int id)

    List<UserInfo> findByUserId(int userId)

    List<UserInfo> findByEmail(String email)

    List<UserInfo> findByUserIdAndEmail(int userId, String email)

    List<UserInfo> findByUserIdAndSexAndEmail(int userId, int sex, String email)

    List<UserHistory> findHistoryById(int id)

    List<UserHistory> findHistoryByUserId(int userId)

    List<UserHistory> findByBillingFlg(boolean billingFlg)

    List<UserTest> findUserTestByUserId(int userId)

//    List<UserInfo> getUserInfoByUserId(int id)

//    List<UserTest> getUserTestByName(String name) { null }

//    List<UserTest> getUserTestAll() { null }

}