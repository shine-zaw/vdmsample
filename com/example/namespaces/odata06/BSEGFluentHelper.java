
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.21.0
 */

package com.example.namespaces.odata06;

import javax.annotation.Nonnull;
import com.example.namespaces.odata06.selectable.BSEGSelectable;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;


/**
 * Fluent helper to fetch multiple {@link com.example.namespaces.odata06.BSEG BSEG} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BSEGFluentHelper
    extends FluentHelperRead<BSEGFluentHelper, BSEG, BSEGSelectable>
{


    /**
     * Creates a fluent helper using the specified service path to send the read requests.
     * 
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public BSEGFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<BSEG> getEntityClass() {
        return BSEG.class;
    }

}
