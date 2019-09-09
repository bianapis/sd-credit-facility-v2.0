package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRepaymentRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord
 */
public class BQRepaymentRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String creditFacilityNumber = null;

  private String customerReference = null;

  private String partyReference = null;

  private String repaymentType = null;

  private String creditFacilityAccessTerms = null;

  private BQRepaymentRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown creditFacilityUnderlyingDrawdown = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The legal entity reference for the borrower, likely to be the same as the corporate customer 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of repayment arrangement in place (e.g. structured, revolving) 
   * @return repaymentType
  **/

  public String getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(String repaymentType) {
    this.repaymentType = repaymentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Access terms that apply (e.g. allowed drawdown terms, repayment) 
   * @return creditFacilityAccessTerms
  **/

  public String getCreditFacilityAccessTerms() {
    return creditFacilityAccessTerms;
  }

  public void setCreditFacilityAccessTerms(String creditFacilityAccessTerms) {
    this.creditFacilityAccessTerms = creditFacilityAccessTerms;
  }


  /**
   * Get creditFacilityUnderlyingDrawdown
   * @return creditFacilityUnderlyingDrawdown
  **/

  public BQRepaymentRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown getCreditFacilityUnderlyingDrawdown() {
    return creditFacilityUnderlyingDrawdown;
  }

  public void setCreditFacilityUnderlyingDrawdown(BQRepaymentRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown creditFacilityUnderlyingDrawdown) {
    this.creditFacilityUnderlyingDrawdown = creditFacilityUnderlyingDrawdown;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
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

