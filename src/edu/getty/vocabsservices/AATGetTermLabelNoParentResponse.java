/**
 * AATGetTermLabelNoParentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetTermLabelNoParentResponse  implements java.io.Serializable {
    private java.lang.String AATGetTermLabelNoParentResult;

    public AATGetTermLabelNoParentResponse() {
    }

    public AATGetTermLabelNoParentResponse(
           java.lang.String AATGetTermLabelNoParentResult) {
           this.AATGetTermLabelNoParentResult = AATGetTermLabelNoParentResult;
    }


    /**
     * Gets the AATGetTermLabelNoParentResult value for this AATGetTermLabelNoParentResponse.
     * 
     * @return AATGetTermLabelNoParentResult
     */
    public java.lang.String getAATGetTermLabelNoParentResult() {
        return AATGetTermLabelNoParentResult;
    }


    /**
     * Sets the AATGetTermLabelNoParentResult value for this AATGetTermLabelNoParentResponse.
     * 
     * @param AATGetTermLabelNoParentResult
     */
    public void setAATGetTermLabelNoParentResult(java.lang.String AATGetTermLabelNoParentResult) {
        this.AATGetTermLabelNoParentResult = AATGetTermLabelNoParentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetTermLabelNoParentResponse)) return false;
        AATGetTermLabelNoParentResponse other = (AATGetTermLabelNoParentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetTermLabelNoParentResult==null && other.getAATGetTermLabelNoParentResult()==null) || 
             (this.AATGetTermLabelNoParentResult!=null &&
              this.AATGetTermLabelNoParentResult.equals(other.getAATGetTermLabelNoParentResult())));
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
        if (getAATGetTermLabelNoParentResult() != null) {
            _hashCode += getAATGetTermLabelNoParentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetTermLabelNoParentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermLabelNoParentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetTermLabelNoParentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetTermLabelNoParentResult"));
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
