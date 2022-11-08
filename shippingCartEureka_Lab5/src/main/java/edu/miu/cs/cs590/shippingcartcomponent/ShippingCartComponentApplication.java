package edu.miu.cs.cs590.shippingcartcomponent;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class ShippingCartComponentApplication {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }


    public static void main(String[] args) {
        SpringApplication.run(ShippingCartComponentApplication.class, args);
    }

}
