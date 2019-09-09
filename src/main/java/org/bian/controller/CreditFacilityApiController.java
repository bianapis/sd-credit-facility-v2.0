/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CreditFacilityApiController {

	@Autowired
	CreditFacilityApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDCreditFacilityActivateOutputModel> activate(@RequestBody BianRequest<SDCreditFacilityActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDCreditFacilityConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCreditFacilityConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRCreditFacilityFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditFacilityFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructuring")
	@Fulfill.Exchange
	public BianResponse<BQRestructuringExchangeOutputModel> exchangeRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRestructuringExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeRestructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("repayment")
	@Fulfill.Execute
	public BianResponse<BQRepaymentExecuteOutputModel> executeRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepaymentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeRepayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Execute
	public BianResponse<BQServiceFeesExecuteOutputModel> executeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDCreditFacilityFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCreditFacilityFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Grant
	public BianResponse<CRCreditFacilityFulfillmentArrangementGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditFacilityFulfillmentArrangementGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRCreditFacilityFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCreditFacilityFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructuring")
	@Fulfill.Initiate
	public BianResponse<BQRestructuringInitiateOutputModel> initiateRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQRestructuringInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateRestructuring(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Fulfill.Request
	public BianResponse<BQMaintenanceRequestOutputModel> requestMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("repayment")
	@Fulfill.Request
	public BianResponse<BQRepaymentRequestOutputModel> requestRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepaymentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestRepayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructuring")
	@Fulfill.Request
	public BianResponse<BQRestructuringRequestOutputModel> requestRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRestructuringRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestRestructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRCreditFacilityFulfillmentArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditFacilityFulfillmentArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRCreditFacilityFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("interest")
	@Fulfill.Retrieve
	public BianResponse<BQInterestRetrieveOutputModel> retrieveInterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterest(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenance")
	@Fulfill.Retrieve
	public BianResponse<BQMaintenanceRetrieveOutputModel> retrieveMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("repayment")
	@Fulfill.Retrieve
	public BianResponse<BQRepaymentRetrieveOutputModel> retrieveRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRepayment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("restructuring")
	@Fulfill.Retrieve
	public BianResponse<BQRestructuringRetrieveOutputModel> retrieveRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRestructuring(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicefees")
	@Fulfill.Retrieve
	public BianResponse<BQServiceFeesRetrieveOutputModel> retrieveServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicefees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDCreditFacilityRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRCreditFacilityFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCreditFacilityFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("repayment")
	@Fulfill.Update
	public BianResponse<BQRepaymentUpdateOutputModel> updateRepayment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRepaymentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRepayment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("restructuring")
	@Fulfill.Update
	public BianResponse<BQRestructuringUpdateOutputModel> updateRestructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRestructuringUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRestructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
