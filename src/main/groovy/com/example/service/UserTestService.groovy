package com.example.service

import com.example.domain.UserInfo
import com.example.domain.UserTest

interface UserTestService {

    def saveUserTests(List<UserTest> users)

    def saveUserInfoList(List<UserInfo> userInfoList)

    UserTest getUserTestById(int id)

//    List<UserTest> getUserTestByName(String name) { null }

//    List<UserTest> getUserTestAll() { null }

}