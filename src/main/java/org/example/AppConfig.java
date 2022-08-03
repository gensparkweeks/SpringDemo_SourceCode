package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Phone> phone() {
        List<Phone> ph = new ArrayList<>();
        ph.add(new Phone("501-101-0001"));
        ph.add(new Phone("501-101-0002"));
        return ph;
    }
    @Bean
    public Address address(){

        return  new Address("MIA", "FL", "USA", "788149");
    }
    @Bean
    public Student student(){

        return new Student(10001, "Code Source", phone(), address());
    }
}
