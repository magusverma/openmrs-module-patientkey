/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.bpreadings.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.api.db.DAOException;
import org.openmrs.module.bpreadings.bpr;
import org.openmrs.module.bpreadings.api.db.BPReadingModuleDAO;

/**
 * It is a default implementation of  {@link BPReadingModuleDAO}.
 */
public class HibernateBPReadingModuleDAO implements BPReadingModuleDAO {
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	/**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
    }
    
	/**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
	    return sessionFactory;
    }

	@Override
	public bpr getbpr(Integer id) throws DAOException {
		return (bpr) sessionFactory.getCurrentSession().get(bpr.class, id);
	}

	@Override
	public void savebpr(bpr b) throws DAOException {
		sessionFactory.getCurrentSession().saveOrUpdate(b);
	}
}