/**
 * 
 */
package org.mini.service;

/**
 * @author Administrator
 *
 */
public interface EmployeeService {
	/* 没啥好说的，就是你想实现什么业务，取个名字，然后去实现呗  */
	boolean checkLogin(String loginName, String password) throws Exception;
}
