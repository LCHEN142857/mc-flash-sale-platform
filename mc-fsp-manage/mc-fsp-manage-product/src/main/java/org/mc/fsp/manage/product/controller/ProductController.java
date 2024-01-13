/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.manage.product.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.mc.fsp.common.bean.vo.ProductPrimaryVo;
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
@Tag(name = "产品controller", description = "产品接口")
public class ProductController {

    @Autowired
    ProductPrimaryServiceImpl productPrimaryService;

    @GetMapping("/all")
    public List<ProductPrimaryVo> get(
//            @ApiParam(value = "查询请求体", name = "queryBody") ProductQueryRequest pqr
            ) {
        return productPrimaryService.get();
    }

}
