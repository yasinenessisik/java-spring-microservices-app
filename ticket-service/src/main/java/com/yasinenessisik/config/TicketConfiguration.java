package com.yasinenessisik.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.yasinenessisik")
@EnableElasticsearchRepositories
@ComponentScan("com.yasinenessisik")
public class TicketConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}