package ru.malyshev.embedded.Service;


import ru.malyshev.embedded.DTO.ModuleDTO;
import ru.malyshev.embedded.Module.Module;
import ru.malyshev.embedded.Module.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;


    public Set<ModuleService> saveAllModules(Collection<ModuleService> moduleDTOS) {
        return null;
    }

    public void deleteModule(Long id) {

    }

    public ModuleService getById(Long id) {
        return null;
    }

    /*public ModuleDTO addModule(ModuleDTO moduleDTO) {
        return editModule(moduleDTO);
    }*/

   /* public ModuleDTO editModule(ModuleDTO module) {
        if(module != null) {
            Module dbModule =moduleRepository.findByNameAndModuleVersion(module.getName(), module.getModuleVersion());
            if (dbModule != null){
                module.setId(dbModule.getId());
            }
            return  module;
        }
        return  null;
    }*/
}
