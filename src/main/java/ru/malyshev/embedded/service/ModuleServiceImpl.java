package ru.malyshev.embedded.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.malyshev.embedded.converter.ModuleConverter;
import ru.malyshev.embedded.dto.ModuleDTO;
import ru.malyshev.embedded.module.Module;
import ru.malyshev.embedded.module.ModuleRepository;
import java.util.Set;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;
    @Autowired
    private ModuleConverter converter;

    @Autowired
    public ModuleServiceImpl(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    public Set<ModuleDTO> getByName(String name) {
        return converter.convertToModuleDtoList(moduleRepository.findByName(name));
    }

    public Set<ModuleDTO> getByModuleId(String moduleId) {
        return converter.convertToModuleDtoList(moduleRepository.findByModuleId(moduleId));
    }

    public ModuleDTO getByNameAndVersion(String name, String version){
        Module module = moduleRepository.findByNameAndModuleVersion(name,version);
        if (module!=null){
            return converter.convertToModuleDto(module);
        }return null;
    }




}
