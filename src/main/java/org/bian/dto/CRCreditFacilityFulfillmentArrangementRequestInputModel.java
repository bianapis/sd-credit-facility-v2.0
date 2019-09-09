package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRequestInputModel
 */
public class CRCreditFacilityFulfillmentArrangementRequestInputModel   {
  private String creditFacilityServicingSessionReference = null;

  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private Object creditFacilityFulfillmentArrangementRequestActionTaskRecord = null;

  private CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

