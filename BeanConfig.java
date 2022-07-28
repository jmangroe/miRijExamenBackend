package com.example.demo.config;

import com.example.demo.entity.Borden;
import com.example.demo.repos.*;
import com.example.demo.service.*;
import com.example.demo.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class BeanConfig {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private UserServiceInt userService;

    @Autowired
    private TheorieRepository theorieRepository;

    @Autowired
    private TheorieServiceInt theorieServiceInt;

    @Autowired
    private TheorieAntwoordenRepository theorieAntwoordenRepository;

    @Autowired
    private TheorieAntwoordenServiceInt theorieAntwoordenServiceInt;

    @Autowired
    private MaquettenRepository maquettenRepository;

    @Autowired
    private MaquettenServiceInt maquettenServiceInt;

    @Autowired
    private MaquettenAntwoordenRepository maquettenAntwoordenRepository;

    @Autowired
    private MaquettenAntwoordenServiceInt maquettenAntwoordenServiceInt;

    @Autowired
    private BordenRepository bordenRepository;

    @Autowired
    private BordenServiceInt bordenServiceInt;

    @Autowired
    private BordenAntwoordenRepository bordenAntwoordenRepository;

    @Autowired
    private BordenAntwoordenServiceInt bordenAntwoordenServiceInt;

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);// setting it to root route of the application
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

    @Bean
    public UserServiceInt userService() {
        return new UsersService(userRepository);
    }

    @Bean
    public TheorieServiceInt theorieService() {
        return new TheorieService(theorieRepository);
    }

    @Bean
    public TheorieAntwoordenServiceInt theorieAntwoordenService() {
        return new TheorieAntwoordenService(theorieAntwoordenRepository);
    }

    @Bean
    public MaquettenServiceInt maquettenService() {
        return new MaquettenService(maquettenRepository);
    }

    @Bean
    public MaquettenAntwoordenServiceInt maquettenAntwoordenService() {
        return new MaquettenAntwoordenService(maquettenAntwoordenRepository);
    }

    @Bean
    public BordenServiceInt bordenService() {
        return new BordenService(bordenRepository);
    }

    @Bean
    public BordenAntwoordenServiceInt bordenAntwoordenService() {
        return new BordenAntwoordenService(bordenAntwoordenRepository);
    }


}
