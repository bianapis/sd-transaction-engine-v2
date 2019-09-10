package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis
 */
public class CRTransactionScheduleFulfillmentArrangementRetrieveInputModelTransactionScheduleFulfillmentArrangementInstanceAnalysis   {
  private String transactionScheduleFulfillmentArrangementInstanceAnalysisReference = null;

  private String transactionScheduleFulfillmentArrangementInstanceAnalysisReportType = null;

  private String transactionScheduleFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceAnalysisReference() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysisReference(String transactionScheduleFulfillmentArrangementInstanceAnalysisReference) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysisReference = transactionScheduleFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return transactionScheduleFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getTransactionScheduleFulfillmentArrangementInstanceAnalysisParameters() {
    return transactionScheduleFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setTransactionScheduleFulfillmentArrangementInstanceAnalysisParameters(String transactionScheduleFulfillmentArrangementInstanceAnalysisParameters) {
    this.transactionScheduleFulfillmentArrangementInstanceAnalysisParameters = transactionScheduleFulfillmentArrangementInstanceAnalysisParameters;
  }


}

