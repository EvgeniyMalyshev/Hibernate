package ru.malyshev.embedded.service;
import org.springframework.stereotype.Component;
import ru.malyshev.embedded.dto.ModuleDTO;
import java.util.Set;


@Component
public interface ModuleService {


    Set<ModuleDTO> getByName(String name);

    Set<ModuleDTO> getByModuleId(String moduleId);
}
