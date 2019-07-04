package ru.malyshev.embedded.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.malyshev.embedded.enums.VersionState;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ModuleDTO extends MasterModuleDTO {
    private VersionState versionState;

    private static final long serialVersionUID = 4295015534610889273L;

    private String moduleVersion;

    public ModuleDTO(MasterModuleDTO master){
        ModuleDTO dto = new ModuleDTO();
        dto.setId(master.getId());
        dto.setName(master.getName());
        dto.setModuleId(master.getModuleId());
        dto.setName(master.getName());
    }
}
