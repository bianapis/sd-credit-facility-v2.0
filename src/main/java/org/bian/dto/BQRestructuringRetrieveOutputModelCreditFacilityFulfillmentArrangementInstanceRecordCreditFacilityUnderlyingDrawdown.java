package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdownDrawdownRecord;

import javax.validation.Valid;
  
/**
 * BQRestructuringRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown
 */
public class BQRestructuringRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdown   {
  private String drawdownReference = null;

  private CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdownDrawdownRecord drawdownRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the underlying loan 
   * @return drawdownReference
  **/

  public String getDrawdownReference() {
    return drawdownReference;
  }

  public void setDrawdownReference(String drawdownReference) {
    this.drawdownReference = drawdownReference;
  }


  /**
   * Get drawdownRecord
   * @return drawdownRecord
  **/

  public CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdownDrawdownRecord getDrawdownRecord() {
    return drawdownRecord;
  }

  public void setDrawdownRecord(CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdownDrawdownRecord drawdownRecord) {
    this.drawdownRecord = drawdownRecord;
  }


}

