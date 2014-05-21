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
package org.openmrs.module.bpreadings.api.impl;

import org.openmrs.api.db.DAOException;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.bpreadings.bpr;
import org.openmrs.module.bpreadings.api.BPReadingModuleService;
import org.openmrs.module.bpreadings.api.db.BPReadingModuleDAO;

/**
 * It is a default implementation of {@link BPReadingModuleService}.
 */
public class BPReadingModuleServiceImpl extends BaseOpenmrsService implements BPReadingModuleService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private BPReadingModuleDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(BPReadingModuleDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public BPReadingModuleDAO getDao() {
	    return dao;
    }

	@Override
	public bpr getbpreading(Integer id) throws DAOException {
		return dao.getbpr(id);
	}

	@Override
	public void savebpreading(bpr b) throws DAOException {
		dao.savebpr(b);
	}
}