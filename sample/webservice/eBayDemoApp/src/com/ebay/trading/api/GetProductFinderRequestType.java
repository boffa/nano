// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as the call is no longer available.
 * 
 * 
 */
@RootElement(name = "GetProductFinderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductFinderRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeSystemVersion")
	@Order(value=0)
	public String attributeSystemVersion;	
	
	@Element(name = "ProductFinderID")
	@Order(value=1)
	public List<Integer> productFinderID;	
	
    
}