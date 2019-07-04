package ru.malyshev.embedded.converter;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.malyshev.embedded.dto.ModuleDTO;
import ru.malyshev.embedded.enums.VersionState;
import ru.malyshev.embedded.module.Module;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import static org.apache.commons.collections.CollectionUtils.isNotEmpty;

@Service
public class ModuleConverter {
    @Autowired
    AbstractConverter abstractConverter;

    public Module convertToModule(ModuleDTO dto){
        Module entity = abstractConverter.convertToEntity(dto, Module.class);
        entity.setVersionState(dto.getVersionState() == null ? null:dto.getVersionState().name());
        return entity;
    }

    public ModuleDTO convertToModuleDto (Module entity){
        ModuleDTO dto = abstractConverter.convertToDTO(entity,ModuleDTO.class);
        dto.setVersionState(VersionState.getByName(entity.getVersionState()));
        return dto;
    }

    public Set<ModuleDTO> convertToModuleDtoList(Collection<Module> enteties){
        if(CollectionUtils.isNotEmpty(enteties)){
            return enteties.stream().map(this::convertToModuleDto).collect(Collectors.toSet());
        }
        return Collections.emptySet();
    }
}
