package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementInitiateInputModel
 */
public class CRCreditFacilityFulfillmentArrangementInitiateInputModel   {
  private String creditFacilityServicingSessionReference = null;

  private Object creditFacilityFulfillmentArrangementInitiateActionRecord = null;

  private String creditFacilityFulfillmentArrangementInstanceStatus = null;

  private CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return creditFacilityServicingSessionReference
  **/

  public String getCreditFacilityServicingSessionReference() {
    return creditFacilityServicingSessionReference;
  }

  public void setCreditFacilityServicingSessionReference(String creditFacilityServicingSessionReference) {
    this.creditFacilityServicingSessionReference = creditFacilityServicingSessionReference;
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

  public CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord getCreditFacilityFulfillmentArrangementInstanceRecord() {
    return creditFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceRecord(CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord) {
    this.creditFacilityFulfillmentArrangementInstanceRecord = creditFacilityFulfillmentArrangementInstanceRecord;
  }


}

