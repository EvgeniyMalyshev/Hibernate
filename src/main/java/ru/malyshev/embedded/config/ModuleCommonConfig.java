package ru.malyshev.embedded.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(DbConfig.class)
@ComponentScan(basePackages = {"ru.malyshev.embedded"})
public class ModuleCommonConfig {

}


