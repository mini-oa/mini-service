/**
 * 
 */
package org.mini.service.impl;

import javax.annotation.Resource;

import org.mini.model.Employee;
import org.mini.persist.modules.dao.EmployeeDao;
import org.mini.service.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 *
 */
/* 下面这两个我也没什么好解释的，就是spring的ioc要用到的，照着复制粘贴就好了  */
@Service
@Repository
public class EmployeeServiceImpl implements EmployeeService {
	
	/* 这个也是ioc要求注入的 ，照复制粘贴  */
	@Resource
	private EmployeeDao employeeDao;

	@Override
	public boolean checkLogin(String loginName, String password)
			throws Exception {
		// TODO Auto-generated method stub
		// 实现需要逻辑，比如判断一下用户名，密码不能为空呀，用户名和密码至少是多长呀
		
		//全面的判断都通过了，才跟数据库打交道，否则就不用了。直接返回false;
		
		Employee employee = employeeDao.query(loginName, password);
		
		// 如果非空，有该用户，就返回true, 否则返回false;
		//return employee != null;
		
		//算了，初学者的写法一般是这样的
		if(employee != null) {
			return true;
		} else {
			return false;
		}
	}

}
