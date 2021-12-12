/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rajesh
 */
public class PatientTreatmentWorkRequest extends WorkRequest {

    private String regDt;
    private String reasonForVisit;
    private Patient pat;
    private String labTstType;
    private String labRslt;
    private UserAccount labAst;
    private String labTstMsg;
    private String prescription;
    private double billAmt;
    private UserAccount assignedDoc;
    private int bloodUnits;
    private String bloodBankMessage;
    private UserAccount bloodBankManager;

    public UserAccount getBloodBankManager() {
        return bloodBankManager;
    }

    public void setBloodBankManager(UserAccount bloodBankManager) {
        this.bloodBankManager = bloodBankManager;
    }

    public int getBloodUnits() {
        return bloodUnits;
    }

    public void setBloodUnits(int bloodUnits) {
        this.bloodUnits = bloodUnits;
    }

    public String getBloodBankMessage() {
        return bloodBankMessage;
    }

    public void setBloodBankMessage(String bloodBankMessage) {
        this.bloodBankMessage = bloodBankMessage;
    }

    public PatientTreatmentWorkRequest(String Date, String reasonForVisit, Patient patient) {
        this.regDt = Date;
        this.reasonForVisit = reasonForVisit;
        this.pat = patient;
    }

    public String getRegDt() {
        return regDt;
    }

    public void setRegDt(String Date) {
        this.regDt = Date;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public Patient getPat() {
        return pat;
    }

    public void setPat(Patient pat) {
        this.pat = pat;
    }

    public String getLabTstType() {
        return labTstType;
    }

    public void setLabTstType(String labTstType) {
        this.labTstType = labTstType;
    }

    public String getLabRslt() {
        return labRslt;
    }

    public void setLabRslt(String labRslt) {
        this.labRslt = labRslt;
    }

    public UserAccount getLabAst() {
        return labAst;
    }

    public void setLabAst(UserAccount labAst) {
        this.labAst = labAst;
    }

    public String getLabTstMsg() {
        return labTstMsg;
    }

    public void setLabTstMsg(String labTstMsg) {
        this.labTstMsg = labTstMsg;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

    public UserAccount getAssignedDoc() {
        return assignedDoc;
    }

    public void setAssignedDoc(UserAccount assignedDoc) {
        this.assignedDoc = assignedDoc;
    }

    @Override
    public String toString() {
        return reasonForVisit;
    }

}
