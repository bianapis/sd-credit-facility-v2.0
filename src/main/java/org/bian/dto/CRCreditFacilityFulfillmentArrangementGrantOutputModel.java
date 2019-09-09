package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementGrantOutputModel
 */
public class CRCreditFacilityFulfillmentArrangementGrantOutputModel   {
  private String creditFacilityFulfillmentArrangementGrantActionTaskReference = null;

  private Object creditFacilityFulfillmentArrangementGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCreditFacilityFulfillmentArrangementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Facility Fulfillment Arrangement instance grant service call 
   * @return creditFacilityFulfillmentArrangementGrantActionTaskReference
  **/

  public String getCreditFacilityFulfillmentArrangementGrantActionTaskReference() {
    return creditFacilityFulfillmentArrangementGrantActionTaskReference;
  }

  public void setCreditFacilityFulfillmentArrangementGrantActionTaskReference(String creditFacilityFulfillmentArrangementGrantActionTaskReference) {
    this.creditFacilityFulfillmentArrangementGrantActionTaskReference = creditFacilityFulfillmentArrangementGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCreditFacilityFulfillmentArrangementGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCreditFacilityFulfillmentArrangementGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

