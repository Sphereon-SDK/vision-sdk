/*
 * Vision
 * Sphereon Vision APIs
 *
 * OpenAPI spec version: 0.1
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
import com.google.gson.annotations.SerializedName;
import com.sphereon.sdk.vision.model.Tag;
import com.sphereon.sdk.vision.model.VisionJob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassificationResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-22T01:23:54.925+01:00")
public class ClassificationResponse {
  @SerializedName("tagList")
  private Map<String, List<Tag>> tagList = new HashMap<String, List<Tag>>();

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("job")
  private VisionJob job = null;

  @SerializedName("errors")
  private List<String> errors = new ArrayList<String>();

  public ClassificationResponse tagList(Map<String, List<Tag>> tagList) {
    this.tagList = tagList;
    return this;
  }

  public ClassificationResponse putTagListItem(String key, List<Tag> tagListItem) {
    this.tagList.put(key, tagListItem);
    return this;
  }

   /**
   * Get tagList
   * @return tagList
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, List<Tag>> getTagList() {
    return tagList;
  }

  public void setTagList(Map<String, List<Tag>> tagList) {
    this.tagList = tagList;
  }

  public ClassificationResponse jobId(String jobId) {
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

  public ClassificationResponse job(VisionJob job) {
    this.job = job;
    return this;
  }

   /**
   * The vision job
   * @return job
  **/
  @ApiModelProperty(example = "null", value = "The vision job")
  public VisionJob getJob() {
    return job;
  }

  public void setJob(VisionJob job) {
    this.job = job;
  }

  public ClassificationResponse errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public ClassificationResponse addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The errors that occurred
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "The errors that occurred")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationResponse classificationResponse = (ClassificationResponse) o;
    return Objects.equals(this.tagList, classificationResponse.tagList) &&
        Objects.equals(this.jobId, classificationResponse.jobId) &&
        Objects.equals(this.job, classificationResponse.job) &&
        Objects.equals(this.errors, classificationResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagList, jobId, job, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationResponse {\n");
    
    sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

