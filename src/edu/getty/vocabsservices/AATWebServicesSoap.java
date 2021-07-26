/**
 * AATWebServicesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.getty.vocabsservices;

public interface AATWebServicesSoap extends java.rmi.Remote {

    /**
     * Return termID and all terms based on subjectID
     */
    public edu.getty.vocabsservices.AATGetSubjectTermsResponseAATGetSubjectTermsResult AATGetSubjectTerms(java.lang.String subjectID) throws java.rmi.RemoteException;

    /**
     * Return all data element associated with a VCS subject
     */
    public edu.getty.vocabsservices.AATGetSubjectResponseAATGetSubjectResult AATGetSubject(java.lang.String subjectID) throws java.rmi.RemoteException;

    /**
     * Return parent hierarchy for a given subject record
     */
    public edu.getty.vocabsservices.AATGetParentsResponseAATGetParentsResult AATGetParents(java.lang.String subjectID) throws java.rmi.RemoteException;

    /**
     * Return all immediate children of a given subject record
     */
    public edu.getty.vocabsservices.AATGetChildrenResponseAATGetChildrenResult AATGetChildren(java.lang.String subjectID) throws java.rmi.RemoteException;

    /**
     * Return result count, preferred term and matching terms
     */
    public edu.getty.vocabsservices.AATGetTermMatchResponseAATGetTermMatchResult AATGetTermMatch(java.lang.String term, java.lang.String logop, java.lang.String notes) throws java.rmi.RemoteException;

    /**
     * Return current subject ID for a given subject ID
     */
    public edu.getty.vocabsservices.AATGetSyncSubjectIDResponseAATGetSyncSubjectIDResult AATGetSyncSubjectID(java.lang.String subjectID) throws java.rmi.RemoteException;

    /**
     * Return a list of records with old and new IDs that have been
     * merged
     */
    public edu.getty.vocabsservices.AATGetMergedSubjectIDResponseAATGetMergedSubjectIDResult AATGetMergedSubjectID(java.lang.String startDate, java.lang.String endDate, java.lang.String translation) throws java.rmi.RemoteException;

    /**
     * Return info on edits made within certain data based on input
     * parameter
     */
    public edu.getty.vocabsservices.AATGetRevisionHistoryResponseAATGetRevisionHistoryResult AATGetRevisionHistory(java.lang.String startDate, java.lang.String endDate, java.lang.String param, java.lang.String english_only) throws java.rmi.RemoteException;

    /**
     * Returns English text label for a AAT term (internal Getty use
     * only)
     */
    public java.lang.String AATGetTermLabelNoParent(java.lang.String term_id) throws java.rmi.RemoteException;

    /**
     * Returns English text label with no parent string for a AAT
     * record (internal Getty use only)
     */
    public java.lang.String AATGetSubjectLabelNoParent(java.lang.String subject_id) throws java.rmi.RemoteException;

    /**
     * Returns English text parent string for a AAT record (internal
     * Getty use only)
     */
    public java.lang.String AATGetParentLabel(java.lang.String subject_id) throws java.rmi.RemoteException;
}
