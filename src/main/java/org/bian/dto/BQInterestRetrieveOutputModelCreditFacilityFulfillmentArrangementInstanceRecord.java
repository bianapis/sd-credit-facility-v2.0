package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInterestRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord
 */
public class BQInterestRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String creditFacilityNumber = null;

  private String creditFacilityType = null;

  private String creditFacilityAmount = null;

  private String creditFacilityCurrency = null;

  private String creditFacilityRateType = null;

  private String creditFacilityApplicableRate = null;

  private String interestType = null;

  private String interestAccrualMethod = null;

  private String creditFacilityOriginationDate = null;

  private String creditFacilityMaturityDate = null;

  private String creditFacilityOutstandingBalance = null;

  private CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the credit facility product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated credit facility account number in any suitable format 
   * @return creditFacilityNumber
  **/

  public String getCreditFacilityNumber() {
    return creditFacilityNumber;
  }

  public void setCreditFacilityNumber(String creditFacilityNumber) {
    this.creditFacilityNumber = creditFacilityNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific type of credit facility (e.g. term, revolving, letter of credit, retail) 
   * @return creditFacilityType
  **/

  public String getCreditFacilityType() {
    return creditFacilityType;
  }

  public void setCreditFacilityType(String creditFacilityType) {
    this.creditFacilityType = creditFacilityType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the credit facility 
   * @return creditFacilityAmount
  **/

  public String getCreditFacilityAmount() {
    return creditFacilityAmount;
  }

  public void setCreditFacilityAmount(String creditFacilityAmount) {
    this.creditFacilityAmount = creditFacilityAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the facility 
   * @return creditFacilityCurrency
  **/

  public String getCreditFacilityCurrency() {
    return creditFacilityCurrency;
  }

  public void setCreditFacilityCurrency(String creditFacilityCurrency) {
    this.creditFacilityCurrency = creditFacilityCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The rate type to be applied to the credit facility 
   * @return creditFacilityRateType
  **/

  public String getCreditFacilityRateType() {
    return creditFacilityRateType;
  }

  public void setCreditFacilityRateType(String creditFacilityRateType) {
    this.creditFacilityRateType = creditFacilityRateType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The applicable rate for the credit facility 
   * @return creditFacilityApplicableRate
  **/

  public String getCreditFacilityApplicableRate() {
    return creditFacilityApplicableRate;
  }

  public void setCreditFacilityApplicableRate(String creditFacilityApplicableRate) {
    this.creditFacilityApplicableRate = creditFacilityApplicableRate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of interest to be applied (e.g. prime plus) 
   * @return interestType
  **/

  public String getInterestType() {
    return interestType;
  }

  public void setInterestType(String interestType) {
    this.interestType = interestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The accrual method applied to interest calculations 
   * @return interestAccrualMethod
  **/

  public String getInterestAccrualMethod() {
    return interestAccrualMethod;
  }

  public void setInterestAccrualMethod(String interestAccrualMethod) {
    this.interestAccrualMethod = interestAccrualMethod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The origination date for the credit facility 
   * @return creditFacilityOriginationDate
  **/

  public String getCreditFacilityOriginationDate() {
    return creditFacilityOriginationDate;
  }

  public void setCreditFacilityOriginationDate(String creditFacilityOriginationDate) {
    this.creditFacilityOriginationDate = creditFacilityOriginationDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The planned maturity date of the credit facility 
   * @return creditFacilityMaturityDate
  **/

  public String getCreditFacilityMaturityDate() {
    return creditFacilityMaturityDate;
  }

  public void setCreditFacilityMaturityDate(String creditFacilityMaturityDate) {
    this.creditFacilityMaturityDate = creditFacilityMaturityDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outstanding balance available for the credit facility 
   * @return creditFacilityOutstandingBalance
  **/

  public String getCreditFacilityOutstandingBalance() {
    return creditFacilityOutstandingBalance;
  }

  public void setCreditFacilityOutstandingBalance(String creditFacilityOutstandingBalance) {
    this.creditFacilityOutstandingBalance = creditFacilityOutstandingBalance;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

