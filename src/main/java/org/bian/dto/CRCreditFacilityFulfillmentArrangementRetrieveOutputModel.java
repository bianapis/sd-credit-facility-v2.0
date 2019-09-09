package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRetrieveOutputModel
 */
public class CRCreditFacilityFulfillmentArrangementRetrieveOutputModel   {
  private CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord = null;

  private String creditFacilityFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object creditFacilityFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String creditFacilityFulfillmentArrangementRetrieveActionResponse = null;

  private CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceReportRecord creditFacilityFulfillmentArrangementInstanceReportRecord = null;

  private CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceAnalysis creditFacilityFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get creditFacilityFulfillmentArrangementInstanceRecord
   * @return creditFacilityFulfillmentArrangementInstanceRecord
  **/

  public CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord getCreditFacilityFulfillmentArrangementInstanceRecord() {
    return creditFacilityFulfillmentArrangementInstanceRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceRecord(CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceRecord creditFacilityFulfillmentArrangementInstanceRecord) {
    this.creditFacilityFulfillmentArrangementInstanceRecord = creditFacilityFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Facility Fulfillment Arrangement instance retrieve service call 
   * @return creditFacilityFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCreditFacilityFulfillmentArrangementRetrieveActionTaskReference() {
    return creditFacilityFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCreditFacilityFulfillmentArrangementRetrieveActionTaskReference(String creditFacilityFulfillmentArrangementRetrieveActionTaskReference) {
    this.creditFacilityFulfillmentArrangementRetrieveActionTaskReference = creditFacilityFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditFacilityFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCreditFacilityFulfillmentArrangementRetrieveActionTaskRecord() {
    return creditFacilityFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCreditFacilityFulfillmentArrangementRetrieveActionTaskRecord(Object creditFacilityFulfillmentArrangementRetrieveActionTaskRecord) {
    this.creditFacilityFulfillmentArrangementRetrieveActionTaskRecord = creditFacilityFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditFacilityFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCreditFacilityFulfillmentArrangementRetrieveActionResponse() {
    return creditFacilityFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCreditFacilityFulfillmentArrangementRetrieveActionResponse(String creditFacilityFulfillmentArrangementRetrieveActionResponse) {
    this.creditFacilityFulfillmentArrangementRetrieveActionResponse = creditFacilityFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get creditFacilityFulfillmentArrangementInstanceReportRecord
   * @return creditFacilityFulfillmentArrangementInstanceReportRecord
  **/

  public CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceReportRecord getCreditFacilityFulfillmentArrangementInstanceReportRecord() {
    return creditFacilityFulfillmentArrangementInstanceReportRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReportRecord(CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceReportRecord creditFacilityFulfillmentArrangementInstanceReportRecord) {
    this.creditFacilityFulfillmentArrangementInstanceReportRecord = creditFacilityFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get creditFacilityFulfillmentArrangementInstanceAnalysis
   * @return creditFacilityFulfillmentArrangementInstanceAnalysis
  **/

  public CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceAnalysis getCreditFacilityFulfillmentArrangementInstanceAnalysis() {
    return creditFacilityFulfillmentArrangementInstanceAnalysis;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysis(CRCreditFacilityFulfillmentArrangementRetrieveOutputModelCreditFacilityFulfillmentArrangementInstanceAnalysis creditFacilityFulfillmentArrangementInstanceAnalysis) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysis = creditFacilityFulfillmentArrangementInstanceAnalysis;
  }


}

