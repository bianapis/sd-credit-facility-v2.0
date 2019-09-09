package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateInputModelRestructuringInstanceRecord;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQRestructuringRequestInputModel
 */
public class BQRestructuringRequestInputModel   {
  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private String restructuringInstanceReference = null;

  private BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord = null;

  private Object restructuringRequestActionTaskRecord = null;

  private CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Credit Facility Fulfillment Arrangement instance 
   * @return creditFacilityFulfillmentArrangementInstanceReference
  **/

  public String getCreditFacilityFulfillmentArrangementInstanceReference() {
    return creditFacilityFulfillmentArrangementInstanceReference;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReference(String creditFacilityFulfillmentArrangementInstanceReference) {
    this.creditFacilityFulfillmentArrangementInstanceReference = creditFacilityFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Restructuring instance 
   * @return restructuringInstanceReference
  **/

  public String getRestructuringInstanceReference() {
    return restructuringInstanceReference;
  }

  public void setRestructuringInstanceReference(String restructuringInstanceReference) {
    this.restructuringInstanceReference = restructuringInstanceReference;
  }


  /**
   * Get restructuringInstanceRecord
   * @return restructuringInstanceRecord
  **/

  public BQRestructuringInitiateInputModelRestructuringInstanceRecord getRestructuringInstanceRecord() {
    return restructuringInstanceRecord;
  }

  public void setRestructuringInstanceRecord(BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord) {
    this.restructuringInstanceRecord = restructuringInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return restructuringRequestActionTaskRecord
  **/

  public Object getRestructuringRequestActionTaskRecord() {
    return restructuringRequestActionTaskRecord;
  }

  public void setRestructuringRequestActionTaskRecord(Object restructuringRequestActionTaskRecord) {
    this.restructuringRequestActionTaskRecord = restructuringRequestActionTaskRecord;
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

