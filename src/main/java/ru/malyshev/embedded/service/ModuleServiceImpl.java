package ru.malyshev.embedded.service;


import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class ModuleServiceImpl implements ModuleService {

    /*private ModuleRepository moduleRepository;

    @Autowired
    public ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }*/


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
            module dbModule =moduleRepository.findByNameAndModuleVersion(module.getName(), module.getModuleVersion());
            if (dbModule != null){
                module.setId(dbModule.getId());
            }
            return  module;
        }
        return  null;
    }*/
}
