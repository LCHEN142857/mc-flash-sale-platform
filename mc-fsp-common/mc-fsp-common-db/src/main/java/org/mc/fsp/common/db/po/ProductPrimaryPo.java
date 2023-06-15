/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.common.db.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("product_primary")
public class ProductPrimaryPo {
    @TableId
    private String productId;
    private String productName;
    private String status;
    private String createTime;
    private String updateTime;
    private String updateManager;
}
