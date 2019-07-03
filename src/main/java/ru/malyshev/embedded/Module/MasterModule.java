package ru.malyshev.embedded.Module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@MappedSuperclass
public class MasterModule {

    @Id
    @SequenceGenerator(name = "generator_module", sequenceName = "Module_$S", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_module")
    @Column(name = "id", length = 6, nullable = false)
    private Long id;

    @Column
    private String moduleId;

    @Column
    private String name;

}
