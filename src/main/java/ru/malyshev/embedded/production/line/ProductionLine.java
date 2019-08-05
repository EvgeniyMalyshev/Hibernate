package ru.malyshev.embedded.production.line;

import javax.persistence.*;
@Entity
@Table(name = "production_line")
public class ProductionLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "production_line")
    private ProductionLine productionLine;

    @Column
    private String productionName;

}
