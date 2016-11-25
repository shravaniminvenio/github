
package com.redn.connect.util.ConnectUtilsConnector.Util.generated.adapters;

import com.redn.connect.util.ConnectUtilsConnector.Util.ConnectUtilsConnector;
import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;


/**
 * A <code>ConnectUtilsConnectorCapabilitiesAdapter</code> is a wrapper around {@link ConnectUtilsConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-11-24T07:08:09+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class ConnectUtilsConnectorCapabilitiesAdapter
    extends ConnectUtilsConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
