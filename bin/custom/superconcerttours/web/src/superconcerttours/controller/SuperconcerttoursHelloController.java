/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package superconcerttours.controller;

import static superconcerttours.constants.SuperconcerttoursConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import superconcerttours.service.SuperconcerttoursService;


@Controller
public class SuperconcerttoursHelloController
{
	@Autowired
	private SuperconcerttoursService superconcerttoursService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", superconcerttoursService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
