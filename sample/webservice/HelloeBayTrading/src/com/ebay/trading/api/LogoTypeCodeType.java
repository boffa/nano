// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * This type is deprecated because this type is not used by any call.
 * 
 * 
 */
public enum LogoTypeCodeType {

    /**
     * 
   * 
   * The PayPal Winning Bidder Notice logo.
   * 
     */
    WINNING_BIDDER_NOTICE("WinningBidderNotice"),
  

    /**
     * 
   * 
   * The seller's eBay Store logo.
   * 
     */
    STORE("Store"),
  

    /**
     * 
   * 
   * A custom logo specified in LogoURL.
   * 
     */
    CUSTOM("Custom"),
  

    /**
     * 
   * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    LogoTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static LogoTypeCodeType fromValue(String v) {
        if (v != null) {
            for (LogoTypeCodeType c: LogoTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}