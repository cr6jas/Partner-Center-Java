// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.domains;

import com.microsoft.store.partnercenter.BasePartnerComponentString;
import com.microsoft.store.partnercenter.IPartner;

public class DomainCollectionOperations 
	extends BasePartnerComponentString
	implements IDomainCollection
{

	/**
	 * Initializes a new instance of the DomainCollectionOperations class
	 * 
	 * @param rootPartnerOperations The root partner operations instance.
	 */
	public DomainCollectionOperations(IPartner rootPartnerOperations)
	{
		super(rootPartnerOperations);
	}

	/**
	 * Obtains a specific domain behavior.
	 * 
	 * @param domain The domain.
     * @return The domain operations.
	 */
	@Override
	public IDomain byDomain(String domain)
	{
		return new DomainOperations(this.getPartner(), domain);
	}
}