package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(sample.class, args);
	}
	
	@RequestMapping(value="/rocky")
	public String run() {
		
		return "hello ravindra welcome to team rc creation";
	}
	
	@RequestMapping(value="/")
	public String defaultmessage()
	{
		return "welcome to spring boot page";
	}
	

}
