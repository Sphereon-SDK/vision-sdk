/**
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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKVision/ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.Vision) {
      root.Vision = {};
    }
    root.Vision.VisionSettings = factory(root.Vision.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The VisionSettings model module.
   * @module SphereonSDKVision/model/VisionSettings
   * @version 0.1
   */

  /**
   * Constructs a new <code>VisionSettings</code>.
   * Vision settings
   * @alias module:SphereonSDKVision/model/VisionSettings
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>VisionSettings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKVision/model/VisionSettings} obj Optional instance to populate.
   * @return {module:SphereonSDKVision/model/VisionSettings} The populated <code>VisionSettings</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('storageProvider')) {
        obj['storageProvider'] = ApiClient.convertToType(data['storageProvider'], 'String');
      }
      if (data.hasOwnProperty('vendor')) {
        obj['vendor'] = ApiClient.convertToType(data['vendor'], 'String');
      }
      if (data.hasOwnProperty('detectionTypes')) {
        obj['detectionTypes'] = ApiClient.convertToType(data['detectionTypes'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {module:SphereonSDKVision/model/VisionSettings.StorageProviderEnum} storageProvider
   */
  exports.prototype['storageProvider'] = undefined;
  /**
   * @member {module:SphereonSDKVision/model/VisionSettings.VendorEnum} vendor
   */
  exports.prototype['vendor'] = undefined;
  /**
   * @member {Array.<module:SphereonSDKVision/model/VisionSettings.DetectionTypesEnum>} detectionTypes
   */
  exports.prototype['detectionTypes'] = undefined;


  /**
   * Allowed values for the <code>storageProvider</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StorageProviderEnum = {
    /**
     * value: "API_SUPPLIER"
     * @const
     */
    "SUPPLIER": "API_SUPPLIER"  };

  /**
   * Allowed values for the <code>vendor</code> property.
   * @enum {String}
   * @readonly
   */
  exports.VendorEnum = {
    /**
     * value: "GOOGLE_VISION"
     * @const
     */
    "GOOGLE_VISION": "GOOGLE_VISION",
    /**
     * value: "MS_AZURE_VISION"
     * @const
     */
    "MS_AZURE_VISION": "MS_AZURE_VISION",
    /**
     * value: "CLARIFAI"
     * @const
     */
    "CLARIFAI": "CLARIFAI"  };

  /**
   * Allowed values for the <code>detectionTypes</code> property.
   * @enum {String}
   * @readonly
   */
  exports.DetectionTypesEnum = {
    /**
     * value: "LABEL"
     * @const
     */
    "LABEL": "LABEL",
    /**
     * value: "TEXT"
     * @const
     */
    "TEXT": "TEXT",
    /**
     * value: "FACIAL"
     * @const
     */
    "FACIAL": "FACIAL",
    /**
     * value: "LOGO"
     * @const
     */
    "LOGO": "LOGO"  };


  return exports;
}));


