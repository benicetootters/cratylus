/**
 * AATGetMergedSubjectIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetMergedSubjectIDResponse  implements java.io.Serializable {
    private edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult AATGetMergedSubjectIDResult;

    public AATGetMergedSubjectIDResponse() {
    }

    public AATGetMergedSubjectIDResponse(
           edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult AATGetMergedSubjectIDResult) {
           this.AATGetMergedSubjectIDResult = AATGetMergedSubjectIDResult;
    }


    /**
     * Gets the AATGetMergedSubjectIDResult value for this AATGetMergedSubjectIDResponse.
     * 
     * @return AATGetMergedSubjectIDResult
     */
    public edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult getAATGetMergedSubjectIDResult() {
        return AATGetMergedSubjectIDResult;
    }


    /**
     * Sets the AATGetMergedSubjectIDResult value for this AATGetMergedSubjectIDResponse.
     * 
     * @param AATGetMergedSubjectIDResult
     */
    public void setAATGetMergedSubjectIDResult(edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult AATGetMergedSubjectIDResult) {
        this.AATGetMergedSubjectIDResult = AATGetMergedSubjectIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetMergedSubjectIDResponse)) return false;
        AATGetMergedSubjectIDResponse other = (AATGetMergedSubjectIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetMergedSubjectIDResult==null && other.getAATGetMergedSubjectIDResult()==null) || 
             (this.AATGetMergedSubjectIDResult!=null &&
              this.AATGetMergedSubjectIDResult.equals(other.getAATGetMergedSubjectIDResult())));
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
        if (getAATGetMergedSubjectIDResult() != null) {
            _hashCode += getAATGetMergedSubjectIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetMergedSubjectIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetMergedSubjectIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetMergedSubjectIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetMergedSubjectIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetMergedSubjectIDResponse>AATGetMergedSubjectIDResult"));
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
