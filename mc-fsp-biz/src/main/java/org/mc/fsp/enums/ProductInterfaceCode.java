/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-04-28
 */
package org.mc.fsp.enums;

import lombok.Getter;
import org.mc.fsp.constants.ProductInterfaceConstants;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-04-28
 */
@Getter
public enum ProductInterfaceCode implements InterfaceCode{

    GET_ALL_PRODUCTS(ProductInterfaceConstants.GET_ALL_PRODUCTS, "Get all products"),
    ;

    /**
     * url
     */
    final String url;

    /**
     * description
     */
    final String desc;

    /**
     * constructor
     *
     * @param url url
     * @param desc description
     */
    ProductInterfaceCode(String url, String desc) {
        this.url = url;
        this.desc = desc;
    }
}
