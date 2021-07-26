/**
 * AATGetParentsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetParentsResponse  implements java.io.Serializable {
    private edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult AATGetParentsResult;

    public AATGetParentsResponse() {
    }

    public AATGetParentsResponse(
           edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult AATGetParentsResult) {
           this.AATGetParentsResult = AATGetParentsResult;
    }


    /**
     * Gets the AATGetParentsResult value for this AATGetParentsResponse.
     * 
     * @return AATGetParentsResult
     */
    public edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult getAATGetParentsResult() {
        return AATGetParentsResult;
    }


    /**
     * Sets the AATGetParentsResult value for this AATGetParentsResponse.
     * 
     * @param AATGetParentsResult
     */
    public void setAATGetParentsResult(edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult AATGetParentsResult) {
        this.AATGetParentsResult = AATGetParentsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetParentsResponse)) return false;
        AATGetParentsResponse other = (AATGetParentsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetParentsResult==null && other.getAATGetParentsResult()==null) || 
             (this.AATGetParentsResult!=null &&
              this.AATGetParentsResult.equals(other.getAATGetParentsResult())));
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
        if (getAATGetParentsResult() != null) {
            _hashCode += getAATGetParentsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetParentsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetParentsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetParentsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetParentsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetParentsResponse>AATGetParentsResult"));
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
