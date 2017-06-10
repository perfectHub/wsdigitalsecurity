package demo.ws.soap;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

@WebService
@Component
public class HelloServiceImpl implements HelloService{

	public String say(String name){
		return "hello "+name;
	}
}
