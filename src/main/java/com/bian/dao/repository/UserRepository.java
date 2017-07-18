package com.bian.dao.repository;

import com.bian.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/7/18 0018.
 */
public interface UserRepository extends JpaRepository<UserEntity, Long>{
}
