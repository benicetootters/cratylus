/**
 * AATWebServicesSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public class AATWebServicesSoapStub extends org.apache.axis.client.Stub implements edu.getty.vocabsservices.AATWebServicesSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetSubjectTerms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subjectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSubjectTermsResponse>AATGetSubjectTermsResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectTermsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetSubject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subjectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSubjectResponse>AATGetSubjectResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetParents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subjectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetParentsResponse>AATGetParentsResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetParentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetChildren");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subjectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetChildrenResponse>AATGetChildrenResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetChildrenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetTermMatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "term"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "logop"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "notes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetTermMatchResponse>AATGetTermMatchResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetTermMatchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetSyncSubjectID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subjectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSyncSubjectIDResponse>AATGetSyncSubjectIDResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSyncSubjectIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetMergedSubjectID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "translation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetMergedSubjectIDResponse>AATGetMergedSubjectIDResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetMergedSubjectIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetRevisionHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "english_only"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetRevisionHistoryResponse>AATGetRevisionHistoryResult"));
        oper.setReturnClass(edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetRevisionHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetTermLabelNoParent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "term_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetTermLabelNoParentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetSubjectLabelNoParent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subject_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectLabelNoParentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AATGetParentLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "subject_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetParentLabelResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public AATWebServicesSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AATWebServicesSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AATWebServicesSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetChildrenResponse>AATGetChildrenResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetMergedSubjectIDResponse>AATGetMergedSubjectIDResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetParentsResponse>AATGetParentsResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetRevisionHistoryResponse>AATGetRevisionHistoryResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSubjectResponse>AATGetSubjectResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSubjectTermsResponse>AATGetSubjectTermsResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetSyncSubjectIDResponse>AATGetSyncSubjectIDResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">>AATGetTermMatchResponse>AATGetTermMatchResult");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetChildren");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetChildren.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetChildrenResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetChildrenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetMergedSubjectID");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetMergedSubjectID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetMergedSubjectIDResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetMergedSubjectIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetParentLabel");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetParentLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetParentLabelResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetParentLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetParents");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetParents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetParentsResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetParentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetRevisionHistory");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetRevisionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetRevisionHistoryResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetRevisionHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubject");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSubject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubjectLabelNoParent");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSubjectLabelNoParent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubjectLabelNoParentResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSubjectLabelNoParentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSubjectResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSubjectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSyncSubjectID");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSyncSubjectID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetSyncSubjectIDResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetSyncSubjectIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermLabelNoParent");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetTermLabelNoParent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermLabelNoParentResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetTermLabelNoParentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermMatch");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetTermMatch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", ">AATGetTermMatchResponse");
            cachedSerQNames.add(qName);
            cls = edu.getty.vocabsservices.AATGetTermMatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult AATGetSubjectTerms(java.lang.String subjectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetSubjectTerms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectTerms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subjectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult AATGetSubject(java.lang.String subjectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetSubject");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subjectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult AATGetParents(java.lang.String subjectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetParents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetParents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subjectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult AATGetChildren(java.lang.String subjectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetChildren");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetChildren"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subjectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult AATGetTermMatch(java.lang.String term, java.lang.String logop, java.lang.String notes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetTermMatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetTermMatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {term, logop, notes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult AATGetSyncSubjectID(java.lang.String subjectID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetSyncSubjectID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSyncSubjectID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subjectID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult AATGetMergedSubjectID(java.lang.String startDate, java.lang.String endDate, java.lang.String translation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetMergedSubjectID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetMergedSubjectID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startDate, endDate, translation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult AATGetRevisionHistory(java.lang.String startDate, java.lang.String endDate, java.lang.String param, java.lang.String english_only) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetRevisionHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetRevisionHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {startDate, endDate, param, english_only});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult) org.apache.axis.utils.JavaUtils.convert(_resp, edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String AATGetTermLabelNoParent(java.lang.String term_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetTermLabelNoParent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetTermLabelNoParent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {term_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String AATGetSubjectLabelNoParent(java.lang.String subject_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetSubjectLabelNoParent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetSubjectLabelNoParent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subject_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String AATGetParentLabel(java.lang.String subject_id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://vocabsservices.getty.edu/AATGetParentLabel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://vocabsservices.getty.edu/", "AATGetParentLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subject_id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
