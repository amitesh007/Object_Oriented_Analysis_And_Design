
package com.mobile.data.usage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mobile.data.usage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMobileDataResponse_QNAME = new QName("http://usage.data.mobile.com/", "getMobileDataResponse");
    private final static QName _GetMobileData_QNAME = new QName("http://usage.data.mobile.com/", "getMobileData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mobile.data.usage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMobileDataResponse }
     * 
     */
    public GetMobileDataResponse createGetMobileDataResponse() {
        return new GetMobileDataResponse();
    }

    /**
     * Create an instance of {@link GetMobileData }
     * 
     */
    public GetMobileData createGetMobileData() {
        return new GetMobileData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usage.data.mobile.com/", name = "getMobileDataResponse")
    public JAXBElement<GetMobileDataResponse> createGetMobileDataResponse(GetMobileDataResponse value) {
        return new JAXBElement<GetMobileDataResponse>(_GetMobileDataResponse_QNAME, GetMobileDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://usage.data.mobile.com/", name = "getMobileData")
    public JAXBElement<GetMobileData> createGetMobileData(GetMobileData value) {
        return new JAXBElement<GetMobileData>(_GetMobileData_QNAME, GetMobileData.class, null, value);
    }

}
