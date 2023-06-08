///**
// * Copyright (c) 2023 LCHEN
// * All rights reserved
// * Created on 2023-05-08
// */
//package org.mc.fsp.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.mc.fsp.util.CrypticUtils;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//
///**
// * description
// *
// * @author LCHEN
// * @date 2023-05-08
// */
//@Configuration
//public class DataSourceConfig {
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String encryptedUsername;
//
//    @Value("${spring.datasource.password}")
//    private String encryptedPassword;
//
//    @Value("${cryptic.mysql.private-key-location}")
//    public String mysqlPrivateKey;
//
//    @Bean
//    public DataSource getDataSource() throws Exception {
//        HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setJdbcUrl(url);
//        dataSource.setUsername(CrypticUtils.decryptDatasourceSensitiveInfo(encryptedUsername, mysqlPrivateKey));
//        dataSource.setPassword(CrypticUtils.decryptDatasourceSensitiveInfo(encryptedPassword, mysqlPrivateKey));
//        return dataSource;
//    }
//}
