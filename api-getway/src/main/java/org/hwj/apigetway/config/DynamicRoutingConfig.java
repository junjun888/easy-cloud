package org.hwj.apigetway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.stereotype.Component;

/**
 * 动态路由配置
 *
 * @Author: huangwenjun
 * @Description:
 * @Date: Created in 17:42  2018/8/24
 **/
@Component
public class DynamicRoutingConfig {

	@ConfigurationProperties("zuul")
    @RefreshScope
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }
}
