// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Details the recoupment policy on this site.  There are two sites involved in recoupment - the listing site
 * and the user registration site, each of which must agree before eBay enforces recoupment for a seller and listing.
 * 
 */
public class RecoupmentPolicyDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EnforcedOnListingSite")
	@Order(value=0)
	public Boolean enforcedOnListingSite;	
	
	@Element(name = "EnforcedOnRegistrationSite")
	@Order(value=1)
	public Boolean enforcedOnRegistrationSite;	
	
	@Element(name = "DetailVersion")
	@Order(value=2)
	public String detailVersion;	
	
	@Element(name = "UpdateTime")
	@Order(value=3)
	public Date updateTime;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}