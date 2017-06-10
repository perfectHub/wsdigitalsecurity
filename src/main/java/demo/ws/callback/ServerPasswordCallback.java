package demo.ws.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.stereotype.Component;

@Component
public class ServerPasswordCallback	implements CallbackHandler{

	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback callback = (WSPasswordCallback)callbacks[0];
		//服务端的别名和密码（alias和keypass）
		if(callback.getIdentifier().equals("server")){
			//设置密码
            //这个密码和客户端发送的密码进行比较
            //如果和客户端不同将抛出org.apache.ws.security.WSSecurityException
			callback.setPassword("serverpass");
		}
	}
}
