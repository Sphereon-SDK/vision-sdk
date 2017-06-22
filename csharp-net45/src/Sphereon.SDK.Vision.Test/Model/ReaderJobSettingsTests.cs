/* 
 * Barcode
 *
 * <b>The Barcode Reader API '/reader' reads barcodes from image files and returns the barcode data as JSON files.</b>    The flow is generally as follows:  1. First upload an image using the /reader POST endpoint. You will get back a job response that contains a job with its associated settings.  2. Start the job from a PUT request to the /reader/{jobid} endpoint, with the Job and Settings JSON as request body. The barcode detection will now start.  3. Check the job status from the /reader/{jobid} GET endpoint until the status has changed to DONE or ERROR. Messaging using a websocket will be available as an alternative in a future version  4. Retrieve the JSON file using the /reader/{jobid}/stream GET endpoint. This will return the JSON file only when the status is DONE. In other cases it will return the Job Response JSON (with http code 202 instead of 200)      <b>Interactive testing: </b>A web based test console is available in the <a href=\"https://store.sphereon.com\">Sphereon API Store</a>
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Sphereon.SDK.Vision.Api;
using Sphereon.SDK.Vision.Model;
using Sphereon.SDK.Vision.Client;
using System.Reflection;

namespace Sphereon.SDK.Vision.Test
{
    /// <summary>
    ///  Class for testing ReaderJobSettings
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class ReaderJobSettingsTests
    {
        // TODO uncomment below to declare an instance variable for ReaderJobSettings
        //private ReaderJobSettings instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of ReaderJobSettings
            //instance = new ReaderJobSettings();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ReaderJobSettings
        /// </summary>
        [Test]
        public void ReaderJobSettingsInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" ReaderJobSettings
            //Assert.IsInstanceOfType<ReaderJobSettings> (instance, "variable 'instance' is a ReaderJobSettings");
        }

        /// <summary>
        /// Test the property 'Lifecycle'
        /// </summary>
        [Test]
        public void LifecycleTest()
        {
            // TODO unit test for the property 'Lifecycle'
        }
        /// <summary>
        /// Test the property 'OutputFileName'
        /// </summary>
        [Test]
        public void OutputFileNameTest()
        {
            // TODO unit test for the property 'OutputFileName'
        }
        /// <summary>
        /// Test the property 'Engine'
        /// </summary>
        [Test]
        public void EngineTest()
        {
            // TODO unit test for the property 'Engine'
        }
        /// <summary>
        /// Test the property 'OutputFileFormat'
        /// </summary>
        [Test]
        public void OutputFileFormatTest()
        {
            // TODO unit test for the property 'OutputFileFormat'
        }

    }

}