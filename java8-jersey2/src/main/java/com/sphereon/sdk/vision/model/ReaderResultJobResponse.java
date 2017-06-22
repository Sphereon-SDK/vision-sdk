/*
 * Barcode
 * <b>The Barcode Reader API '/reader' reads barcodes from image files and returns the barcode data as JSON files.</b>    The flow is generally as follows:  1. First upload an image using the /reader POST endpoint. You will get back a job response that contains a job with its associated settings.  2. Start the job from a PUT request to the /reader/{jobid} endpoint, with the Job and Settings JSON as request body. The barcode detection will now start.  3. Check the job status from the /reader/{jobid} GET endpoint until the status has changed to DONE or ERROR. Messaging using a websocket will be available as an alternative in a future version  4. Retrieve the JSON file using the /reader/{jobid}/stream GET endpoint. This will return the JSON file only when the status is DONE. In other cases it will return the Job Response JSON (with http code 202 instead of 200)      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.vision.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.sphereon.sdk.vision.model.Barcode;
import com.sphereon.sdk.vision.model.ReaderEngineTask;
import com.sphereon.sdk.vision.model.ReaderJob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The Reader job response. Has access to the job, it&#39; s settings as well as engine tasks
 */
@ApiModel(description = "The Reader job response. Has access to the job, it' s settings as well as engine tasks")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-23T00:30:44.672+02:00")
public class ReaderResultJobResponse {
  @JsonProperty("completionTime")
  private OffsetDateTime completionTime = null;

  @JsonProperty("jobId")
  private String jobId = null;

  @JsonProperty("creationTime")
  private OffsetDateTime creationTime = null;

  @JsonProperty("inputs")
  private List<String> inputs = new ArrayList<String>();

  @JsonProperty("updateTime")
  private OffsetDateTime updateTime = null;

  @JsonProperty("barcodes")
  private List<Barcode> barcodes = new ArrayList<Barcode>();

  @JsonProperty("job")
  private ReaderJob job = null;

  @JsonProperty("statusMessage")
  private String statusMessage = null;

  @JsonProperty("tasks")
  private List<ReaderEngineTask> tasks = new ArrayList<ReaderEngineTask>();

  @JsonProperty("queueTime")
  private OffsetDateTime queueTime = null;

  /**
   * The status of the job
   */
  public enum StatusEnum {
    INPUTS_UPLOADED("INPUTS_UPLOADED"),
    
    PROCESSING("PROCESSING"),
    
    DONE("DONE"),
    
    ERROR("ERROR"),
    
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

   /**
   * The completion date/time of this job in ISO 8601 format
   * @return completionTime
  **/
  @ApiModelProperty(example = "null", value = "The completion date/time of this job in ISO 8601 format")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  public ReaderResultJobResponse jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

   /**
   * The creation date/time of this job in ISO 8601 format
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "The creation date/time of this job in ISO 8601 format")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public ReaderResultJobResponse inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ReaderResultJobResponse addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * The original input files. Currently supported inputs are: tif files
   * @return inputs
  **/
  @ApiModelProperty(example = "null", required = true, value = "The original input files. Currently supported inputs are: tif files")
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

   /**
   * The last update date/time of this job in ISO 8601 format
   * @return updateTime
  **/
  @ApiModelProperty(example = "null", value = "The last update date/time of this job in ISO 8601 format")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public ReaderResultJobResponse barcodes(List<Barcode> barcodes) {
    this.barcodes = barcodes;
    return this;
  }

  public ReaderResultJobResponse addBarcodesItem(Barcode barcodesItem) {
    this.barcodes.add(barcodesItem);
    return this;
  }

   /**
   * The returned barcodes
   * @return barcodes
  **/
  @ApiModelProperty(example = "null", required = true, value = "The returned barcodes")
  public List<Barcode> getBarcodes() {
    return barcodes;
  }

  public void setBarcodes(List<Barcode> barcodes) {
    this.barcodes = barcodes;
  }

  public ReaderResultJobResponse job(ReaderJob job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReaderJob getJob() {
    return job;
  }

  public void setJob(ReaderJob job) {
    this.job = job;
  }

   /**
   * A status message, which can be informational, warning or error. A message here does not indicate an error perse
   * @return statusMessage
  **/
  @ApiModelProperty(example = "null", value = "A status message, which can be informational, warning or error. A message here does not indicate an error perse")
  public String getStatusMessage() {
    return statusMessage;
  }

  public ReaderResultJobResponse tasks(List<ReaderEngineTask> tasks) {
    this.tasks = tasks;
    return this;
  }

  public ReaderResultJobResponse addTasksItem(ReaderEngineTask tasksItem) {
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * The server supplied reader task(s)
   * @return tasks
  **/
  @ApiModelProperty(example = "null", value = "The server supplied reader task(s)")
  public List<ReaderEngineTask> getTasks() {
    return tasks;
  }

  public void setTasks(List<ReaderEngineTask> tasks) {
    this.tasks = tasks;
  }

   /**
   * The reader queue date/time of this job in ISO 8601 format
   * @return queueTime
  **/
  @ApiModelProperty(example = "null", value = "The reader queue date/time of this job in ISO 8601 format")
  public OffsetDateTime getQueueTime() {
    return queueTime;
  }

   /**
   * The status of the job
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  public StatusEnum getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderResultJobResponse readerResultJobResponse = (ReaderResultJobResponse) o;
    return Objects.equals(this.completionTime, readerResultJobResponse.completionTime) &&
        Objects.equals(this.jobId, readerResultJobResponse.jobId) &&
        Objects.equals(this.creationTime, readerResultJobResponse.creationTime) &&
        Objects.equals(this.inputs, readerResultJobResponse.inputs) &&
        Objects.equals(this.updateTime, readerResultJobResponse.updateTime) &&
        Objects.equals(this.barcodes, readerResultJobResponse.barcodes) &&
        Objects.equals(this.job, readerResultJobResponse.job) &&
        Objects.equals(this.statusMessage, readerResultJobResponse.statusMessage) &&
        Objects.equals(this.tasks, readerResultJobResponse.tasks) &&
        Objects.equals(this.queueTime, readerResultJobResponse.queueTime) &&
        Objects.equals(this.status, readerResultJobResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, jobId, creationTime, inputs, updateTime, barcodes, job, statusMessage, tasks, queueTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderResultJobResponse {\n");
    
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

