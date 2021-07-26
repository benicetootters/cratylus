/**
 * AATGetSubjectLabelNoParentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetSubjectLabelNoParentResponse  implements java.io.Serializable {
    private java.lang.String AATGetSubjectLabelNoParentResult;

    public AATGetSubjectLabelNoParentResponse() {
    }

    public AATGetSubjectLabelNoParentResponse(
           java.lang.String AATGetSubjectLabelNoParentResult) {
           this.AATGetSubjectLabelNoParentResult = AATGetSubjectLabelNoParentResult;
    }


    /**
     * Gets the AATGetSubjectLabelNoParentResult value for this AATGetSubjectLabelNoParentResponse.
     * 
     * @return AATGetSubjectLabelNoParentResult
     */
    public java.lang.String getAATGetSubjectLabelNoParentResult() {
        return AATGetSubjectLabelNoParentResult;
    }


    /**
     * Sets the AATGetSubjectLabelNoParentResult value for this AATGetSubjectLabelNoParentResponse.
     * 
     * @param AATGetSubjectLabelNoParentResult
     */
    public void setAATGetSubjectLabelNoParentResult(java.lang.String AATGetSubjectLabelNoParentResult) {
        this.AATGetSubjectLabelNoParentResult = AATGetSubjectLabelNoParentResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetSubjectLabelNoParentResponse)) return false;
        AATGetSubjectLabelNoParentResponse other = (AATGetSubjectLabelNoParentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AATGetSubjectLabelNoParentResult==null && other.getAATGetSubjectLabelNoParentResult()==null) || 
             (this.AATGetSubjectLabelNoParentResult!=null &&
              this.AATGetSubjectLabelNoParentResult.equals(other.getAATGetSubjectLabelNoParentResult())));
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
        if (getAATGetSubjectLabelNoParentResult() != null) {
            _hashCode += getAATGetSubjectLabelNoParentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetSubjectLabelNoParentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubjectLabelNoParentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AATGetSubjectLabelNoParentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectLabelNoParentResult"));
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
