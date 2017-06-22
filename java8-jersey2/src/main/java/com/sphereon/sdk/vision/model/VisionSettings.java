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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Vision settings
 */
@ApiModel(description = "Vision settings")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-23T00:44:52.436+02:00")
public class VisionSettings {
  /**
   * Gets or Sets storageProvider
   */
  public enum StorageProviderEnum {
    SUPPLIER("API_SUPPLIER");

    private String value;

    StorageProviderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StorageProviderEnum fromValue(String text) {
      for (StorageProviderEnum b : StorageProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("storageProvider")
  private StorageProviderEnum storageProvider = null;

  /**
   * Gets or Sets vendor
   */
  public enum VendorEnum {
    GOOGLE("google"),
    
    MICROSOFT("microsoft"),
    
    CLARIFAI("clarifai");

    private String value;

    VendorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VendorEnum fromValue(String text) {
      for (VendorEnum b : VendorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("vendor")
  private VendorEnum vendor = null;

  /**
   * Gets or Sets detectionTypes
   */
  public enum DetectionTypesEnum {
    LABEL("LABEL"),
    
    TEXT("TEXT"),
    
    FACIAL("FACIAL"),
    
    LOGO("LOGO");

    private String value;

    DetectionTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DetectionTypesEnum fromValue(String text) {
      for (DetectionTypesEnum b : DetectionTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("detectionTypes")
  private List<DetectionTypesEnum> detectionTypes = new ArrayList<DetectionTypesEnum>();

  public VisionSettings storageProvider(StorageProviderEnum storageProvider) {
    this.storageProvider = storageProvider;
    return this;
  }

   /**
   * Get storageProvider
   * @return storageProvider
  **/
  @ApiModelProperty(example = "null", value = "")
  public StorageProviderEnum getStorageProvider() {
    return storageProvider;
  }

  public void setStorageProvider(StorageProviderEnum storageProvider) {
    this.storageProvider = storageProvider;
  }

  public VisionSettings vendor(VendorEnum vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Get vendor
   * @return vendor
  **/
  @ApiModelProperty(example = "null", value = "")
  public VendorEnum getVendor() {
    return vendor;
  }

  public void setVendor(VendorEnum vendor) {
    this.vendor = vendor;
  }

  public VisionSettings detectionTypes(List<DetectionTypesEnum> detectionTypes) {
    this.detectionTypes = detectionTypes;
    return this;
  }

  public VisionSettings addDetectionTypesItem(DetectionTypesEnum detectionTypesItem) {
    this.detectionTypes.add(detectionTypesItem);
    return this;
  }

   /**
   * Get detectionTypes
   * @return detectionTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DetectionTypesEnum> getDetectionTypes() {
    return detectionTypes;
  }

  public void setDetectionTypes(List<DetectionTypesEnum> detectionTypes) {
    this.detectionTypes = detectionTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisionSettings visionSettings = (VisionSettings) o;
    return Objects.equals(this.storageProvider, visionSettings.storageProvider) &&
        Objects.equals(this.vendor, visionSettings.vendor) &&
        Objects.equals(this.detectionTypes, visionSettings.detectionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageProvider, vendor, detectionTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisionSettings {\n");
    
    sb.append("    storageProvider: ").append(toIndentedString(storageProvider)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    detectionTypes: ").append(toIndentedString(detectionTypes)).append("\n");
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

