package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdownDrawdownRecord
 */
public class CRCreditFacilityFulfillmentArrangementInitiateInputModelCreditFacilityFulfillmentArrangementInstanceRecordCreditFacilityUnderlyingDrawdownDrawdownRecord   {
  private String drawdownLoanTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The underlying loan transaction details 
   * @return drawdownLoanTransaction
  **/

  public String getDrawdownLoanTransaction() {
    return drawdownLoanTransaction;
  }

  public void setDrawdownLoanTransaction(String drawdownLoanTransaction) {
    this.drawdownLoanTransaction = drawdownLoanTransaction;
  }


}

