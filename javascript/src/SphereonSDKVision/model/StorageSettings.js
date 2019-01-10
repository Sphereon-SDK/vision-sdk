/**
 * Vision
 * Sphereon Vision APIs
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.3.1
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKVision/ApiClient', 'SphereonSDKVision/model/Credentials', 'SphereonSDKVision/model/Lifecycle'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Credentials'), require('./Lifecycle'));
  } else {
    // Browser globals (root is window)
    if (!root.Vision) {
      root.Vision = {};
    }
    root.Vision.StorageSettings = factory(root.Vision.ApiClient, root.Vision.Credentials, root.Vision.Lifecycle);
  }
}(this, function(ApiClient, Credentials, Lifecycle) {
  'use strict';




  /**
   * The StorageSettings model module.
   * @module SphereonSDKVision/model/StorageSettings
   * @version 0.2
   */

  /**
   * Constructs a new <code>StorageSettings</code>.
   * @alias module:SphereonSDKVision/model/StorageSettings
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>StorageSettings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKVision/model/StorageSettings} obj Optional instance to populate.
   * @return {module:SphereonSDKVision/model/StorageSettings} The populated <code>StorageSettings</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('container')) {
        obj['container'] = ApiClient.convertToType(data['container'], 'String');
      }
      if (data.hasOwnProperty('lifecycle')) {
        obj['lifecycle'] = Lifecycle.constructFromObject(data['lifecycle']);
      }
      if (data.hasOwnProperty('credentials')) {
        obj['credentials'] = Credentials.constructFromObject(data['credentials']);
      }
      if (data.hasOwnProperty('backendType')) {
        obj['backendType'] = ApiClient.convertToType(data['backendType'], 'String');
      }
      if (data.hasOwnProperty('backend')) {
        obj['backend'] = ApiClient.convertToType(data['backend'], 'String');
      }
    }
    return obj;
  }

  /**
   * The container id or name in which the files are stored.
   * @member {String} container
   */
  exports.prototype['container'] = undefined;
  /**
   * The lifecycle of the stored files.
   * @member {module:SphereonSDKVision/model/Lifecycle} lifecycle
   */
  exports.prototype['lifecycle'] = undefined;
  /**
   * The credentials from the backed.
   * @member {module:SphereonSDKVision/model/Credentials} credentials
   */
  exports.prototype['credentials'] = undefined;
  /**
   * The backend type that is used to store files.
   * @member {module:SphereonSDKVision/model/StorageSettings.BackendTypeEnum} backendType
   */
  exports.prototype['backendType'] = undefined;
  /**
   * The backend id or name that is used to store files.
   * @member {String} backend
   */
  exports.prototype['backend'] = undefined;


  /**
   * Allowed values for the <code>backendType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.BackendTypeEnum = {
    /**
     * value: "SPHEREON_CLOUD_STORAGE"
     * @const
     */
    "SPHEREON_CLOUD_STORAGE": "SPHEREON_CLOUD_STORAGE",
    /**
     * value: "AMAZON_S3"
     * @const
     */
    "AMAZON_S3": "AMAZON_S3",
    /**
     * value: "MS_AZURE_BLOB_STORAGE"
     * @const
     */
    "MS_AZURE_BLOB_STORAGE": "MS_AZURE_BLOB_STORAGE",
    /**
     * value: "GOOGLE_CLOUD_STORAGE"
     * @const
     */
    "GOOGLE_CLOUD_STORAGE": "GOOGLE_CLOUD_STORAGE",
    /**
     * value: "XILLIO_ENGINE"
     * @const
     */
    "XILLIO_ENGINE": "XILLIO_ENGINE"  };


  return exports;
}));


