package com.example.service.repository

import com.example.domain.entity.UserInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component('userInfoRepository')
interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

//    @Query('select id,userId,email,sex from UserInfo where userId = ?1')
//    List<UserInfo> findByUserId(int userId)

    List<UserInfo> findByUserId(int userId)

    List<UserInfo> findByEmail(String email)

    List<UserInfo> findByUserIdAndEmail(int userId, String email)

    List<UserInfo> findByUserIdAndSexAndEmail(int userId, int sex, String email)
}
