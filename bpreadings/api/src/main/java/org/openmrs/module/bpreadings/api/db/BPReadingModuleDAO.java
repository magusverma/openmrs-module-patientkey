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
package org.openmrs.module.bpreadings.api.db;

import org.openmrs.api.db.DAOException;
import org.openmrs.module.bpreadings.bpr;
import org.openmrs.module.bpreadings.api.BPReadingModuleService;

/**
 *  Database methods for {@link BPReadingModuleService}.
 */
public interface BPReadingModuleDAO {
	
	/*
	 * Add DAO methods here
	
	public Integer getBpreading();
	public void setBpreading(Integer bpreading) ;
	public Integer getId();
	public void setId(Integer id);
	public Integer getPatient_id();
	public void setPatient_id(Integer patient_id);
	 */
	public bpr getbpr(Integer id) throws DAOException ;
	public void savebpr(bpr b) throws DAOException ; 	
}