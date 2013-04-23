// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *   This type is deprecated as Cross Promotions are no longer supported in the APIs.
 * 
 * 
 */
public class PromotionRuleType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PromotedStoreCategoryID")
	@Order(value=0)
	public Long promotedStoreCategoryID;	
	
	@Element(name = "PromotedeBayCategoryID")
	@Order(value=1)
	public String promotedeBayCategoryID;	
	
	@Element(name = "PromotedKeywords")
	@Order(value=2)
	public String promotedKeywords;	
	
	@Element(name = "ReferringItemID")
	@Order(value=3)
	public String referringItemID;	
	
	@Element(name = "ReferringStoreCategoryID")
	@Order(value=4)
	public Long referringStoreCategoryID;	
	
	@Element(name = "ReferringeBayCategoryID")
	@Order(value=5)
	public String referringeBayCategoryID;	
	
	@Element(name = "ReferringKeywords")
	@Order(value=6)
	public String referringKeywords;	
	
	@Element(name = "PromotionScheme")
	@Order(value=7)
	public PromotionSchemeCodeType promotionScheme;	
	
	@Element(name = "PromotionMethod")
	@Order(value=8)
	public PromotionMethodCodeType promotionMethod;	
	
	@AnyElement
	@Order(value=9)
	public List<Object> any;	
	
    
}