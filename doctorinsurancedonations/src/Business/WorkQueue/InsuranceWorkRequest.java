/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author rajesh
 */
public class InsuranceWorkRequest extends WorkRequest {

    private String plcyNo;
    private String ssn;
    private String plcyNm;
    private String insCmpny;
    private double claimAmt;
    private String agent;
    private String financer;
    private double billAmt;
    private InsuranceCustomer insCust;
    private String healthCtr;

    public String getPlcyNo() {
        return plcyNo;
    }

    public void setPlcyNo(String plcyNo) {
        this.plcyNo = plcyNo;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPlcyNm() {
        return plcyNm;
    }

    public void setPlcyNm(String policyType) {
        this.plcyNm = policyType;
    }

    public String getInsCmpny() {
        return insCmpny;
    }

    public void setInsCmpny(String insCmpny) {
        this.insCmpny = insCmpny;
    }

    public double getClaimAmt() {
        return claimAmt;
    }

    public void setClaimAmt(double claimAmt) {
        this.claimAmt = claimAmt;
    }

    @Override
    public String toString() {
        return plcyNo;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getFinancer() {
        return financer;
    }

    public void setFinancer(String financer) {
        this.financer = financer;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

    public InsuranceCustomer getInsCust() {
        return insCust;
    }

    public void setInsCust(InsuranceCustomer insCust) {
        this.insCust = insCust;
    }

    public String getHealthCtr() {
        return healthCtr;
    }

    public void setHealthCtr(String healthCtr) {
        this.healthCtr = healthCtr;
    }

}
