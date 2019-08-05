package ru.malyshev.embedded.module;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import ru.malyshev.embedded.metric.Metric;
import ru.malyshev.embedded.production.line.ProductionLine;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@DynamicInsert
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "module")
@Entity
public class Module extends MasterModule {


    @Column
    private String moduleVersion;

    @Column
    private String versionState;

    @OneToOne
    private Metric metric;

    @OneToMany(mappedBy = "productionName")
    private List<ProductionLine> productionLine = new ArrayList<>();

    @Builder
    public Module(Long id, Long moduleId, String name, String moduleVersion, String versionState){
        super(id,moduleId,name);
        this.moduleVersion = moduleVersion;
        this.versionState = versionState;
    }

}
