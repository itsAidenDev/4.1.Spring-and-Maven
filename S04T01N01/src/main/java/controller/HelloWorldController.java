package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloWorldController {
	@GetMapping("/HelloWorld")
	public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
		return "Hello, " + name + ". You are running a Maven project.";
	}

	@GetMapping("/HelloWorld2", "/HelloWorld2/{name}")
	public String greet2(@PathVariable(required = false) String name) {
		if (name == null) {
			name = "UNKNOWN";
		}
		return "Hello, " + name + ". You are running a Maven project.";
	}
}
