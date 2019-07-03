package ru.malyshev.embedded.module;


import org.springframework.data.repository.CrudRepository;

public interface ModuleRepository extends CrudRepository<Module, Long> /*JpaRepository<module,Long>, JpaSpecificationExecutor<module>*/ {

    /*@Query("select m from module m where m.name = :name")
    List<module> findByName (@Param("name") String name);

    @Query("select m from module m where m.moduleId = :moduleId")
    List<module> findByModuleId (@Param("moduleId") String moduleId);

    @Query("select m from module m where m.name = :name and m.moduleVersion = :mVersion")
    module findByNameAndModuleVersion (@Param("name") String name, @Param("mVersion") String moduleVersion);*/
}
