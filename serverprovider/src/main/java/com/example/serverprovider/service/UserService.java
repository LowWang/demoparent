package com.example.serverprovider.service;



import com.example.serverprovider.entity.User;
import com.example.serverprovider.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
	@Autowired
	private UserDao dao;

	public User finduser()throws Exception{
		System.out.println(dao);

		return (User)dao.selectUser().get(0);
	}
}
