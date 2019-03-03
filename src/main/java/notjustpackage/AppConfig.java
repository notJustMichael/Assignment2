package notjustpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean(name="hooman")

    public Mammal getService(){
        return new Mammal() {
            @Override
            public int Breathe() {

            }
        };
    }

    @Bean(name="Human")

    public Mammal getNewService(){
        return new Human(0);
    }
}

