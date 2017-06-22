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
    instance = new Vision.VisionApi();
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

  describe('VisionApi', function() {
    describe('classifyJob', function() {
      it('should call classifyJob successfully', function(done) {
        //uncomment below and update the code to test classifyJob
        //instance.classifyJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('createVisionJob', function() {
      it('should call createVisionJob successfully', function(done) {
        //uncomment below and update the code to test createVisionJob
        //instance.createVisionJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteVisionJob', function() {
      it('should call deleteVisionJob successfully', function(done) {
        //uncomment below and update the code to test deleteVisionJob
        //instance.deleteVisionJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getClassificationResult', function() {
      it('should call getClassificationResult successfully', function(done) {
        //uncomment below and update the code to test getClassificationResult
        //instance.getClassificationResult(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getVisionJob', function() {
      it('should call getVisionJob successfully', function(done) {
        //uncomment below and update the code to test getVisionJob
        //instance.getVisionJob(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('uploadFile', function() {
      it('should call uploadFile successfully', function(done) {
        //uncomment below and update the code to test uploadFile
        //instance.uploadFile(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
