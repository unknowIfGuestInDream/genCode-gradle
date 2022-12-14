package com.tlcsdm.gen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GenGradleApplication {

	private static final String TIPS = "\n\n" + "******************** 代码生成系统启动成功 ********************\n";

	public static void main(String[] args) {
		SpringApplication.run(GenGradleApplication.class, args);
		log.info(TIPS);
	}

}
