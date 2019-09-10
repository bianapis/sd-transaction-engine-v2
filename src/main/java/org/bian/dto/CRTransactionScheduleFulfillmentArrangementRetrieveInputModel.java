package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveInputModel
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveInputModel   {
  private Object transactionScheduleFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String transactionScheduleFulfillmentArrangementRetrieveActionRequest = null;

  private CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord transactionScheduleFulfillmentArrangementInstanceReportRecord = null;

  private CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis transactionScheduleFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return transactionScheduleFulfillmentArrangementRetrieveActionRequest
  **/

  public String getTransactionScheduleFulfillmentArrangementRetrieveActionRequest() {
    return transactionScheduleFulfillmentArrangementRetrieveActionRequest;
  }

  public void setTransactionScheduleFulfillmentArrangementRetrieveActionRequest(String transactionScheduleFulfillmentArrangementRetrieveActionRequest) {
    this.transactionScheduleFulfillmentArrangementRetrieveActionRequest = transactionScheduleFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceReportRecord
   * @return transactionScheduleFulfillmentArrangementInstanceReportRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord getTransactionScheduleFulfillmentArrangementInstanceReportRecord() {
    return transactionScheduleFulfillmentArrangementInstanceReportRecord;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportRecord(CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord transactionScheduleFulfillmentArrangementInstanceReportRecord) {
    this.transactionScheduleFulfillmentArrangementInstanceReportRecord = transactionScheduleFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get transactionScheduleFulfillmentArrangementInstanceAnalysis
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysis
  **/

  public CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis getTransactionScheduleFulfillmentArrangementInstanceAnalysis() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysis;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysis(CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis transactionScheduleFulfillmentArrangementInstanceAnalysis) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysis = transactionScheduleFulfillmentArrangementInstanceAnalysis;
  }


}

