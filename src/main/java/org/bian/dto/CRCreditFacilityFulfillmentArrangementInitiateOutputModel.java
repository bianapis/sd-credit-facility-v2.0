package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateOutputModelCreditFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementInitiateOutputModel
 */
public class CRCreditFacilityFulfillmentArrangementInitiateOutputModel   {
  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private String creditFacilityFulfillmentArrangementInitiateActionReference = null;

  private Object creditFacilityFulfillmentArrangementInitiateActionRecord = null;

  private String creditFacilityFulfillmentArrangementInstanceStatus = null;

  private CRCreditFacilityFulfillmentArrangementInitiateOutputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Facility Fulfillment Arrangement instance 
   * @return creditFacilityFulfillmentArrangementInstanceReference
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceReference() {
    return creditFacilityFulfillmentArrangementInstanceReference;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReference(String creditFacilityFulfillmentArrangementInstanceReference) {
    this.creditFacilityFulfillmentArrangementInstanceReference = creditFacilityFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return creditFacilityFulfillmentArrangementInitiateActionReference
  **/

  public String getCreditFacilityFulfillmentArrangementInitiateActionReference() {
    return creditFacilityFulfillmentArrangementInitiateActionReference;
  }

  public void setCreditFacilityFulfillmentArrangementInitiateActionReference(String creditFacilityFulfillmentArrangementInitiateActionReference) {
    this.creditFacilityFulfillmentArrangementInitiateActionReference = creditFacilityFulfillmentArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return creditFacilityFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCreditFacilityFulfillmentArrangementInitiateActionRecord() {
    return creditFacilityFulfillmentArrangementInitiateActionRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInitiateActionRecord(Object creditFacilityFulfillmentArrangementInitiateActionRecord) {
    this.creditFacilityFulfillmentArrangementInitiateActionRecord = creditFacilityFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit Facility Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return creditFacilityFulfillmentArrangementInstanceStatus
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceStatus() {
    return creditFacilityFulfillmentArrangementInstanceStatus;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceStatus(String creditFacilityFulfillmentArrangementInstanceStatus) {
    this.creditFacilityFulfillmentArrangementInstanceStatus = creditFacilityFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get creditFacilityFulfillmentArrangementInstanceRecord
   * @return creditFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRCreditFacilityFulfillmentArrangementInitiateOutputModelCreditFacilityFulfillmentArrangementInstanceRecord getCreditFacilityFulfillmentArrangementInstanceRecord() {
    return creditFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceRecord(CRCreditFacilityFulfillmentArrangementInitiateOutputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord) {
    this.creditFacilityFulfillmentArrangementInstanceRecord = creditFacilityFulfillmentArrangementInstanceRecord;
  }


}

