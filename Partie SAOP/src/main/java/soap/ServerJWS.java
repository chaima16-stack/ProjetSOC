package soap;

import entities.IncidentWebService;

import jakarta.xml.ws.Endpoint;
public class ServerJWS {
    public static void main(String[] args) {
        String url= "http://0.0.0.0:8087/";
        Endpoint.publish(url, new IncidentWebService());
        System.out.println("Web Service déployé sur l''adresse") ;
    }
}
