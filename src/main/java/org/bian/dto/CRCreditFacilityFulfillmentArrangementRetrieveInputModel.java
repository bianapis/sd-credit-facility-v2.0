package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementRetrieveInputModel
 */
public class CRCreditFacilityFulfillmentArrangementRetrieveInputModel   {
  private Object creditFacilityFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String creditFacilityFulfillmentArrangementRetrieveActionRequest = null;

  private CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceReportRecord creditFacilityFulfillmentArrangementInstanceReportRecord = null;

  private CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceAnalysis creditFacilityFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditFacilityFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCreditFacilityFulfillmentArrangementRetrieveActionRequest() {
    return creditFacilityFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCreditFacilityFulfillmentArrangementRetrieveActionRequest(String creditFacilityFulfillmentArrangementRetrieveActionRequest) {
    this.creditFacilityFulfillmentArrangementRetrieveActionRequest = creditFacilityFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get creditFacilityFulfillmentArrangementInstanceReportRecord
   * @return creditFacilityFulfillmentArrangementInstanceReportRecord
  **/

  public CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceReportRecord getCreditFacilityFulfillmentArrangementInstanceReportRecord() {
    return creditFacilityFulfillmentArrangementInstanceReportRecord;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceReportRecord(CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceReportRecord creditFacilityFulfillmentArrangementInstanceReportRecord) {
    this.creditFacilityFulfillmentArrangementInstanceReportRecord = creditFacilityFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get creditFacilityFulfillmentArrangementInstanceAnalysis
   * @return creditFacilityFulfillmentArrangementInstanceAnalysis
  **/

  public CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceAnalysis getCreditFacilityFulfillmentArrangementInstanceAnalysis() {
    return creditFacilityFulfillmentArrangementInstanceAnalysis;
  }

  public void setCreditFacilityFulfillmentArrangementInstanceAnalysis(CRCreditFacilityFulfillmentArrangementRetrieveInputModelCreditFacilityFulfillmentArrangementInstanceAnalysis creditFacilityFulfillmentArrangementInstanceAnalysis) {
    this.creditFacilityFulfillmentArrangementInstanceAnalysis = creditFacilityFulfillmentArrangementInstanceAnalysis;
  }


}

