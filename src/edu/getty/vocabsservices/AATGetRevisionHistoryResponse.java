/**
 * AATGetRevisionHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetRevisionHistoryResponse  implements java.io.Serializable {
    private edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult AATGetRevisionHistoryResult;

    public AATGetRevisionHistoryResponse() {
    }

    public AATGetRevisionHistoryResponse(
           edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult AATGetRevisionHistoryResult) {
           this.AATGetRevisionHistoryResult = AATGetRevisionHistoryResult;
    }


    /**
     * Gets the AATGetRevisionHistoryResult value for this AATGetRevisionHistoryResponse.
     * 
     * @return AATGetRevisionHistoryResult
     */
    public edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult getAATGetRevisionHistoryResult() {
        return AATGetRevisionHistoryResult;
    }


    /**
     * Sets the AATGetRevisionHistoryResult value for this AATGetRevisionHistoryResponse.
     * 
     * @param AATGetRevisionHistoryResult
     */
    public void setAATGetRevisionHistoryResult(edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult AATGetRevisionHistoryResult) {
        this.AATGetRevisionHistoryResult = AATGetRevisionHistoryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetRevisionHistoryResponse)) return false;
        AATGetRevisionHistoryResponse other = (AATGetRevisionHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetRevisionHistoryResult==null && other.getAATGetRevisionHistoryResult()==null) || 
             (this.AATGetRevisionHistoryResult!=null &&
              this.AATGetRevisionHistoryResult.equals(other.getAATGetRevisionHistoryResult())));
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
        if (getAATGetRevisionHistoryResult() != null) {
            _hashCode += getAATGetRevisionHistoryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetRevisionHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetRevisionHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetRevisionHistoryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetRevisionHistoryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetRevisionHistoryResponse>AATGetRevisionHistoryResult"));
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
