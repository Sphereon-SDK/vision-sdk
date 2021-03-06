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
    define(['SphereonSDKVision/ApiClient', 'SphereonSDKVision/model/Error'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Error'));
  } else {
    // Browser globals (root is window)
    if (!root.Vision) {
      root.Vision = {};
    }
    root.Vision.ErrorResponse = factory(root.Vision.ApiClient, root.Vision.Error);
  }
}(this, function(ApiClient, Error) {
  'use strict';




  /**
   * The ErrorResponse model module.
   * @module SphereonSDKVision/model/ErrorResponse
   * @version 0.2
   */

  /**
   * Constructs a new <code>ErrorResponse</code>.
   * The error response
   * @alias module:SphereonSDKVision/model/ErrorResponse
   * @class
   */
  var exports = function() {
    var _this = this;


  };

  /**
   * Constructs a <code>ErrorResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKVision/model/ErrorResponse} obj Optional instance to populate.
   * @return {module:SphereonSDKVision/model/ErrorResponse} The populated <code>ErrorResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('errors')) {
        obj['errors'] = ApiClient.convertToType(data['errors'], [Error]);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:SphereonSDKVision/model/Error>} errors
   */
  exports.prototype['errors'] = undefined;



  return exports;
}));


