/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package traningServiceLayer.controller;

import static traningServiceLayer.constants.TraningServiceLayerConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import traningServiceLayer.service.TraningServiceLayerService;


@Controller
public class TraningServiceLayerHelloController
{
	@Autowired
	private TraningServiceLayerService traningServiceLayerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", traningServiceLayerService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
