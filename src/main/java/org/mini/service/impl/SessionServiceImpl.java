/**
 * 
 */
package org.mini.service.impl;

import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mini.framework.service.SessionService;
import org.mini.persist.modules.dao.DemoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 *
 */
@Service
@Repository("sessionService")
public class SessionServiceImpl implements SessionService {
	private static Logger logger = LoggerFactory.getLogger(SessionServiceImpl.class);

	@Resource
	private DemoDao demoDao;
	
	@Override
	public boolean checkAuthority(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public boolean checkAuthority(HttpServletRequest request,
			HttpServletResponse response, String sessionKey,
			Set<String> filterUrlList, String redirectURL) {
		// TODO Auto-generated method stub
		logger.debug("service注入成功了");
		if(demoDao != null) {
			logger.debug("dao注入成功了");
		}
		return true;
	}

}
