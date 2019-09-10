package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFinancialTransaction;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementUpdateInputModel
 */
public class CRTransactionScheduleFulfillmentArrangementUpdateInputModel   {
  private String transactionEngineServicingSessionReference = null;

  private String transactionScheduleFulfillmentArrangementInstanceReference = null;

  private CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;

  private Object transactionScheduleFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get transactionScheduleFulfillmentArrangementInstanceRecord
   * @return transactionScheduleFulfillmentArrangementInstanceRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord getTransactionScheduleFulfillmentArrangementInstanceRecord() {
    return transactionScheduleFulfillmentArrangementInstanceRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceRecord(CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceRecord = transactionScheduleFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get transactionScheduleFinancialTransaction
   * @return transactionScheduleFinancialTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFinancialTransaction getTransactionScheduleFinancialTransaction() {
    return transactionScheduleFinancialTransaction;
  }

  public void setTransactionScheduleFinancialTransaction(CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction) {
    this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementUpdateActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementUpdateActionTaskRecord(Object transactionScheduleFulfillmentArrangementUpdateActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementUpdateActionTaskRecord = transactionScheduleFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

