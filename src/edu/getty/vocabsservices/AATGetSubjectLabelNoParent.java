/**
 * AATGetSubjectLabelNoParent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetSubjectLabelNoParent  implements java.io.Serializable {
    private java.lang.String subject_id;

    public AATGetSubjectLabelNoParent() {
    }

    public AATGetSubjectLabelNoParent(
           java.lang.String subject_id) {
           this.subject_id = subject_id;
    }


    /**
     * Gets the subject_id value for this AATGetSubjectLabelNoParent.
     * 
     * @return subject_id
     */
    public java.lang.String getSubject_id() {
        return subject_id;
    }


    /**
     * Sets the subject_id value for this AATGetSubjectLabelNoParent.
     * 
     * @param subject_id
     */
    public void setSubject_id(java.lang.String subject_id) {
        this.subject_id = subject_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetSubjectLabelNoParent)) return false;
        AATGetSubjectLabelNoParent other = (AATGetSubjectLabelNoParent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject_id==null && other.getSubject_id()==null) || 
             (this.subject_id!=null &&
              this.subject_id.equals(other.getSubject_id())));
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
        if (getSubject_id() != null) {
            _hashCode += getSubject_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetSubjectLabelNoParent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubjectLabelNoParent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subject_id"));
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
