// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Used to indicate whether Default, WorkFlow A or WorkFlow B is applicable for a category.
 * 
 */
public enum INEscrowWorkflowTimelineCodeType {

    /**
     * 
   * Default Escrow timelines apply.
   * 
     */
    DEFAULT("Default"),
  

    /**
     * 
   * Special Escrow timelines for Workflow A applies.
   * 
     */
    WORKFLOW_A("WorkflowA"),
  

    /**
     * 
   * Special Escrow timelines for Workflow B applies.
   * 
     */
    WORKFLOW_B("WorkflowB"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    INEscrowWorkflowTimelineCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static INEscrowWorkflowTimelineCodeType fromValue(String v) {
        if (v != null) {
            for (INEscrowWorkflowTimelineCodeType c: INEscrowWorkflowTimelineCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}