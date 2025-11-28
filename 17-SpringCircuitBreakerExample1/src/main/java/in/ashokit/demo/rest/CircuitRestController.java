package in.ashokit.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitRestController {
	
    @GetMapping("/")
    public String m1() {
        System.out.println("m1() method got executed");
        String msg = "This is m1() method";
        
        try {
           
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            
            msg = m2();
        }
        return msg;
    }
	
    public String m2() {
        System.out.println("m2() method got executed (Fallback)");
        return "This is fallback response from m2() ";
    }
}
