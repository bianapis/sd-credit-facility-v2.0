package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceRequestInputModelMaintenanceInstanceRecord;
import org.bian.dto.CRCreditFacilityFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQMaintenanceRequestInputModel
 */
public class BQMaintenanceRequestInputModel   {
  private String creditFacilityFulfillmentArrangementInstanceReference = null;

  private String maintenanceInstanceReference = null;

  private BQMaintenanceRequestInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;

  private Object maintenanceRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance instance 
   * @return maintenanceInstanceReference
  **/

  public String getMaintenanceInstanceReference() {
    return maintenanceInstanceReference;
  }

  public void setMaintenanceInstanceReference(String maintenanceInstanceReference) {
    this.maintenanceInstanceReference = maintenanceInstanceReference;
  }


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceRequestInputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceRequestInputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return maintenanceRequestActionTaskRecord
  **/

  public Object getMaintenanceRequestActionTaskRecord() {
    return maintenanceRequestActionTaskRecord;
  }

  public void setMaintenanceRequestActionTaskRecord(Object maintenanceRequestActionTaskRecord) {
    this.maintenanceRequestActionTaskRecord = maintenanceRequestActionTaskRecord;
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

