
package com.redn.connect.util.ConnectUtilsConnector.Util.generated.adapters;

import com.redn.connect.util.ConnectUtilsConnector.Util.ConnectUtilsConnector;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ConnectUtilsConnectorProcessAdapter</code> is a wrapper around {@link ConnectUtilsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2016-11-24T07:08:09+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class ConnectUtilsConnectorProcessAdapter
    extends ConnectUtilsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<ConnectUtilsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ConnectUtilsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ConnectUtilsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ConnectUtilsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ConnectUtilsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ConnectUtilsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
