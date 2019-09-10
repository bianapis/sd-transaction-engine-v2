/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface TransactionEngineApiService {

	SDTransactionEngineActivateOutputModel activate(SDTransactionEngineActivateInputModel request);
	
	SDTransactionEngineConfigureOutputModel configure(String sdReferenceId, SDTransactionEngineConfigureInputModel request);
	
	CRTransactionScheduleFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementControlInputModel request);
	
	CRTransactionScheduleFulfillmentArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementExchangeInputModel request);
	
	CRTransactionScheduleFulfillmentArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementExecuteInputModel request);
	
	SDTransactionEngineFeedbackOutputModel feedback(String sdReferenceId, SDTransactionEngineFeedbackInputModel request);
	
	CRTransactionScheduleFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRTransactionScheduleFulfillmentArrangementInitiateInputModel request);
	
	SDTransactionEngineRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRTransactionScheduleFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRTransactionScheduleFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementUpdateInputModel request);
	
}
