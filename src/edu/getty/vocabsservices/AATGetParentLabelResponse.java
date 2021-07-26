/**
 * AATGetParentLabelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetParentLabelResponse  implements java.io.Serializable {
    private java.lang.String AATGetParentLabelResult;

    public AATGetParentLabelResponse() {
    }

    public AATGetParentLabelResponse(
           java.lang.String AATGetParentLabelResult) {
           this.AATGetParentLabelResult = AATGetParentLabelResult;
    }


    /**
     * Gets the AATGetParentLabelResult value for this AATGetParentLabelResponse.
     * 
     * @return AATGetParentLabelResult
     */
    public java.lang.String getAATGetParentLabelResult() {
        return AATGetParentLabelResult;
    }


    /**
     * Sets the AATGetParentLabelResult value for this AATGetParentLabelResponse.
     * 
     * @param AATGetParentLabelResult
     */
    public void setAATGetParentLabelResult(java.lang.String AATGetParentLabelResult) {
        this.AATGetParentLabelResult = AATGetParentLabelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetParentLabelResponse)) return false;
        AATGetParentLabelResponse other = (AATGetParentLabelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetParentLabelResult==null && other.getAATGetParentLabelResult()==null) || 
             (this.AATGetParentLabelResult!=null &&
              this.AATGetParentLabelResult.equals(other.getAATGetParentLabelResult())));
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
        if (getAATGetParentLabelResult() != null) {
            _hashCode += getAATGetParentLabelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetParentLabelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetParentLabelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetParentLabelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetParentLabelResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
