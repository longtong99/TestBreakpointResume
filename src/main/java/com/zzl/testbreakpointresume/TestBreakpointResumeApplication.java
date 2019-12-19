package com.zzl.testbreakpointresume;

import com.zzl.testbreakpointresume.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestBreakpointResumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestBreakpointResumeApplication.class, args);
	}


	/**
	 * 删除旧的数据已经旧的文件
	 * @param storageService
	 * @return
	 */
	@Bean
	CommandLineRunner init(final StorageService storageService) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				storageService.deleteAll();
				storageService.init();
			}
		};
	}

}
