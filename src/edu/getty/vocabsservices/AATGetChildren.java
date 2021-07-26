/**
 * AATGetChildren.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetChildren  implements java.io.Serializable {
    private java.lang.String subjectID;

    public AATGetChildren() {
    }

    public AATGetChildren(
           java.lang.String subjectID) {
           this.subjectID = subjectID;
    }


    /**
     * Gets the subjectID value for this AATGetChildren.
     * 
     * @return subjectID
     */
    public java.lang.String getSubjectID() {
        return subjectID;
    }


    /**
     * Sets the subjectID value for this AATGetChildren.
     * 
     * @param subjectID
     */
    public void setSubjectID(java.lang.String subjectID) {
        this.subjectID = subjectID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetChildren)) return false;
        AATGetChildren other = (AATGetChildren) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subjectID==null && other.getSubjectID()==null) || 
             (this.subjectID!=null &&
              this.subjectID.equals(other.getSubjectID())));
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
        if (getSubjectID() != null) {
            _hashCode += getSubjectID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetChildren.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetChildren"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subjectID"));
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
