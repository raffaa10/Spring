package dev.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	
	// Définition de la source de données
    // => Bean de type java.sql.DataSource
    @Bean
    public DataSource dataSource(
    		  @Value("${bdd.driver}") String driver,
    		  @Value("${bdd.user}") String utilisateur,
    		  @Value("${bdd.pass}") String motDePasse,
    		  @Value("${bdd.url}") String url
    		  ) {
    	 DriverManagerDataSource ds = new DriverManagerDataSource();
    	 
         ds.setDriverClassName("org.mariadb.jdbc.Driver");
         ds.setUrl("jdbc:mariadb://localhost:3306/restaurant-bdd");
         ds.setUsername("root");
         ds.setPassword("");
         
         return ds;
    }

}
