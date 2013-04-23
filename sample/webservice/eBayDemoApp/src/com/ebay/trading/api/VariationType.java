// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type defines the <b>Variation</b> container, which provides full
 * details on each item variation in a multi-variation listing.
 * 
 */
public class VariationType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SKU")
	@Order(value=0)
	public String sku;	
	
	@Element(name = "StartPrice")
	@Order(value=1)
	public AmountType startPrice;	
	
	@Element(name = "Quantity")
	@Order(value=2)
	public Integer quantity;	
	
	@Element(name = "VariationSpecifics")
	@Order(value=3)
	public NameValueListArrayType variationSpecifics;	
	
	@Element(name = "UnitsAvailable")
	@Order(value=4)
	public Integer unitsAvailable;	
	
	@Element(name = "UnitCost")
	@Order(value=5)
	public AmountType unitCost;	
	
	@Element(name = "SellingStatus")
	@Order(value=6)
	public SellingStatusType sellingStatus;	
	
	@Element(name = "VariationTitle")
	@Order(value=7)
	public String variationTitle;	
	
	@Element(name = "VariationViewItemURL")
	@Order(value=8)
	public String variationViewItemURL;	
	
	@Element(name = "Delete")
	@Order(value=9)
	public Boolean delete;	
	
	@Element(name = "SellingManagerProductInventoryStatus")
	@Order(value=10)
	public SellingManagerProductInventoryStatusType sellingManagerProductInventoryStatus;	
	
	@Element(name = "WatchCount")
	@Order(value=11)
	public Long watchCount;	
	
	@Element(name = "PrivateNotes")
	@Order(value=12)
	public String privateNotes;	
	
	@Element(name = "DiscountPriceInfo")
	@Order(value=13)
	public DiscountPriceInfoType discountPriceInfo;	
	
	@AnyElement
	@Order(value=14)
	public List<Object> any;	
	
    
}