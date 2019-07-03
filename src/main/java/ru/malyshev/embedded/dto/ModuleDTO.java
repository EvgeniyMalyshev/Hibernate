package ru.malyshev.embedded.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ModuleDTO extends MasterModuleDTO {

    private static final long serialVersionUID = 4295015534610889273L;

    private String moduleVersion;
    private String versionState;

    public ModuleDTO(MasterModuleDTO master){
        ModuleDTO dto = new ModuleDTO();
        dto.setId(master.getId());
        dto.setModuleId(master.getModuleId());
        dto.setName(master.getName());
    }
}
