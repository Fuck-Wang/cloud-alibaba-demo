package com.kuan.gateway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    /**
     * boot版本会造成RouteLocatorBuilder的bean自动配置失败，导致gateway无法转发
     * @param builder
     * @return
     */
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("baidu", r ->
//                        r.path("/demo/hello")
//                                .uri("http://www.baidu.com"))
////                                .uri("lb://sentinel"))
//                .build();
//    }


}
