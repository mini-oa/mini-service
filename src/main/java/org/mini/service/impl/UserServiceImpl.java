/**
 * 
 */
package org.mini.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mini.model.system.User;
import org.mini.persist.modules.dao.UserDao;
import org.mini.service.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
@Service
@Repository
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public void insert(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.insert(user);
	}

	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public List<User> search(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.search(user);
	}

	@Override
	public void delete(long id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
