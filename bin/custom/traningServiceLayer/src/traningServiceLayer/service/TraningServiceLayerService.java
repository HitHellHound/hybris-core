/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package traningServiceLayer.service;

public interface TraningServiceLayerService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
