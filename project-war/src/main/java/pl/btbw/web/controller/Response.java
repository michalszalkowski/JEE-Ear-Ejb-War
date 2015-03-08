package pl.btbw.web.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {

    @XmlElement
    private String message;

    public Response() {
    }

    public Response(String message) {
        this.message = message;
    }
}
