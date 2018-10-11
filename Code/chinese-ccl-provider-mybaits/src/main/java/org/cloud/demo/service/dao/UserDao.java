package org.cloud.demo.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.demo.service.model.User;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserDao {  
		
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> getAllUsers();
}
