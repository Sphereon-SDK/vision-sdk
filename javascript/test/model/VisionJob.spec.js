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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.Vision);
  }
}(this, function(expect, Vision) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Vision.VisionJob();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('VisionJob', function() {
    it('should create an instance of VisionJob', function() {
      // uncomment below and update the code to test VisionJob
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be.a(Vision.VisionJob);
    });

    it('should have the property completionTime (base name: "completionTime")', function() {
      // uncomment below and update the code to test the property completionTime
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property jobId (base name: "jobId")', function() {
      // uncomment below and update the code to test the property jobId
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property settings (base name: "settings")', function() {
      // uncomment below and update the code to test the property settings
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property creationTime (base name: "creationTime")', function() {
      // uncomment below and update the code to test the property creationTime
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property inputs (base name: "inputs")', function() {
      // uncomment below and update the code to test the property inputs
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property updateTime (base name: "updateTime")', function() {
      // uncomment below and update the code to test the property updateTime
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

    it('should have the property queueTime (base name: "queueTime")', function() {
      // uncomment below and update the code to test the property queueTime
      //var instane = new Vision.VisionJob();
      //expect(instance).to.be();
    });

  });

}));