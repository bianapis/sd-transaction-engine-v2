package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFinancialTransaction;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveOutputModel
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveOutputModel   {
  private CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord = null;

  private CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction = null;

  private String transactionScheduleFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String transactionScheduleFulfillmentArrangementRetrieveActionResponse = null;

  private CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord transactionScheduleFulfillmentArrangementInstanceReportRecord = null;

  private CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis transactionScheduleFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceRecord
   * @return transactionScheduleFulfillmentArrangementInstanceRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord getTransactionScheduleFulfillmentArrangementInstanceRecord() {
    return transactionScheduleFulfillmentArrangementInstanceRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceRecord(CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord transactionScheduleFulfillmentArrangementInstanceRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceRecord = transactionScheduleFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get transactionScheduleFinancialTransaction
   * @return transactionScheduleFinancialTransaction
  **/

  public CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFinancialTransaction getTransactionScheduleFinancialTransaction() {
    return transactionScheduleFinancialTransaction;
  }

  public void setTransactionScheduleFinancialTransaction(CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFinancialTransaction transactionScheduleFinancialTransaction) {
    this.transactionScheduleFinancialTransaction = transactionScheduleFinancialTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Transaction Schedule Fulfillment Arrangement instance retrieve service call 
   * @return transactionScheduleFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getTransactionScheduleFulfillmentArrangementRetrieveActionTaskReference() {
    return transactionScheduleFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setTransactionScheduleFulfillmentArrangementRetrieveActionTaskReference(String transactionScheduleFulfillmentArrangementRetrieveActionTaskReference) {
    this.transactionScheduleFulfillmentArrangementRetrieveActionTaskReference = transactionScheduleFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getTransactionScheduleFulfillmentArrangementRetrieveActionTaskRecord() {
    return transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementRetrieveActionTaskRecord(Object transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord) {
    this.transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord = transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return transactionScheduleFulfillmentArrangementRetrieveActionResponse
  **/

  public String getTransactionScheduleFulfillmentArrangementRetrieveActionResponse() {
    return transactionScheduleFulfillmentArrangementRetrieveActionResponse;
  }

  public void setTransactionScheduleFulfillmentArrangementRetrieveActionResponse(String transactionScheduleFulfillmentArrangementRetrieveActionResponse) {
    this.transactionScheduleFulfillmentArrangementRetrieveActionResponse = transactionScheduleFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceReportRecord
   * @return transactionScheduleFulfillmentArrangementInstanceReportRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord getTransactionScheduleFulfillmentArrangementInstanceReportRecord() {
    return transactionScheduleFulfillmentArrangementInstanceReportRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportRecord(CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord transactionScheduleFulfillmentArrangementInstanceReportRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceReportRecord = transactionScheduleFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceAnalysis
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysis
  **/

  public CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis getTransactionScheduleFulfillmentArrangementInstanceAnalysis() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysis;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysis(CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis transactionScheduleFulfillmentArrangementInstanceAnalysis) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysis = transactionScheduleFulfillmentArrangementInstanceAnalysis;
  }


}

