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

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "params", joinColumns = @JoinColumn(name = "MODULE_ID", referencedColumnName = "id"))
    @MapKeyColumn(name = "PARAM_KEY")
    @Column(name = "PARAM_VALUE")
    private Map<String,String> params;

    @Builder
    public Module(Long id, Long moduleId, String name, String moduleVersion, String versionState, Map <String, String> params){
        super(id,moduleId,name);
        this.moduleVersion = moduleVersion;
        this.versionState = versionState;
        this.params = params;
    }

}
