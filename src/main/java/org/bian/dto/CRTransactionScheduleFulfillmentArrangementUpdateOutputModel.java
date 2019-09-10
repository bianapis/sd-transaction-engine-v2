package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFinancialTransaction;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementUpdateOutputModel
 */
public class CRTransactionScheduleFulfillmentArrangementUpdateOutputModel   {
  private CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementUpdateInputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;

  private String transactionScheduleFulfillmentArrangementUpdateActionTaskReference = null;

  private Object transactionScheduleFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return transactionScheduleFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getTransactionScheduleFulfillmentArrangementUpdateActionTaskReference() {
    return transactionScheduleFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setTransactionScheduleFulfillmentArrangementUpdateActionTaskReference(String transactionScheduleFulfillmentArrangementUpdateActionTaskReference) {
    this.transactionScheduleFulfillmentArrangementUpdateActionTaskReference = transactionScheduleFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

