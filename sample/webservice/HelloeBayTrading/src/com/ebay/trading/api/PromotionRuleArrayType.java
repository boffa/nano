// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type is deprecated as Cross Promotions are no longer supported in the APIs.
 * 
 * 
 */
public class PromotionRuleArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PromotionRule")
	@Order(value=0)
	public List<PromotionRuleType> promotionRule;	
	
    
}