// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for a list of offers. May contain zero, one, or multiple
 * OfferType objects, each of which represents one offer extended by
 * a user on a listing.
 * 
 */
public class CancelOfferArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CancelOffer")
	@Order(value=0)
	public List<CancelOfferType> cancelOffer;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}