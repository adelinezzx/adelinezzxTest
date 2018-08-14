package com.yc.dto;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = "com.yc.dao.mapper", sqlSessionTemplateRef  = "sqlSessionTemplate")
public class DataSource1Config {
	
	
	@Bean(name = "datasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }
	
	@Bean(name = "sqlSessionFactory")
    @Primary
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("datasource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com.yc.dao.mapper.*.xml"));
        return bean.getObject();
    }
	
	 @Bean(name = "transactionManager")
	    @Primary
	    public DataSourceTransactionManager testTransactionManager(@Qualifier("datasource") DataSource dataSource) {
	        return new DataSourceTransactionManager(dataSource);
	    }
	 
	 @Bean(name = "sqlSessionTemplate")
	    @Primary
	    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
	        return new SqlSessionTemplate(sqlSessionFactory);
	    }

}
