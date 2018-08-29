package org.hwj.servera.feign;

import org.springframework.stereotype.Component;

/**
 * @Author: huangwenjun
 * @Description:
 * @Date: Created in 16:34  2018/8/28
 **/
@Component
public class ServerBApiHystric implements ServerBApi {
	@Override
	public String hi() {
		return "server-b 服务不可用, 触发熔断";
	}
}
