package pl.btbw.web.service;

import javax.ejb.Stateless;

@Stateless
public class HelperSmallService {

    public String getSomeText() {
        return "Hi From Helper Service";
    }

}
