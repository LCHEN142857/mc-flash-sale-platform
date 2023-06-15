/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.manage.product.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.mc.fsp.common.db.dao.mapper.ProductPrimaryMapper;
import org.mc.fsp.common.db.po.ProductPrimaryPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-06-13
 */
@Slf4j
@Service
public class ProductPrimaryServiceImpl {

    @Autowired
    ProductPrimaryMapper productPrimaryMapper;

    public List<ProductPrimaryPo> get() {
        List<ProductPrimaryPo> allProducts = productPrimaryMapper.getAllProducts();
        System.out.println(allProducts);
        return allProducts;
    }
}
