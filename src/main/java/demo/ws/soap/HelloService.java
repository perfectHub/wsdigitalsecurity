package demo.ws.soap;

import javax.jws.WebService;

@WebService
public interface HelloService {

	String say(String name);
}
