package com.example.service

import com.example.domain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component('userInfoRepository')
interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
