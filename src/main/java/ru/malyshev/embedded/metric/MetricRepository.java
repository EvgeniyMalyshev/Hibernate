package ru.malyshev.embedded.metric;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MetricRepository  extends JpaRepository<Metric,Long>, JpaSpecificationExecutor<Metric> {

}
