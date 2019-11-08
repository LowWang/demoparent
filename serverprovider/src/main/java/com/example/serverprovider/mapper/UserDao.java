package com.example.serverprovider.mapper;




import com.example.serverprovider.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
	List<User> selectUser();
}
