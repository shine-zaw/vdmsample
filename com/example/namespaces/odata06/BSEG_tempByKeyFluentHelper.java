
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.21.0
 */

package com.example.namespaces.odata06;

import java.util.Map;
import javax.annotation.Nonnull;
import com.example.namespaces.odata06.selectable.BSEG_tempSelectable;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;


/**
 * Fluent helper to fetch a single {@link com.example.namespaces.odata06.BSEG_temp BSEG_temp} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BSEG_tempByKeyFluentHelper
    extends FluentHelperByKey<BSEG_tempByKeyFluentHelper, BSEG_temp, BSEG_tempSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.example.namespaces.odata06.BSEG_temp BSEG_temp} entity with the provided key field values. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param bukrs
     *     Bukrs<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param gjahr
     *     Gjahr<p>Constraints: Not nullable, Maximum length: 4</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code BSEG_temp}
     * @param buzei
     *     Buzei<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param belnr
     *     Belnr<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public BSEG_tempByKeyFluentHelper(
        @Nonnull
        final String servicePath, final String bukrs, final String belnr, final String gjahr, final String buzei) {
        super(servicePath);
        this.key.put("Bukrs", bukrs);
        this.key.put("Belnr", belnr);
        this.key.put("Gjahr", gjahr);
        this.key.put("Buzei", buzei);
    }

    @Override
    @Nonnull
    protected Class<BSEG_temp> getEntityClass() {
        return BSEG_temp.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
