package com.mydlp.ui.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class AbstractReportDAO extends HibernateDaoSupport {
	
	@Autowired
	@Qualifier("reportSessionFactory")
	public void anyMethodName(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

}