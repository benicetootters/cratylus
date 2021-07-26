/**
 * AATGetTermMatchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetTermMatchResponse  implements java.io.Serializable {
    private edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult AATGetTermMatchResult;

    public AATGetTermMatchResponse() {
    }

    public AATGetTermMatchResponse(
           edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult AATGetTermMatchResult) {
           this.AATGetTermMatchResult = AATGetTermMatchResult;
    }


    /**
     * Gets the AATGetTermMatchResult value for this AATGetTermMatchResponse.
     * 
     * @return AATGetTermMatchResult
     */
    public edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult getAATGetTermMatchResult() {
        return AATGetTermMatchResult;
    }


    /**
     * Sets the AATGetTermMatchResult value for this AATGetTermMatchResponse.
     * 
     * @param AATGetTermMatchResult
     */
    public void setAATGetTermMatchResult(edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult AATGetTermMatchResult) {
        this.AATGetTermMatchResult = AATGetTermMatchResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetTermMatchResponse)) return false;
        AATGetTermMatchResponse other = (AATGetTermMatchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetTermMatchResult==null && other.getAATGetTermMatchResult()==null) || 
             (this.AATGetTermMatchResult!=null &&
              this.AATGetTermMatchResult.equals(other.getAATGetTermMatchResult())));
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
        if (getAATGetTermMatchResult() != null) {
            _hashCode += getAATGetTermMatchResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetTermMatchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermMatchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetTermMatchResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetTermMatchResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetTermMatchResponse>AATGetTermMatchResult"));
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
