package edu.getty.vocabsservices;

public class AATWebServicesSoapProxy implements edu.getty.vocabsservices.AATWebServicesSoap {
  private String _endpoint = null;
  private edu.getty.vocabsservices.AATWebServicesSoap aATWebServicesSoap = null;
  
  public AATWebServicesSoapProxy() {
    _initAATWebServicesSoapProxy();
  }
  
  public AATWebServicesSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAATWebServicesSoapProxy();
  }
  
  private void _initAATWebServicesSoapProxy() {
    try {
      aATWebServicesSoap = (new edu.getty.vocabsservices.AATWebServicesLocator()).getAATWebServicesSoap();
      if (aATWebServicesSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aATWebServicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aATWebServicesSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aATWebServicesSoap != null)
      ((javax.xml.rpc.Stub)aATWebServicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.getty.vocabsservices.AATWebServicesSoap getAATWebServicesSoap() {
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap;
  }
  
  public edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult AATGetSubjectTerms(java.lang.String subjectID) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetSubjectTerms(subjectID);
  }
  
  public edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult AATGetSubject(java.lang.String subjectID) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetSubject(subjectID);
  }
  
  public edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult AATGetParents(java.lang.String subjectID) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetParents(subjectID);
  }
  
  public edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult AATGetChildren(java.lang.String subjectID) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetChildren(subjectID);
  }
  
  public edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult AATGetTermMatch(java.lang.String term, java.lang.String logop, java.lang.String notes) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetTermMatch(term, logop, notes);
  }
  
  public edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult AATGetSyncSubjectID(java.lang.String subjectID) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetSyncSubjectID(subjectID);
  }
  
  public edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult AATGetMergedSubjectID(java.lang.String startDate, java.lang.String endDate, java.lang.String translation) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetMergedSubjectID(startDate, endDate, translation);
  }
  
  public edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult AATGetRevisionHistory(java.lang.String startDate, java.lang.String endDate, java.lang.String param, java.lang.String english_only) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetRevisionHistory(startDate, endDate, param, english_only);
  }
  
  public java.lang.String AATGetTermLabelNoParent(java.lang.String term_id) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetTermLabelNoParent(term_id);
  }
  
  public java.lang.String AATGetSubjectLabelNoParent(java.lang.String subject_id) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetSubjectLabelNoParent(subject_id);
  }
  
  public java.lang.String AATGetParentLabel(java.lang.String subject_id) throws java.rmi.RemoteException{
    if (aATWebServicesSoap == null)
      _initAATWebServicesSoapProxy();
    return aATWebServicesSoap.AATGetParentLabel(subject_id);
  }
  
  
}