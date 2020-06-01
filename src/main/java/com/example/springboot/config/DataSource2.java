package com.example.springboot.config;//package com.example.springboot.config;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(value = "com.example.springboot.da1o",sqlSessionFactoryRef = "ssf2",sqlSessionTemplateRef = "sst2")
//public class DataSource2 {
//
//    @Bean
//    public DataSource ds2() {
//        HikariDataSource ds = new HikariDataSource();
//        ds.setUsername("root");
//        ds.setPassword("shengzhi!@#");
//        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        ds.setJdbcUrl("jdbc:mysql://localhost:3306/springboot?serverTimezone=UTC");
//        return ds;
//    }
//
//    @Bean
//    public SqlSessionFactory ssf2(@Qualifier("ds2") DataSource dataSource) throws Exception {
//
//        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
//        factory.setDataSource(dataSource);
//        return factory.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sst2(@Qualifier("ssf2") SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
