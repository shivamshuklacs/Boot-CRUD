package com.zensar.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> list=new ArrayList<>(Arrays.asList(
			new User("111","SHIVAM"),
			new User("222","SHUKLA")
			));


	public void addUser(User user) {
		list.add(user);
	}
	
	public List<User> getAllUser() {
		return list;
	}
	
	public User getUserByid(String id)
	{
		return list.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
	
	public User deleteUser(String id) {
		User duser = null;
		for(User u : list) {
			if(u.getId().equals(id)) {
				list.remove(u);
				duser=u;
				break;
			}
		}
		return duser;
	}
}
