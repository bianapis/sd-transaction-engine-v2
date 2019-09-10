package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord
 */
public class CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String productServiceType = null;

  private String transactionScheduleFulfillmentSchedule = null;

  private CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord transactionScheduleWorkTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product instance for which the transaction processing is being handled 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of product or service that is being supported (e.g. mortgage, term loan) 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The processing schedule, covering reporting and financial transactions that are to be executed 
   * @return transactionScheduleFulfillmentSchedule
  **/

  public String getTransactionScheduleFulfillmentSchedule() {
    return transactionScheduleFulfillmentSchedule;
  }

  public void setTransactionScheduleFulfillmentSchedule(String transactionScheduleFulfillmentSchedule) {
    this.transactionScheduleFulfillmentSchedule = transactionScheduleFulfillmentSchedule;
  }


  /**
   * Get transactionScheduleWorkTaskRecord
   * @return transactionScheduleWorkTaskRecord
  **/

  public CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord getTransactionScheduleWorkTaskRecord() {
    return transactionScheduleWorkTaskRecord;
  }

  public void setTransactionScheduleWorkTaskRecord(CRTransactionScheduleFulfillmentArrangementExecuteOutputModelTransactionScheduleFulfillmentArrangementInstanceRecordTransactionScheduleWorkTaskRecord transactionScheduleWorkTaskRecord) {
    this.transactionScheduleWorkTaskRecord = transactionScheduleWorkTaskRecord;
  }


}

