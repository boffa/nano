// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * No longer applicable to any eBay categories.
 * 
 */
public class AttributeSetArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeSet")
	@Order(value=0)
	public List<AttributeSetType> attributeSet;	
	
    
}