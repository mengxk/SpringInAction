package mxk.com.config;

import mxk.com.easy.BraveKnight;
import mxk.com.easy.Knight;
import mxk.com.easy.Quest;
import mxk.com.easy.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

/**
 * Created by mengxk on 2017/6/23.
 */
@Configuration
class KnightConfig {

    /*@Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }*/

    @Bean
    public Quest quest (){
        return new SlayDragonQuest(System.out);
    }
}
