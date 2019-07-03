package ru.malyshev.embedded.Module;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import ru.malyshev.embedded.Module.Module;

import java.util.List;
@Component

public interface ModuleRepository extends JpaRepository<Module,Long>, JpaSpecificationExecutor<Module> {

    /*@Query("select m from Module m where m.name = :name")
    List<Module> findByName (@Param("name") String name);

    @Query("select m from Module m where m.moduleId = :moduleId")
    List<Module> findByModuleId (@Param("moduleId") String moduleId);

    @Query("select m from Module m where m.name = :name and m.moduleVersion = :mVersion")
    Module findByNameAndModuleVersion (@Param("name") String name, @Param("mVersion") String moduleVersion);*/
}
