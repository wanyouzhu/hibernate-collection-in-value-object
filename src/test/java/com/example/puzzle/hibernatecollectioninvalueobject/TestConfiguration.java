package com.example.puzzle.hibernatecollectioninvalueobject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@ComponentScan(basePackages = {"com.example.puzzle.hibernatecollectioninvalueobject"})
public class TestConfiguration {
    @Bean(name = "entityManagerFactory")
    public LocalSessionFactoryBean sessionFactory(ResourceLoader resourceLoader, DataSource dataSource) throws IOException {
        LocalSessionFactoryBean result = new LocalSessionFactoryBean();
        result.setDataSource(dataSource);
        result.setMappingLocations(resolveMappingLocations(resourceLoader));
        result.setPackagesToScan("com.example.puzzle.hibernatecollectioninvalueobject");
        result.afterPropertiesSet();
        return result;
    }

    private Resource[] resolveMappingLocations(ResourceLoader resourceLoader) throws IOException {
        return ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources("classpath*:/**/*.hbm.xml");
    }
}
