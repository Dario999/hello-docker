package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.hazelcast.memory.MemoryStats;

@RestController
@RequestMapping("main")
public class MainController{

	@GetMapping
	public String helloWorld(){
		System.out.println("Hello World Endpoint");
		return "Hello World";
	}
	
	@GetMapping("/stats")
	public String newHelloWorld(){
		//MemoryStats stats = new MemoryStats();
		//stats.setHeapSize(Runtime.getRuntime().totalMemory());
		//stats.setHeapMaxSize(Runtime.getRuntime().maxMemory());
		//stats.setHeapFreeSize(Runtime.getRuntime().freeMemory());
		//return stats;
		return "trebalo e";
	}

}
