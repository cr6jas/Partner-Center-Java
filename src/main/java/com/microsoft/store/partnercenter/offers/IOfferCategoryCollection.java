// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license. See the LICENSE file in the project root for full license information.

package com.microsoft.store.partnercenter.offers;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.offers.OfferCategory;

/**
 * Represents the behavior of offer categories available to partners.
 */
public interface IOfferCategoryCollection
    extends IPartnerComponentString, IEntireEntityCollectionRetrievalOperations<OfferCategory, ResourceCollection<OfferCategory>>
{
    /**
     * Retrieves all offer categories available to the partner for the provided country.
     * 
     * @return All offer categories for the provided country.
     */
    ResourceCollection<OfferCategory> get();
}