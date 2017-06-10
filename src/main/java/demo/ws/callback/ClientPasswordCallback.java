package demo.ws.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.stereotype.Component;

@Component
public class ClientPasswordCallback implements CallbackHandler{

	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback callback = (WSPasswordCallback)callbacks[0];
		//客户端密码（-keypass属性后的密码）
		callback.setPassword("clientpass");
	}
}
