package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementUpdateInputModelCreditFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementUpdateInputModel
 */
public class CRCreditFacilityFulfillmentArrangementUpdateInputModel   {
  private String creditFacilityServicingSessionReference = null;

  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private CRCreditFacilityFulfillmentArrangementUpdateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord = null;

  private Object creditFacilityFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get creditFacilityFulfillmentArrangementInstanceRecord
   * @return creditFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRCreditFacilityFulfillmentArrangementUpdateInputModelCreditFacilityFulfillmentArrangementInstanceRecord getCreditFacilityFulfillmentArrangementInstanceRecord() {
    return creditFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceRecord(CRCreditFacilityFulfillmentArrangementUpdateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord) {
    this.creditFacilityFulfillmentArrangementInstanceRecord = creditFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditFacilityFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCreditFacilityFulfillmentArrangementUpdateActionTaskRecord() {
    return creditFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCreditFacilityFulfillmentArrangementUpdateActionTaskRecord(Object creditFacilityFulfillmentArrangementUpdateActionTaskRecord) {
    this.creditFacilityFulfillmentArrangementUpdateActionTaskRecord = creditFacilityFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

