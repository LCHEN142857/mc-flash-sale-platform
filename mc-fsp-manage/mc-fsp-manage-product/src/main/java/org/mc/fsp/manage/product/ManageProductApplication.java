/**
 * Copyright (c) 2023 LCHEN
 * All rights reserved
 * Created on 2023-06-13
 */
package org.mc.fsp.manage.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * description
 *
 * @author LCHEN
 * @date 2023-06-13
 */
@ComponentScan(value = "org.mc.fsp")
@SpringBootApplication
//@MapperScan("org.mc.fsp.common.db")
// load the 'common-db' module properties file
@PropertySource("classpath:application-database-${spring.profiles.active}.properties")
public class ManageProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageProductApplication.class, args);
    }
}
