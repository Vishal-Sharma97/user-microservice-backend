package com.buddy.logic.user.repository;

import com.buddy.logic.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmailId(String emailId);
    List<UserEntity> findByUserName(String userName);
    UserEntity findBySecId(Long secId);
}
