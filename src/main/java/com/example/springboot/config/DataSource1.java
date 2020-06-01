package com.example.springboot.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.example.springboot.dao",sqlSessionFactoryRef = "ssf1",sqlSessionTemplateRef = "sst1")
public class DataSource1 {

    @Bean
    public DataSource ds1(){
        HikariDataSource ds = new HikariDataSource();
        ds.setUsername("root");
        ds.setPassword("shengzhi!@#");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/springboot?serverTimezone=UTC");
        return ds;
    }

    @Bean
    public SqlSessionFactory ssf1( @Qualifier("ds1") DataSource dataSource) throws Exception {

        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/**/*.xml");
        factory.setMapperLocations(resources);
        return factory.getObject();
    }

    @Bean
    public SqlSessionTemplate sst1(@Qualifier("ssf1") SqlSessionFactory sqlSessionFactory) {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);

        return sqlSessionTemplate;
    }

}
