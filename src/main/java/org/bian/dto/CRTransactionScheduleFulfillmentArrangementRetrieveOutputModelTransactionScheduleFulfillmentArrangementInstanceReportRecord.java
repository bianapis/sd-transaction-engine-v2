package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceReportRecord   {
  private String transactionScheduleFulfillmentArrangementInstanceReportData = null;

  private String transactionScheduleFulfillmentArrangementInstanceReportType = null;

  private Object transactionScheduleFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return transactionScheduleFulfillmentArrangementInstanceReportData
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReportData() {
    return transactionScheduleFulfillmentArrangementInstanceReportData;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportData(String transactionScheduleFulfillmentArrangementInstanceReportData) {
    this.transactionScheduleFulfillmentArrangementInstanceReportData = transactionScheduleFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return transactionScheduleFulfillmentArrangementInstanceReportType
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceReportType() {
    return transactionScheduleFulfillmentArrangementInstanceReportType;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReportType(String transactionScheduleFulfillmentArrangementInstanceReportType) {
    this.transactionScheduleFulfillmentArrangementInstanceReportType = transactionScheduleFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return transactionScheduleFulfillmentArrangementInstanceReport
  **/

  public Object getTransactionScheduleFulfillmentArrangementInstanceReport() {
    return transactionScheduleFulfillmentArrangementInstanceReport;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceReport(Object transactionScheduleFulfillmentArrangementInstanceReport) {
    this.transactionScheduleFulfillmentArrangementInstanceReport = transactionScheduleFulfillmentArrangementInstanceReport;
  }


}

