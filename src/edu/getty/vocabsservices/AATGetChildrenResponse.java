/**
 * AATGetChildrenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetChildrenResponse  implements java.io.Serializable {
    private edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult AATGetChildrenResult;

    public AATGetChildrenResponse() {
    }

    public AATGetChildrenResponse(
           edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult AATGetChildrenResult) {
           this.AATGetChildrenResult = AATGetChildrenResult;
    }


    /**
     * Gets the AATGetChildrenResult value for this AATGetChildrenResponse.
     * 
     * @return AATGetChildrenResult
     */
    public edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult getAATGetChildrenResult() {
        return AATGetChildrenResult;
    }


    /**
     * Sets the AATGetChildrenResult value for this AATGetChildrenResponse.
     * 
     * @param AATGetChildrenResult
     */
    public void setAATGetChildrenResult(edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult AATGetChildrenResult) {
        this.AATGetChildrenResult = AATGetChildrenResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetChildrenResponse)) return false;
        AATGetChildrenResponse other = (AATGetChildrenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetChildrenResult==null && other.getAATGetChildrenResult()==null) || 
             (this.AATGetChildrenResult!=null &&
              this.AATGetChildrenResult.equals(other.getAATGetChildrenResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAATGetChildrenResult() != null) {
            _hashCode += getAATGetChildrenResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetChildrenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetChildrenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetChildrenResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetChildrenResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetChildrenResponse>AATGetChildrenResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
