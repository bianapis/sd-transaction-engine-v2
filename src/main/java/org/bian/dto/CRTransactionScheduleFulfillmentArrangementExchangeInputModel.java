package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementExchangeInputModelTransactionScheduleFulfillmentArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementExchangeInputModel
 */
public class CRTransactionScheduleFulfillmentArrangementExchangeInputModel   {
  private String transactionEngineServicingSessionReference = null;

  private String transactionScheduleFulfillmentArrangementInstanceReference = null;

  private Object transactionScheduleFulfillmentArrangementExchangeActionTaskRecord = null;

  private CRTransactionScheduleFulfillmentArrangementExchangeInputModelTransactionScheduleFulfillmentArrangementExchangeActionRequest transactionScheduleFulfillmentArrangementExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return transactionEngineServicingSessionReference
  **/

  public String getTransactionEngineServicingSessionReference() {
    return transactionEngineServicingSessionReference;
  }

  public void setTransactionEngineServicingSessionReference(String transactionEngineServicingSessionReference) {
    this.transactionEngineServicingSessionReference = transactionEngineServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Transaction Schedule Fulfillment Arrangement instance 
   * @return transactionScheduleFulfillmentArrangementInstanceReference
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReference() {
    return transactionScheduleFulfillmentArrangementInstanceReference;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReference(String transactionScheduleFulfillmentArrangementInstanceReference) {
    this.transactionScheduleFulfillmentArrangementInstanceReference = transactionScheduleFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementExchangeActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementExchangeActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementExchangeActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementExchangeActionTaskRecord(Object transactionScheduleFulfillmentArrangementExchangeActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementExchangeActionTaskRecord = transactionScheduleFulfillmentArrangementExchangeActionTaskRecord;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementExchangeActionRequest
   * @return transactionScheduleFulfillmentArrangementExchangeActionRequest
  **/

  public CRTransactionScheduleFulfillmentArrangementExchangeInputModelTransactionScheduleFulfillmentArrangementExchangeActionRequest getTransactionScheduleFulfillmentArrangementExchangeActionRequest() {
    return transactionScheduleFulfillmentArrangementExchangeActionRequest;
  }

  public void setTransactionScheduleFulfillmentArrangementExchangeActionRequest(CRTransactionScheduleFulfillmentArrangementExchangeInputModelTransactionScheduleFulfillmentArrangementExchangeActionRequest transactionScheduleFulfillmentArrangementExchangeActionRequest) {
    this.transactionScheduleFulfillmentArrangementExchangeActionRequest = transactionScheduleFulfillmentArrangementExchangeActionRequest;
  }


}

