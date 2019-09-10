package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFinancialTransaction;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementExecuteOutputModel
 */
public class CRTransactionScheduleFulfillmentArrangementExecuteOutputModel   {
  private CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;

  private String transactionScheduleFulfillmentArrangementExecuteActionTaskReference = null;

  private Object transactionScheduleFulfillmentArrangementExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceRecord
   * @return transactionScheduleFulfillmentArrangementInstanceRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord getTransactionScheduleFulfillmentArrangementInstanceRecord() {
    return transactionScheduleFulfillmentArrangementInstanceRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceRecord(CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceRecord = transactionScheduleFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get transactionScheduleFinancialTransaction
   * @return transactionScheduleFinancialTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFinancialTransaction getTransactionScheduleFinancialTransaction() {
    return transactionScheduleFinancialTransaction;
  }

  public void setTransactionScheduleFinancialTransaction(CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction) {
    this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Schedule Fulfillment Arrangement instance execute service call 
   * @return transactionScheduleFulfillmentArrangementExecuteActionTaskReference
  **/

  public String getTransactionScheduleFulfillmentArrangementExecuteActionTaskReference() {
    return transactionScheduleFulfillmentArrangementExecuteActionTaskReference;
  }

  public void setTransactionScheduleFulfillmentArrangementExecuteActionTaskReference(String transactionScheduleFulfillmentArrangementExecuteActionTaskReference) {
    this.transactionScheduleFulfillmentArrangementExecuteActionTaskReference = transactionScheduleFulfillmentArrangementExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementExecuteActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementExecuteActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementExecuteActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementExecuteActionTaskRecord(Object transactionScheduleFulfillmentArrangementExecuteActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementExecuteActionTaskRecord = transactionScheduleFulfillmentArrangementExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

