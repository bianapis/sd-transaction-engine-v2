package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementInitiateInputModel
 */
public class CRTransactionScheduleFulfillmentArrangementInitiateInputModel   {
  private String transactionEngineServicingSessionReference = null;

  private Object transactionScheduleFulfillmentArrangementInitiateActionRecord = null;

  private String transactionScheduleFulfillmentArrangementInstanceStatus = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return transactionScheduleFulfillmentArrangementInitiateActionRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementInitiateActionRecord() {
    return transactionScheduleFulfillmentArrangementInitiateActionRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInitiateActionRecord(Object transactionScheduleFulfillmentArrangementInitiateActionRecord) {
    this.transactionScheduleFulfillmentArrangementInitiateActionRecord = transactionScheduleFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Transaction Schedule Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return transactionScheduleFulfillmentArrangementInstanceStatus
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceStatus() {
    return transactionScheduleFulfillmentArrangementInstanceStatus;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceStatus(String transactionScheduleFulfillmentArrangementInstanceStatus) {
    this.transactionScheduleFulfillmentArrangementInstanceStatus = transactionScheduleFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceRecord
   * @return transactionScheduleFulfillmentArrangementInstanceRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord getTransactionScheduleFulfillmentArrangementInstanceRecord() {
    return transactionScheduleFulfillmentArrangementInstanceRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceRecord(CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceRecord = transactionScheduleFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get transactionScheduleFinancialTransaction
   * @return transactionScheduleFinancialTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction getTransactionScheduleFinancialTransaction() {
    return transactionScheduleFinancialTransaction;
  }

  public void setTransactionScheduleFinancialTransaction(CRTransactionScheduleFulfillmentArrangementInitiateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction) {
    this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
  }


}

