package com.example.service.repository

import com.example.domain.entity.UserHistory
import org.springframework.data.repository.CrudRepository

interface UserHistoryRepository extends CrudRepository<UserHistory, Integer> {
    List<UserHistory> findById(int id)

    List<UserHistory> findByUserId(int userId)

    List<UserHistory> findByBillingFlg(boolean billingFlg)

}
