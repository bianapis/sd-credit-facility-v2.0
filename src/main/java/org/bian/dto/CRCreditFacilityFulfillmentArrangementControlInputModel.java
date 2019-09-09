package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementControlInputModelCreditFacilityFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementControlInputModel
 */
public class CRCreditFacilityFulfillmentArrangementControlInputModel   {
  private String creditFacilityServicingSessionReference = null;

  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private Object creditFacilityFulfillmentArrangementControlActionTaskRecord = null;

  private CRCreditFacilityFulfillmentArrangementControlInputModelCreditFacilityFulfillmentArrangementControlActionRequest creditFacilityFulfillmentArrangementControlActionRequest = null;


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
   * Get creditFacilityFulfillmentArrangementControlActionRequest
   * @return creditFacilityFulfillmentArrangementControlActionRequest
  **/

  public CRCreditFacilityFulfillmentArrangementControlInputModelCreditFacilityFulfillmentArrangementControlActionRequest getCreditFacilityFulfillmentArrangementControlActionRequest() {
    return creditFacilityFulfillmentArrangementControlActionRequest;
  }

  public void setCreditFacilityFulfillmentArrangementControlActionRequest(CRCreditFacilityFulfillmentArrangementControlInputModelCreditFacilityFulfillmentArrangementControlActionRequest creditFacilityFulfillmentArrangementControlActionRequest) {
    this.creditFacilityFulfillmentArrangementControlActionRequest = creditFacilityFulfillmentArrangementControlActionRequest;
  }


}

