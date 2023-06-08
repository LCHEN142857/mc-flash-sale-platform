/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-04-28
 */
package org.mc.fsp.controller;

import org.mc.fsp.constants.AppConstants;
import org.mc.fsp.constants.ProductInterfaceConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-04-28
 */
@RestController
@RequestMapping(AppConstants.APP_INTERFACE_URL_PREFIX)
public class ProductController {

    @GetMapping(ProductInterfaceConstants.GET_ALL_PRODUCTS)
    public String getAllProducts() {
        return "you get it.";
    }

}
