
package TKAamisha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCustomer {

	@Autowired
	Customer c;
	
	@Value("${custoerid}")
	
	int id;
	
	@RequestMapping("IOCtest")
	public String name() {
		System.out.println(id);
		System.out.println(c.customerid);
		
		return c.name();
	}
	
	
	
	
	
}
