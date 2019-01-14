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
    define(['SphereonSDKVision/ApiClient', 'SphereonSDKVision/model/InputResource', 'SphereonSDKVision/model/Result', 'SphereonSDKVision/model/StatusMessage', 'SphereonSDKVision/model/VisionSettings'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./InputResource'), require('./Result'), require('./StatusMessage'), require('./VisionSettings'));
  } else {
    // Browser globals (root is window)
    if (!root.Vision) {
      root.Vision = {};
    }
    root.Vision.VisionJob = factory(root.Vision.ApiClient, root.Vision.InputResource, root.Vision.Result, root.Vision.StatusMessage, root.Vision.VisionSettings);
  }
}(this, function(ApiClient, InputResource, Result, StatusMessage, VisionSettings) {
  'use strict';




  /**
   * The VisionJob model module.
   * @module SphereonSDKVision/model/VisionJob
   * @version 0.2
   */

  /**
   * Constructs a new <code>VisionJob</code>.
   * The Vision tests. Has access to the tests settings.
   * @alias module:SphereonSDKVision/model/VisionJob
   * @class
   * @param inputs {Array.<module:SphereonSDKVision/model/InputResource>} The input images. Currently supported inputs are: jpeg, png, bmp.
   */
  var exports = function(inputs) {
    var _this = this;





    _this['inputs'] = inputs;





  };

  /**
   * Constructs a <code>VisionJob</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKVision/model/VisionJob} obj Optional instance to populate.
   * @return {module:SphereonSDKVision/model/VisionJob} The populated <code>VisionJob</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('completionTime')) {
        obj['completionTime'] = ApiClient.convertToType(data['completionTime'], 'Date');
      }
      if (data.hasOwnProperty('jobId')) {
        obj['jobId'] = ApiClient.convertToType(data['jobId'], 'String');
      }
      if (data.hasOwnProperty('settings')) {
        obj['settings'] = VisionSettings.constructFromObject(data['settings']);
      }
      if (data.hasOwnProperty('creationTime')) {
        obj['creationTime'] = ApiClient.convertToType(data['creationTime'], 'Date');
      }
      if (data.hasOwnProperty('inputs')) {
        obj['inputs'] = ApiClient.convertToType(data['inputs'], [InputResource]);
      }
      if (data.hasOwnProperty('updateTime')) {
        obj['updateTime'] = ApiClient.convertToType(data['updateTime'], 'Date');
      }
      if (data.hasOwnProperty('state')) {
        obj['state'] = ApiClient.convertToType(data['state'], 'String');
      }
      if (data.hasOwnProperty('results')) {
        obj['results'] = ApiClient.convertToType(data['results'], {'String': Result});
      }
      if (data.hasOwnProperty('queueTime')) {
        obj['queueTime'] = ApiClient.convertToType(data['queueTime'], 'Date');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], [StatusMessage]);
      }
    }
    return obj;
  }

  /**
   * The completion date/time of this tests in ISO 8601 format.
   * @member {Date} completionTime
   */
  exports.prototype['completionTime'] = undefined;
  /**
   * The job id
   * @member {String} jobId
   */
  exports.prototype['jobId'] = undefined;
  /**
   * The settings used during execution of the vision task.
   * @member {module:SphereonSDKVision/model/VisionSettings} settings
   */
  exports.prototype['settings'] = undefined;
  /**
   * The creation date/time of this tests in ISO 8601 format.
   * @member {Date} creationTime
   */
  exports.prototype['creationTime'] = undefined;
  /**
   * The input images. Currently supported inputs are: jpeg, png, bmp.
   * @member {Array.<module:SphereonSDKVision/model/InputResource>} inputs
   */
  exports.prototype['inputs'] = undefined;
  /**
   * The last update date/time of this tests in ISO 8601 format.
   * @member {Date} updateTime
   */
  exports.prototype['updateTime'] = undefined;
  /**
   * The status of the vision job,
   * @member {module:SphereonSDKVision/model/VisionJob.StateEnum} state
   */
  exports.prototype['state'] = undefined;
  /**
   * The tags that are predicted for each input.
   * @member {Object.<String, module:SphereonSDKVision/model/Result>} results
   */
  exports.prototype['results'] = undefined;
  /**
   * The queue date/time of this tests in ISO 8601 format.
   * @member {Date} queueTime
   */
  exports.prototype['queueTime'] = undefined;
  /**
   * A list of status messages. A status message, which can be informational, warning or error. A message here does not indicate an error perse.
   * @member {Array.<module:SphereonSDKVision/model/StatusMessage>} status
   */
  exports.prototype['status'] = undefined;


  /**
   * Allowed values for the <code>state</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StateEnum = {
    /**
     * value: "UPLOAD_RESOURCES"
     * @const
     */
    "UPLOAD_RESOURCES": "UPLOAD_RESOURCES",
    /**
     * value: "PROCESSING"
     * @const
     */
    "PROCESSING": "PROCESSING",
    /**
     * value: "DONE"
     * @const
     */
    "DONE": "DONE",
    /**
     * value: "ERROR"
     * @const
     */
    "ERROR": "ERROR",
    /**
     * value: "DELETED"
     * @const
     */
    "DELETED": "DELETED"  };


  return exports;
}));


