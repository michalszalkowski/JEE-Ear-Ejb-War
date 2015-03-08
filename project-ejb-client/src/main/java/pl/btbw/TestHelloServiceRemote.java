package pl.btbw;

import javax.ejb.Remote;

@Remote
public interface TestHelloServiceRemote {
	String getSomeText();
}
