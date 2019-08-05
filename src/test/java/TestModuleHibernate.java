

import ru.malyshev.embedded.config.ModuleCommonConfig;
import ru.malyshev.embedded.metric.Metric;
import ru.malyshev.embedded.metric.MetricRepository;
import ru.malyshev.embedded.module.Module;
import ru.malyshev.embedded.module.ModuleRepository;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.malyshev.embedded.service.ModuleService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ModuleCommonConfig.class})
public class TestModuleHibernate {
    @Autowired
    private ModuleRepository moduleRepository;
    @Autowired
    ModuleService moduleService;
    @Autowired
    MetricRepository metricRepository;



    @Test
    public void test(){
       Module moduleInsideCode = new Module(1L, 123L, "moduleInsideCode", "1.0", "1.0.0");
        moduleInsideCode.setModuleVersion("0.0.1");
        moduleRepository.saveAndFlush(moduleInsideCode);

        Metric metricInsideCode = new Metric(3L,"metricFromHibernate");
        metricRepository.saveAndFlush(metricInsideCode);
    }

}

