package ru.malyshev.embedded.module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "module")
@Entity

public class Module extends MasterModule {

    @Column
    private String moduleVersion;

    @Column
    private String versionState;

    @Builder
    public Module(Long id, String moduleId, String name, String moduleVersion, String versionState, Map <String, String> params){
        super(id,moduleId,name,params);
        this.moduleVersion = moduleVersion;
        this.versionState = versionState;
    }

}
