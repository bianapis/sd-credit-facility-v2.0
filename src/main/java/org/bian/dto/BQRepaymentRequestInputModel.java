package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRepaymentRequestInputModelRepaymentInstanceRecord;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQRepaymentRequestInputModel
 */
public class BQRepaymentRequestInputModel   {
  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private String repaymentInstanceReference = null;

  private BQRepaymentRequestInputModelRepaymentInstanceRecord repaymentInstanceRecord = null;

  private Object repaymentRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Repayment instance 
   * @return repaymentInstanceReference
  **/

  public String getRepaymentInstanceReference() {
    return repaymentInstanceReference;
  }

  public void setRepaymentInstanceReference(String repaymentInstanceReference) {
    this.repaymentInstanceReference = repaymentInstanceReference;
  }


  /**
   * Get repaymentInstanceRecord
   * @return repaymentInstanceRecord
  **/

  public BQRepaymentRequestInputModelRepaymentInstanceRecord getRepaymentInstanceRecord() {
    return repaymentInstanceRecord;
  }

  public void setRepaymentInstanceRecord(BQRepaymentRequestInputModelRepaymentInstanceRecord repaymentInstanceRecord) {
    this.repaymentInstanceRecord = repaymentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return repaymentRequestActionTaskRecord
  **/

  public Object getRepaymentRequestActionTaskRecord() {
    return repaymentRequestActionTaskRecord;
  }

  public void setRepaymentRequestActionTaskRecord(Object repaymentRequestActionTaskRecord) {
    this.repaymentRequestActionTaskRecord = repaymentRequestActionTaskRecord;
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

