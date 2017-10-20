package com.xinaml.cloud.common.jpa.boot;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


public class JpaComponents {

    @Autowired
    private EntityToScan packagesToScan;

    @Bean
    public DataSource getDataSource(Environment env) {
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName(env.getProperty("db.driver"));
        dds.setUrl(env.getProperty("db.url"));
        dds.setUsername(env.getProperty("db.username"));
        dds.setPassword(env.getProperty("db.password"));
        String minIdle = env.getProperty("db.minIdle");
        String maxActive = env.getProperty("db.maxActive");
        String maxWait = env.getProperty("db.maxWait");
        dds.setMinIdle(StringUtils.isNotBlank(minIdle) ? Integer.parseInt(minIdle) : DruidDataSource.DEFAULT_MIN_IDLE);
        dds.setMaxActive(StringUtils.isNotBlank(maxActive) ? Integer.parseInt(maxActive) : DruidDataSource.DEFAULT_MAX_ACTIVE_SIZE);
        dds.setMaxWait(StringUtils.isNotBlank(maxWait) ? Integer.parseInt(maxWait) : DruidDataSource.DEFAULT_MAX_WAIT);
        return dds;
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }


    @Bean("jpaVendorAdapter")
    public JpaVendorAdapter hibernateJpaVendorAdapter() {
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setShowSql(false);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        return hibernateJpaVendorAdapter;
    }


}
