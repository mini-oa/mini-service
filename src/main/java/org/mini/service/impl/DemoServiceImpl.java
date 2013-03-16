/**
 * 
 */
package org.mini.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.mini.model.Demo;
import org.mini.persist.modules.dao.DemoDao;
import org.mini.service.DemoService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

/**
 * @author Administrator
 *
 */
@Service
@Repository
public class DemoServiceImpl implements DemoService {
	
	@Resource
	private DemoDao demoDao;

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Demo> queryBySql(String sql) {
		// TODO Auto-generated method stub
		return null;//demoDao.queryBySql(sql);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Demo queryById(Serializable id) {
		// TODO Auto-generated method stub
		return null;//demoDao.queryById(id);
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Demo> queryAll() throws Exception {
		// TODO Auto-generated method stub
		return demoDao.queryAll();
	}

	@Override
	public Demo queryDemo(Demo demo) throws Exception {
		// TODO Auto-generated method stub
		return demoDao.queryDemo(demo);
	}

}
