package com.example.execute.api.config;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {
	
	@Bean(name="taskExecutor")
	public Executor taskExecutor() {
		
		ThreadPoolTaskExecutor executor =new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2); //Thread Capacity
		executor.setMaxPoolSize(2); //max thread count
		executor.setQueueCapacity(100);//Queue capacity these many task can be waiting in blocking queue
		executor.setThreadNamePrefix("userThread=");// prefix
		executor.initialize();
		return executor;
	}

}
