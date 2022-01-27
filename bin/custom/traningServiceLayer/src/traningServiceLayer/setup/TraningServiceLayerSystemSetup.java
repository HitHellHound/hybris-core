/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package traningServiceLayer.setup;

import static traningServiceLayer.constants.TraningServiceLayerConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import traningServiceLayer.constants.TraningServiceLayerConstants;
import traningServiceLayer.service.TraningServiceLayerService;


@SystemSetup(extension = TraningServiceLayerConstants.EXTENSIONNAME)
public class TraningServiceLayerSystemSetup
{
	private final TraningServiceLayerService traningServiceLayerService;

	public TraningServiceLayerSystemSetup(final TraningServiceLayerService traningServiceLayerService)
	{
		this.traningServiceLayerService = traningServiceLayerService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		traningServiceLayerService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return TraningServiceLayerSystemSetup.class.getResourceAsStream("/traningServiceLayer/sap-hybris-platform.png");
	}
}
