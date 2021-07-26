/**
 * AATGetTermLabelNoParent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetTermLabelNoParent  implements java.io.Serializable {
    private java.lang.String term_id;

    public AATGetTermLabelNoParent() {
    }

    public AATGetTermLabelNoParent(
           java.lang.String term_id) {
           this.term_id = term_id;
    }


    /**
     * Gets the term_id value for this AATGetTermLabelNoParent.
     * 
     * @return term_id
     */
    public java.lang.String getTerm_id() {
        return term_id;
    }


    /**
     * Sets the term_id value for this AATGetTermLabelNoParent.
     * 
     * @param term_id
     */
    public void setTerm_id(java.lang.String term_id) {
        this.term_id = term_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetTermLabelNoParent)) return false;
        AATGetTermLabelNoParent other = (AATGetTermLabelNoParent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.term_id==null && other.getTerm_id()==null) || 
             (this.term_id!=null &&
              this.term_id.equals(other.getTerm_id())));
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
        if (getTerm_id() != null) {
            _hashCode += getTerm_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetTermLabelNoParent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermLabelNoParent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("term_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "term_id"));
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
