package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRequestOutputModel
 */
public class CRCreditFacilityFulfillmentArrangementRequestOutputModel   {
  private String creditFacilityFulfillmentArrangementRequestActionTaskReference = null;

  private Object creditFacilityFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Facility Fulfillment Arrangement instance request service call 
   * @return creditFacilityFulfillmentArrangementRequestActionTaskReference
  **/

  public String getCreditFacilityFulfillmentArrangementRequestActionTaskReference() {
    return creditFacilityFulfillmentArrangementRequestActionTaskReference;
  }

  public void setCreditFacilityFulfillmentArrangementRequestActionTaskReference(String creditFacilityFulfillmentArrangementRequestActionTaskReference) {
    this.creditFacilityFulfillmentArrangementRequestActionTaskReference = creditFacilityFulfillmentArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditFacilityFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getCreditFacilityFulfillmentArrangementRequestActionTaskRecord() {
    return creditFacilityFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setCreditFacilityFulfillmentArrangementRequestActionTaskRecord(Object creditFacilityFulfillmentArrangementRequestActionTaskRecord) {
    this.creditFacilityFulfillmentArrangementRequestActionTaskRecord = creditFacilityFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

