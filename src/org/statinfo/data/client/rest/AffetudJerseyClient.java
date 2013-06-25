/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.statinfo.data.client.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import org.infostat.data.dto.AffectationEtudiantDTO;

/**
 * Jersey REST client generated for REST resource:AffectationEtudiantResource
 * [affetud]<br>
 * USAGE:
 * <pre>
 *        AffetudJerseyClient client = new AffetudJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author boubad
 */
public class AffetudJerseyClient {

    private WebResource webResource;
    private Client client;
    private static final String BASE_URI = "http://localhost:8888/InfoStat-war/webresources";

    public AffetudJerseyClient() {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        config.getClasses().add(AffectationEtudiantDTO.class);
        config.getClasses().add(AffectationEtudiantDTO[].class);
        client = Client.create(config);
        webResource = client.resource(BASE_URI).path("affetud");
    }

    public AffetudJerseyClient(String baseURI) {
        com.sun.jersey.api.client.config.ClientConfig config = new com.sun.jersey.api.client.config.DefaultClientConfig();
        config.getClasses().add(AffectationEtudiantDTO.class);
        config.getClasses().add(AffectationEtudiantDTO[].class);
        client = Client.create(config);
        webResource = client.resource(baseURI).path("affetud");
    }

    public String count_XML() throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path("count");
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public String count_JSON() throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path("count");
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
    }

    public String count_TEXT() throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path("count");
        return resource.accept(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public void remove(String id) throws UniformInterfaceException {
        webResource.path(java.text.MessageFormat.format("{0}", new Object[]{id})).delete();
    }

    public <T> T findAll_XML(Class<T> responseType) throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findAll_JSON(Class<T> responseType) throws UniformInterfaceException {
        WebResource resource = webResource;
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T findData_XML(Class<T> responseType, String groupeid, String etudiantid, String semestreid) throws UniformInterfaceException {
        WebResource resource = webResource;
        if (groupeid != null) {
            resource = resource.queryParam("groupeid", groupeid);
        }
        if (etudiantid != null) {
            resource = resource.queryParam("etudiantid", etudiantid);
        }
        if (semestreid != null) {
            resource = resource.queryParam("semestreid", semestreid);
        }
        resource = resource.path("user");
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findData_JSON(Class<T> responseType, String groupeid, String etudiantid, String semestreid) throws UniformInterfaceException {
        WebResource resource = webResource;
        if (groupeid != null) {
            resource = resource.queryParam("groupeid", groupeid);
        }
        if (etudiantid != null) {
            resource = resource.queryParam("etudiantid", etudiantid);
        }
        if (semestreid != null) {
            resource = resource.queryParam("semestreid", semestreid);
        }
        resource = resource.path("user");
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void create_XML(Object requestEntity) throws UniformInterfaceException {
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_XML).post(requestEntity);
    }

    public void create_JSON(Object requestEntity) throws UniformInterfaceException {
        webResource.type(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(requestEntity);
    }

    public <T> T findRange_XML(Class<T> responseType, String from, String to) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T findRange_JSON(Class<T> responseType, String from, String to) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}/{1}", new Object[]{from, to}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T find_XML(Class<T> responseType, String id) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T find_JSON(Class<T> responseType, String id) throws UniformInterfaceException {
        WebResource resource = webResource;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.destroy();
    }
}
