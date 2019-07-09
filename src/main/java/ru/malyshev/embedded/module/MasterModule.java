package ru.malyshev.embedded.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor


@MappedSuperclass
public class MasterModule {

    @Id
    //@SequenceGenerator(name = "generator_module", sequenceName = "Module_$S", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*, generator = "generator_module")
    @Column(name = "id", length = 6, nullable = false)*/
    private Long id;

    @Column
    private String moduleId;

    @Column
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "NEXUS_Params", joinColumns = @JoinColumn(name = "MODULE_ID", referencedColumnName = "id"))
    @MapKeyColumn(name = "PARAM_KEY")
    @Column(name = "PARAM_VALUE")
    private Map<String,String> params;

}
