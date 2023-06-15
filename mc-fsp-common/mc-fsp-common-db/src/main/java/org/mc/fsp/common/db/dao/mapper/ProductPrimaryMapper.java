/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.common.db.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mc.fsp.common.db.po.ProductPrimaryPo;

import java.util.List;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-06-13
 */
@Mapper
public interface ProductPrimaryMapper {
//    @Select("SELECT product_id, product_name, status, create_time, update_time, update_manager FROM product_primary;")
    List<ProductPrimaryPo> getAllProducts();

    void insertProduct(ProductPrimaryPo product);
    void deleteProductById(String productId);
    void updateProduct(ProductPrimaryPo product);
    ProductPrimaryPo getProductById(String productId);


}
