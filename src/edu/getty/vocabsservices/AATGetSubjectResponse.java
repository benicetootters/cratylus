/**
 * AATGetSubjectResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetSubjectResponse  implements java.io.Serializable {
    private edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult AATGetSubjectResult;

    public AATGetSubjectResponse() {
    }

    public AATGetSubjectResponse(
           edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult AATGetSubjectResult) {
           this.AATGetSubjectResult = AATGetSubjectResult;
    }


    /**
     * Gets the AATGetSubjectResult value for this AATGetSubjectResponse.
     * 
     * @return AATGetSubjectResult
     */
    public edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult getAATGetSubjectResult() {
        return AATGetSubjectResult;
    }


    /**
     * Sets the AATGetSubjectResult value for this AATGetSubjectResponse.
     * 
     * @param AATGetSubjectResult
     */
    public void setAATGetSubjectResult(edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult AATGetSubjectResult) {
        this.AATGetSubjectResult = AATGetSubjectResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetSubjectResponse)) return false;
        AATGetSubjectResponse other = (AATGetSubjectResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetSubjectResult==null && other.getAATGetSubjectResult()==null) || 
             (this.AATGetSubjectResult!=null &&
              this.AATGetSubjectResult.equals(other.getAATGetSubjectResult())));
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
        if (getAATGetSubjectResult() != null) {
            _hashCode += getAATGetSubjectResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetSubjectResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubjectResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetSubjectResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSubjectResponse>AATGetSubjectResult"));
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
