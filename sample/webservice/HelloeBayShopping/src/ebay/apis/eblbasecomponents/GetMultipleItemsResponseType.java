// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Response to request of GetMultipleItems.
 * 
 */
@RootElement(name = "GetMultipleItemsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMultipleItemsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Item")
	@Order(value=0)
	public List<SimpleItemType> item;	
	
    
}