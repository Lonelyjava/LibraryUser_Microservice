package com.lib.user.demo.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lib.user.demo.entity.UserEntity;

@Repository
public interface UserReposistory extends JpaRepository<UserEntity, Long>{
	
	
	

}
