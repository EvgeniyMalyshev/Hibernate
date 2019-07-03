package ru.malyshev.embedded.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.malyshev.embedded.Module.ModuleRepository;


@Configuration
@Import(DbConfig.class)
@ComponentScan(basePackages = {"ru.malyshev.embedded"})
public class ModuleCommonConfig {
    @Autowired
    private ModuleRepository moduleRepository;

}
