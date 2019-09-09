package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementGrantInputModel
 */
public class CRCreditFacilityFulfillmentArrangementGrantInputModel   {
  private String creditFacilityServicingSessionReference = null;

  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private Object creditFacilityFulfillmentArrangementGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCreditFacilityFulfillmentArrangementGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return creditFacilityFulfillmentArrangementGrantActionTaskRecord
  **/

  public Object getCreditFacilityFulfillmentArrangementGrantActionTaskRecord() {
    return creditFacilityFulfillmentArrangementGrantActionTaskRecord;
  }

  public void setCreditFacilityFulfillmentArrangementGrantActionTaskRecord(Object creditFacilityFulfillmentArrangementGrantActionTaskRecord) {
    this.creditFacilityFulfillmentArrangementGrantActionTaskRecord = creditFacilityFulfillmentArrangementGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCreditFacilityFulfillmentArrangementGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCreditFacilityFulfillmentArrangementGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

