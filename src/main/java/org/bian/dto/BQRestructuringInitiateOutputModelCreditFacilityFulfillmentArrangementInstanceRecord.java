package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateOutputModelCreditFacilityFulfillmentArrangementInstanceRecord
 */
public class BQRestructuringInitiateOutputModelCreditFacilityFulfillmentArrangementInstanceRecord   {
  private String stagedRepaymentStatement = null;

  private String customerCommentary = null;

  private String creditFacilityOutstandingBalance = null;

  private CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A statement maintained tracking repayments 
   * @return stagedRepaymentStatement
  **/

  public String getStagedRepaymentStatement() {
    return stagedRepaymentStatement;
  }

  public void setStagedRepaymentStatement(String stagedRepaymentStatement) {
    this.stagedRepaymentStatement = stagedRepaymentStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of customer correspondence/feedback 
   * @return customerCommentary
  **/

  public String getCustomerCommentary() {
    return customerCommentary;
  }

  public void setCustomerCommentary(String customerCommentary) {
    this.customerCommentary = customerCommentary;
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

