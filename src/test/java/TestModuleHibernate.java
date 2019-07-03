

import ru.malyshev.embedded.Config.ModuleCommonConfig;
import ru.malyshev.embedded.Module.Module;
import ru.malyshev.embedded.Module.ModuleRepository;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ModuleCommonConfig.class)

public class TestModuleHibernate {
    @Autowired
    private ModuleRepository moduleRepository;

    @Test
    public void test(){
        Module module = new Module();
        Map<String,String> map = new HashMap<>();
        map.put("key","value");
        module.setModuleVersion("0.0.1");
        module.setParams(map);
        moduleRepository.saveAndFlush(module);

    }

}
