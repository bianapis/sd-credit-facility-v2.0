package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord
 */
public class BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String creditFacilityNumber = null;

  private String customerReference = null;

  private String partyReference = null;

  private String customerAgreementReference = null;

  private String customerCreditAssessmentReference = null;

  private String insuranceReference = null;

  private String delinquencyCollectionReference = null;

  private String bankBranchLocationReference = null;

  private String bankAccountingUnitReference = null;

  private String creditFacilityType = null;

  private String creditFacilityAmount = null;

  private String creditFacilityCurrency = null;

  private String creditFacilityRateType = null;

  private String creditFacilityApplicableRate = null;

  private String repaymentType = null;

  private String interestType = null;

  private String interestAccrualMethod = null;

  private String creditFacilityOriginationDate = null;

  private String creditFacilityMaturityDate = null;

  private String collateralReference = null;

  private String collateralAllocation = null;

  private String taxReference = null;

  private String creditFacilityAccessTerms = null;

  private BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown creditFacilityUnderlyingDrawdown = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordAssociations associations = null;

  private String creditFacilityRepaymentSchedule = null;

  private String stagedRepaymentStatement = null;

  private String customerCommentary = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer agreement 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an associated credit assessment 
   * @return customerCreditAssessmentReference
  **/

  public String getCustomerCreditAssessmentReference() {
    return customerCreditAssessmentReference;
  }

  public void setCustomerCreditAssessmentReference(String customerCreditAssessmentReference) {
    this.customerCreditAssessmentReference = customerCreditAssessmentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to applicable insurance arrangements 
   * @return insuranceReference
  **/

  public String getInsuranceReference() {
    return insuranceReference;
  }

  public void setInsuranceReference(String insuranceReference) {
    this.insuranceReference = insuranceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to collections/delinquency processing made against the credit facility 
   * @return delinquencyCollectionReference
  **/

  public String getDelinquencyCollectionReference() {
    return delinquencyCollectionReference;
  }

  public void setDelinquencyCollectionReference(String delinquencyCollectionReference) {
    this.delinquencyCollectionReference = delinquencyCollectionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the facility for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank accounting unit associated with the facility for booking purposes 
   * @return bankAccountingUnitReference
  **/

  public String getBankAccountingUnitReference() {
    return bankAccountingUnitReference;
  }

  public void setBankAccountingUnitReference(String bankAccountingUnitReference) {
    this.bankAccountingUnitReference = bankAccountingUnitReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to allocated collateral 
   * @return collateralReference
  **/

  public String getCollateralReference() {
    return collateralReference;
  }

  public void setCollateralReference(String collateralReference) {
    this.collateralReference = collateralReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The collateral value applied to the credit facility loan 
   * @return collateralAllocation
  **/

  public String getCollateralAllocation() {
    return collateralAllocation;
  }

  public void setCollateralAllocation(String collateralAllocation) {
    this.collateralAllocation = collateralAllocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
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

  public BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown getCreditFacilityUnderlyingDrawdown() {
    return creditFacilityUnderlyingDrawdown;
  }

  public void setCreditFacilityUnderlyingDrawdown(BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown creditFacilityUnderlyingDrawdown) {
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
   * Get associations
   * @return associations
  **/

  public BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for repayments 
   * @return creditFacilityRepaymentSchedule
  **/

  public String getCreditFacilityRepaymentSchedule() {
    return creditFacilityRepaymentSchedule;
  }

  public void setCreditFacilityRepaymentSchedule(String creditFacilityRepaymentSchedule) {
    this.creditFacilityRepaymentSchedule = creditFacilityRepaymentSchedule;
  }


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

