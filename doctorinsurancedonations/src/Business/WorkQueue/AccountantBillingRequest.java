/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Patient.Patient;


/**
 *
 * @author dineshmurugesan
 */
public class AccountantBillingRequest extends WorkRequest {

    private double billingAmt;

    private boolean hasIns;
    private boolean isInsClmSettled;

    Patient patient;

    public double getBillingAmt() {
        return billingAmt;
    }

    public void setBillingAmt(double billingAmt) {
        this.billingAmt = billingAmt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isHasIns() {
        return hasIns;
    }

    public void setHasIns(boolean hasIns) {
        this.hasIns = hasIns;
    }

    public boolean isIsInsClmSettled() {
        return isInsClmSettled;
    }

    public void setIsInsClmSettled(boolean isInsClmSettled) {
        this.isInsClmSettled = isInsClmSettled;
    }

    @Override
    public String toString() {
        return String.valueOf(billingAmt);
    }

}
