package mxk.com.config;

import mxk.com.easy.BraveKnight;
import mxk.com.easy.Knight;

import javax.management.MXBean;

/**
 * Created by mengxk on 2017/6/23.
 */
@Configuration
class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
}
