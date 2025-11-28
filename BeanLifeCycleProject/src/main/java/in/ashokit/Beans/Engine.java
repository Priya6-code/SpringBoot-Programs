package in.ashokit.Beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {
    public Engine() {
    	System.out.println("Engine Constructor...");
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("Engine started...");
    }
    @PreDestroy
    public void destroy() {
    	System.out.println("Stop Engine...");
    }
}
