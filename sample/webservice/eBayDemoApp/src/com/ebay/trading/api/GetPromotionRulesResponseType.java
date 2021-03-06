// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Returns all promotion rules associated with the specified item or store category.
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;strong xmlns="urn:ebay:apis:eBLBaseComponents" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsdlsoap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Note:&lt;/strong&gt;
 * </pre>
 *  eBay Store Cross Promotions are no longer supported in the
 * Trading API.
 */
@RootElement(name = "GetPromotionRulesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetPromotionRulesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PromotionRuleArray")
	@Order(value=0)
	public PromotionRuleArrayType promotionRuleArray;	
	
    
}