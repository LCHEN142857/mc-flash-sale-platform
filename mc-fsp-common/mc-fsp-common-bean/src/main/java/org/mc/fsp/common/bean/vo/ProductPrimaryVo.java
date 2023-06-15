/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.common.bean.vo;

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
 * @date 2023-06-13
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductPrimaryVo {
    private String productId;
    private String productName;
    private String status;
}
