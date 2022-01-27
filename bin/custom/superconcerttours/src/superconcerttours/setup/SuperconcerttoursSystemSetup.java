/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package superconcerttours.setup;

import static superconcerttours.constants.SuperconcerttoursConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import superconcerttours.constants.SuperconcerttoursConstants;
import superconcerttours.service.SuperconcerttoursService;


@SystemSetup(extension = SuperconcerttoursConstants.EXTENSIONNAME)
public class SuperconcerttoursSystemSetup
{
	private final SuperconcerttoursService superconcerttoursService;

	public SuperconcerttoursSystemSetup(final SuperconcerttoursService superconcerttoursService)
	{
		this.superconcerttoursService = superconcerttoursService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		superconcerttoursService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return SuperconcerttoursSystemSetup.class.getResourceAsStream("/superconcerttours/sap-hybris-platform.png");
	}
}
