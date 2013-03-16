/**
 * 
 */
package org.mini.service;

import java.io.Serializable;
import java.util.List;

import org.mini.model.Demo;

/**
 * @author Administrator
 *
 */
public interface DemoService {
	List<Demo> queryBySql(String sql);
	
	Demo queryById(Serializable id);
	
	List<Demo> queryAll() throws Exception;
	
	Demo queryDemo(Demo demo) throws Exception;
}
