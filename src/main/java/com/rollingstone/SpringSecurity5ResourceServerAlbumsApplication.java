package com.rollingstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class SpringSecurity5ResourceServerAlbumsApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringSecurity5ResourceServerAlbumsApplication.class, args);
    }

}
