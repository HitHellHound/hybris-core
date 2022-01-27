/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package superconcerttours.service;

public interface SuperconcerttoursService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
