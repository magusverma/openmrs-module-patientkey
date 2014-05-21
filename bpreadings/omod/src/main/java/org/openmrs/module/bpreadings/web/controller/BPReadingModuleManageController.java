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
package org.openmrs.module.bpreadings.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.bpreadings.bpr;
import org.openmrs.module.bpreadings.api.BPReadingModuleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The main controller.
 */
@Controller
public class  BPReadingModuleManageController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/module/bpreadings/manage", method = RequestMethod.GET)
	public void manage(ModelMap model) {
		model.addAttribute("user", Context.getAuthenticatedUser());
		System.out.println("\n\n\n\n\nn\n\n\n\n\n\nn\n\n\n i AM HEREEEEEEEEEEEE");
	}
	
	@RequestMapping(value = "/module/bpreadings/manage", method = RequestMethod.POST)
	public void addFavoritePatient(
			@RequestParam("id") Integer id,	
			@RequestParam("patient_id") Integer patient_id,
			@RequestParam("bpreading") Integer bpreading) {
		bpr a = new bpr();
		
		System.out.println("\n\n\n\n\nn\n\n\n\n\n\nn\n\n\n i am theEEEEEEEEEEEREE id="+ id);
		
		a.setBpreading(bpreading);
		a.setId(id);
		a.setPatient_id(patient_id);
		Context.getService(BPReadingModuleService.class).savebpreading(a);
		System.out.println("OBJect ban gayaaaaaaaaaaaaaaaaa");
	}
}
