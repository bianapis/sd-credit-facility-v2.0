package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementUpdateInputModelCreditFacilityFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementUpdateOutputModel
 */
public class CRCreditFacilityFulfillmentArrangementUpdateOutputModel   {
  private CRCreditFacilityFulfillmentArrangementUpdateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord = null;

  private String creditFacilityFulfillmentArrangementUpdateActionTaskReference = null;

  private Object creditFacilityFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditFacilityFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCreditFacilityFulfillmentArrangementUpdateActionTaskReference() {
    return creditFacilityFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCreditFacilityFulfillmentArrangementUpdateActionTaskReference(String creditFacilityFulfillmentArrangementUpdateActionTaskReference) {
    this.creditFacilityFulfillmentArrangementUpdateActionTaskReference = creditFacilityFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

