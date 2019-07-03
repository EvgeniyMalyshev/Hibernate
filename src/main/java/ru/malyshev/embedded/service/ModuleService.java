package ru.malyshev.embedded.service;



import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Set;
@Component
public interface ModuleService {
    Set<ModuleService> saveAllModules(Collection<ModuleService> moduleDTOS);

    /*void deleteModule (Long id);
    ModuleService getById(Long id);
    ModuleDTO addModule(ModuleDTO moduleDTO);
    ModuleDTO editModule(ModuleDTO moduleDTO);
*/
}
