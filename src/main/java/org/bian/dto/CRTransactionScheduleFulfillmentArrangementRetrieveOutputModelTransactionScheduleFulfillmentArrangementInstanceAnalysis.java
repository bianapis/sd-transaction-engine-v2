package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveOutputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis   {
  private String transactionScheduleFulfillmentArrangementInstanceAnalysisData = null;

  private String transactionScheduleFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object transactionScheduleFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysisData
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceAnalysisData() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysisData;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysisData(String transactionScheduleFulfillmentArrangementInstanceAnalysisData) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysisData = transactionScheduleFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceAnalysisReportType() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysisReportType(String transactionScheduleFulfillmentArrangementInstanceAnalysisReportType) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysisReportType = transactionScheduleFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getTransactionScheduleFulfillmentArrangementInstanceAnalysisReport() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysisReport(Object transactionScheduleFulfillmentArrangementInstanceAnalysisReport) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysisReport = transactionScheduleFulfillmentArrangementInstanceAnalysisReport;
  }


}

