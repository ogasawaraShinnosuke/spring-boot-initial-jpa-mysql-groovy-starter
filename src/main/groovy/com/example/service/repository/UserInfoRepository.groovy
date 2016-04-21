package com.example.service.repository

import com.example.domain.entity.UserInfo
import com.example.domain.entity.UserTest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Component

@Component('userInfoRepository')
interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

//    @Query('select id,userId,email,sex from UserInfo where userId = ?1')
//    List<UserInfo> findByUserId(int userId)

    List<UserInfo> findByUserId(int userId)

    List<UserInfo> findByEmail(String email)

    List<UserInfo> findByUserIdAndEmail(int userId, String email)

    List<UserInfo> findByUserIdAndSexAndEmail(int userId, int sex, String email)

//    @Query('UserTest.findUserTestByUserId')
    @Query('select ut.id,ut.name,ui.email,ui.sex from UserTest ut inner join ut.userInfo ui where ut.id = :userId')
    List<UserTest> findUserTestByUserId(@Param('userId') int userId)
}
