package org.liuyuqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LiuApplication extends SpringBootServletInitializer  {
    public static void main(String[] args) {
        SpringApplication.run(LiuApplication.class);
		//11111111111111111111111111111111111111111111111111111111
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		//2222222222222222222222222222222222
        return super.configure(builder).sources(LiuApplication.class);
    }
}
