/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class TransactionEngineApiServiceImpl implements TransactionEngineApiService {

	public SDTransactionEngineActivateOutputModel activate(SDTransactionEngineActivateInputModel request){
		return JsonReader.read("activate-SDTransactionEngineActivateOutputModel.json",new TypeReference<SDTransactionEngineActivateOutputModel>(){});
	}
	
	public SDTransactionEngineConfigureOutputModel configure(String sdReferenceId, SDTransactionEngineConfigureInputModel request){
		return JsonReader.read("configure-SDTransactionEngineConfigureOutputModel.json",new TypeReference<SDTransactionEngineConfigureOutputModel>(){});
	}
	
	public CRTransactionScheduleFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRTransactionScheduleFulfillmentArrangementControlOutputModel.json",new TypeReference<CRTransactionScheduleFulfillmentArrangementControlOutputModel>(){});
	}
	
	public CRTransactionScheduleFulfillmentArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRTransactionScheduleFulfillmentArrangementExchangeOutputModel.json",new TypeReference<CRTransactionScheduleFulfillmentArrangementExchangeOutputModel>(){});
	}
	
	public CRTransactionScheduleFulfillmentArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRTransactionScheduleFulfillmentArrangementExecuteOutputModel.json",new TypeReference<CRTransactionScheduleFulfillmentArrangementExecuteOutputModel>(){});
	}
	
	public SDTransactionEngineFeedbackOutputModel feedback(String sdReferenceId, SDTransactionEngineFeedbackInputModel request){
		return JsonReader.read("feedback-SDTransactionEngineFeedbackOutputModel.json",new TypeReference<SDTransactionEngineFeedbackOutputModel>(){});
	}
	
	public CRTransactionScheduleFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRTransactionScheduleFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRTransactionScheduleFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRTransactionScheduleFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public SDTransactionEngineRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDTransactionEngineRetrieveOutputModel.json",new TypeReference<SDTransactionEngineRetrieveOutputModel>(){});
	}
	
	public CRTransactionScheduleFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRTransactionScheduleFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRTransactionScheduleFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRTransactionScheduleFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRTransactionScheduleFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRTransactionScheduleFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRTransactionScheduleFulfillmentArrangementUpdateOutputModel>(){});
	}
	
}
