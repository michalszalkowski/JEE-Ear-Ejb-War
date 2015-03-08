package pl.btbw;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class TestHelloService implements TestHelloServiceRemote {
	@Override
	public String getSomeText() {
		return "Hi from Ejb!";
	}
}
