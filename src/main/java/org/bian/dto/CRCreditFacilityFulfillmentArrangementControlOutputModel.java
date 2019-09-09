package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementControlOutputModel
 */
public class CRCreditFacilityFulfillmentArrangementControlOutputModel   {
  private String creditFacilityFulfillmentArrangementControlActionTaskReference = null;

  private Object creditFacilityFulfillmentArrangementControlActionTaskRecord = null;

  private String creditFacilityFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Facility Fulfillment Arrangement instance control processing service call 
   * @return creditFacilityFulfillmentArrangementControlActionTaskReference
  **/

  public String getCreditFacilityFulfillmentArrangementControlActionTaskReference() {
    return creditFacilityFulfillmentArrangementControlActionTaskReference;
  }

  public void setCreditFacilityFulfillmentArrangementControlActionTaskReference(String creditFacilityFulfillmentArrangementControlActionTaskReference) {
    this.creditFacilityFulfillmentArrangementControlActionTaskReference = creditFacilityFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return creditFacilityFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCreditFacilityFulfillmentArrangementControlActionTaskRecord() {
    return creditFacilityFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCreditFacilityFulfillmentArrangementControlActionTaskRecord(Object creditFacilityFulfillmentArrangementControlActionTaskRecord) {
    this.creditFacilityFulfillmentArrangementControlActionTaskRecord = creditFacilityFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return creditFacilityFulfillmentArrangementControlActionResponse
  **/

  public String getCreditFacilityFulfillmentArrangementControlActionResponse() {
    return creditFacilityFulfillmentArrangementControlActionResponse;
  }

  public void setCreditFacilityFulfillmentArrangementControlActionResponse(String creditFacilityFulfillmentArrangementControlActionResponse) {
    this.creditFacilityFulfillmentArrangementControlActionResponse = creditFacilityFulfillmentArrangementControlActionResponse;
  }


}

