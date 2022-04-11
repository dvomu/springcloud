package com.dvomu.springcloud.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value=ExcudeRibbonConfig.class)
})
public @interface ExcudeRibbonConfig {
}
