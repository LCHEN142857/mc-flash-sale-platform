/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-09-13
 */
package org.mc.fsp.common.bean.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-09-13
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
//@Schema(value = "ProductQueryRequest", description = "查询请求体")
public class ProductQueryRequest {

//    @ApiModelProperty(value = "产品ID", required = false)
    private String productId;
}
