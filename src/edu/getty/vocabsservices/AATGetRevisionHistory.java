/**
 * AATGetRevisionHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATGetRevisionHistory  implements java.io.Serializable {
    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String param;

    private java.lang.String english_only;

    public AATGetRevisionHistory() {
    }

    public AATGetRevisionHistory(
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String param,
           java.lang.String english_only) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.param = param;
           this.english_only = english_only;
    }


    /**
     * Gets the startDate value for this AATGetRevisionHistory.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AATGetRevisionHistory.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this AATGetRevisionHistory.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AATGetRevisionHistory.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the param value for this AATGetRevisionHistory.
     * 
     * @return param
     */
    public java.lang.String getParam() {
        return param;
    }


    /**
     * Sets the param value for this AATGetRevisionHistory.
     * 
     * @param param
     */
    public void setParam(java.lang.String param) {
        this.param = param;
    }


    /**
     * Gets the english_only value for this AATGetRevisionHistory.
     * 
     * @return english_only
     */
    public java.lang.String getEnglish_only() {
        return english_only;
    }


    /**
     * Sets the english_only value for this AATGetRevisionHistory.
     * 
     * @param english_only
     */
    public void setEnglish_only(java.lang.String english_only) {
        this.english_only = english_only;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AATGetRevisionHistory)) return false;
        AATGetRevisionHistory other = (AATGetRevisionHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.param==null && other.getParam()==null) || 
             (this.param!=null &&
              this.param.equals(other.getParam()))) &&
            ((this.english_only==null && other.getEnglish_only()==null) || 
             (this.english_only!=null &&
              this.english_only.equals(other.getEnglish_only())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getParam() != null) {
            _hashCode += getParam().hashCode();
        }
        if (getEnglish_only() != null) {
            _hashCode += getEnglish_only().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AATGetRevisionHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetRevisionHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "param"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("english_only");
        elemField.setXmlName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "english_only"));
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
