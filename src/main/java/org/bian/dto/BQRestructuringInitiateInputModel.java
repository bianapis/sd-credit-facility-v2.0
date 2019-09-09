package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQRestructuringInitiateInputModelRestructuringInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringInitiateInputModel
 */
public class BQRestructuringInitiateInputModel   {
  private BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord = null;

  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private Object restructuringInitiateActionRecord = null;

  private BQRestructuringInitiateInputModelRestructuringInstanceRecord restructuringInstanceRecord = null;


  /**
   * Get creditFacilityFulfillmentArrangementInstanceRecord
   * @return creditFacilityFulfillmentArrangementInstanceRecord
  **/

  public BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord getCreditFacilityFulfillmentArrangementInstanceRecord() {
    return creditFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceRecord(BQRestructuringInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord) {
    this.creditFacilityFulfillmentArrangementInstanceRecord = creditFacilityFulfillmentArrangementInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return restructuringInitiateActionRecord
  **/

  public Object getRestructuringInitiateActionRecord() {
    return restructuringInitiateActionRecord;
  }

  public void setRestructuringInitiateActionRecord(Object restructuringInitiateActionRecord) {
    this.restructuringInitiateActionRecord = restructuringInitiateActionRecord;
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


}

