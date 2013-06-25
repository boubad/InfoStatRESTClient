/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.statinfo.data.client;

/**
 *
 * @author boubad
 */
public class ClientUtils {
     public  static final String DEFAULT_BASE_URI = "http://localhost:8888/InfoStat-war/webresources";
     private  String baseURI;

    public ClientUtils() {
    }

    public ClientUtils(String baseURI) {
        this.baseURI = baseURI;
    }

    public String getBaseURI() {
        return (this.baseURI == null) ? DEFAULT_BASE_URI : this.baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }
     
}
