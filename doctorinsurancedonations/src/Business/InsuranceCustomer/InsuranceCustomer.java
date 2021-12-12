/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceCustomer;

/**
 *
 * @author bunty
 */

import Business.Insurance.Insurance;


public class InsuranceCustomer {

    private String custLstNme;
    private String custFrstNm;
    private String ssn;
    private String dob;
    private int age;
    private String phNo;
    private String address;
    private String gender;
    private String plcyStrtDt;
    private String plcyEdDt;

    private Insurance ins;
    private String insPlcyNo;

    public InsuranceCustomer(Insurance insurance, String policyNumber)
    {
        this.ins = insurance;
        this.insPlcyNo = policyNumber;
    }
    public String getCustLstNme() {
        return custLstNme;
    }

    public void setCustLstNme(String custLstNme) {
        this.custLstNme = custLstNme;
    }

    public String getCustFrstNm() {
        return custFrstNm;
    }

    public void setCustFrstNm(String custFrstNm) {
        this.custFrstNm = custFrstNm;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public String getInsuranceType() {
//        return insuranceType;
//    }
//
//    public void setInsuranceType(String insuranceType) {
//        this.insuranceType = insuranceType;
//    }
    public String getPlcyStrtDt() {
        return plcyStrtDt;
    }

    public void setPlcyStrtDt(String plcyStrtDt) {
        this.plcyStrtDt = plcyStrtDt;
    }

    public String getPlcyEdDt() {
        return plcyEdDt;
    }

    public void setPlcyEdDt(String plcyEdDt) {
        this.plcyEdDt = plcyEdDt;
    }

    public Insurance getIns() {
        return ins;
    }

    public void setIns(Insurance ins) {
        this.ins = ins;
    }

    public String getInsPlcyNo() {
        return insPlcyNo;
    }

    public void setInsPlcyNo(String insPlcyNo) {
        this.insPlcyNo = insPlcyNo;
    }

    @Override
    public String toString() {
        return insPlcyNo;
    }

}
