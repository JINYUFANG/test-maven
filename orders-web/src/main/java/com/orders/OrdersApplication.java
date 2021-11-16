package com.orders;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.orders"})
public class OrdersApplication {
    public static void main(String[] args){
        SpringApplication.run(OrdersApplication.class,args);
    }
}