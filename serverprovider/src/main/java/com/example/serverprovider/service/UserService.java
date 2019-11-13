package com.example.serverprovider.service;



import com.example.serverprovider.entity.User;
import com.example.serverprovider.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
	@Autowired
	private UserDao dao;

	public User finduser()throws Exception{
		System.out.println(dao);

		return (User)dao.selectUser().get(0);
	}

	@Cacheable(cacheNames = "usera")
	public User getEmp(Integer id) {
		User user=new User();
		user.setAge(id);
		System.out.println("查询" + id + "号员工");
		return user;
	}

	@CachePut(cacheNames = "usera")
	public User updateEmp(User user) {
		return user;
	}

	@CacheEvict(cacheNames = "usera", key = "#id")
	public void deleteEmp(Integer id) {
	}


}
