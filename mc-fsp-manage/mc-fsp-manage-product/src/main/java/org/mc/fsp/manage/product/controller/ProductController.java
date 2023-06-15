/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.manage.product.controller;

import org.mc.fsp.common.db.po.ProductPrimaryPo;
import org.mc.fsp.manage.product.service.impl.ProductPrimaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-06-13
 */
@RequestMapping("/fsp/mng/product")
@RestController
public class ProductController {

    @Autowired
    ProductPrimaryServiceImpl productPrimaryService;

    @GetMapping("/all")
    public List<ProductPrimaryPo> get() {
        return productPrimaryService.get();
    }

}
