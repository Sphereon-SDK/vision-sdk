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

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace Sphereon.SDK.Vision.Model
{
    /// <summary>
    /// Barcode
    /// </summary>
    [DataContract]
    public partial class Barcode :  IEquatable<Barcode>
    {
        /// <summary>
        /// The type of the barcode
        /// </summary>
        /// <value>The type of the barcode</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum AZTEC for "AZTEC"
            /// </summary>
            [EnumMember(Value = "AZTEC")]
            AZTEC,
            
            /// <summary>
            /// Enum CODABAR for "CODABAR"
            /// </summary>
            [EnumMember(Value = "CODABAR")]
            CODABAR,
            
            /// <summary>
            /// Enum CODE39 for "CODE_39"
            /// </summary>
            [EnumMember(Value = "CODE_39")]
            CODE39,
            
            /// <summary>
            /// Enum CODE39EXTENDED for "CODE_39_EXTENDED"
            /// </summary>
            [EnumMember(Value = "CODE_39_EXTENDED")]
            CODE39EXTENDED,
            
            /// <summary>
            /// Enum CODE93 for "CODE_93"
            /// </summary>
            [EnumMember(Value = "CODE_93")]
            CODE93,
            
            /// <summary>
            /// Enum CODE128 for "CODE_128"
            /// </summary>
            [EnumMember(Value = "CODE_128")]
            CODE128,
            
            /// <summary>
            /// Enum DATAMATRIX for "DATA_MATRIX"
            /// </summary>
            [EnumMember(Value = "DATA_MATRIX")]
            DATAMATRIX,
            
            /// <summary>
            /// Enum EAN8 for "EAN_8"
            /// </summary>
            [EnumMember(Value = "EAN_8")]
            EAN8,
            
            /// <summary>
            /// Enum EAN13 for "EAN_13"
            /// </summary>
            [EnumMember(Value = "EAN_13")]
            EAN13,
            
            /// <summary>
            /// Enum ITF for "ITF"
            /// </summary>
            [EnumMember(Value = "ITF")]
            ITF,
            
            /// <summary>
            /// Enum MAXICODE for "MAXICODE"
            /// </summary>
            [EnumMember(Value = "MAXICODE")]
            MAXICODE,
            
            /// <summary>
            /// Enum PDF417 for "PDF_417"
            /// </summary>
            [EnumMember(Value = "PDF_417")]
            PDF417,
            
            /// <summary>
            /// Enum QRCODE for "QR_CODE"
            /// </summary>
            [EnumMember(Value = "QR_CODE")]
            QRCODE,
            
            /// <summary>
            /// Enum RSS14 for "RSS_14"
            /// </summary>
            [EnumMember(Value = "RSS_14")]
            RSS14,
            
            /// <summary>
            /// Enum RSSEXPANDED for "RSS_EXPANDED"
            /// </summary>
            [EnumMember(Value = "RSS_EXPANDED")]
            RSSEXPANDED,
            
            /// <summary>
            /// Enum UPCA for "UPC_A"
            /// </summary>
            [EnumMember(Value = "UPC_A")]
            UPCA,
            
            /// <summary>
            /// Enum UPCE for "UPC_E"
            /// </summary>
            [EnumMember(Value = "UPC_E")]
            UPCE,
            
            /// <summary>
            /// Enum UPCEANEXTENSION for "UPC_EAN_EXTENSION"
            /// </summary>
            [EnumMember(Value = "UPC_EAN_EXTENSION")]
            UPCEANEXTENSION,
            
            /// <summary>
            /// Enum IDENTCODE for "IDENTCODE"
            /// </summary>
            [EnumMember(Value = "IDENTCODE")]
            IDENTCODE,
            
            /// <summary>
            /// Enum INTERLEAVED25 for "INTERLEAVED25"
            /// </summary>
            [EnumMember(Value = "INTERLEAVED25")]
            INTERLEAVED25
        }

        /// <summary>
        /// The type of the barcode
        /// </summary>
        /// <value>The type of the barcode</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Barcode" /> class.
        /// </summary>
        /// <param name="Coordinates">The coordinates of the barcode. There are usually 2 coordinates, with an x and y value and an anchor..</param>
        public Barcode(List<BarcodeCoordinate> Coordinates = null)
        {
            this.Coordinates = Coordinates;
        }
        
        /// <summary>
        /// The confidence level of the barcode
        /// </summary>
        /// <value>The confidence level of the barcode</value>
        [DataMember(Name="confidenceLevel", EmitDefaultValue=false)]
        public double? ConfidenceLevel { get; private set; }
        /// <summary>
        /// The number of the page the barcode is on
        /// </summary>
        /// <value>The number of the page the barcode is on</value>
        [DataMember(Name="pageNo", EmitDefaultValue=false)]
        public int? PageNo { get; private set; }
        /// <summary>
        /// The coordinates of the barcode. There are usually 2 coordinates, with an x and y value and an anchor.
        /// </summary>
        /// <value>The coordinates of the barcode. There are usually 2 coordinates, with an x and y value and an anchor.</value>
        [DataMember(Name="coordinates", EmitDefaultValue=false)]
        public List<BarcodeCoordinate> Coordinates { get; set; }
        /// <summary>
        /// The text of the barcode
        /// </summary>
        /// <value>The text of the barcode</value>
        [DataMember(Name="text", EmitDefaultValue=false)]
        public string Text { get; private set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Barcode {\n");
            sb.Append("  ConfidenceLevel: ").Append(ConfidenceLevel).Append("\n");
            sb.Append("  PageNo: ").Append(PageNo).Append("\n");
            sb.Append("  Coordinates: ").Append(Coordinates).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as Barcode);
        }

        /// <summary>
        /// Returns true if Barcode instances are equal
        /// </summary>
        /// <param name="other">Instance of Barcode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Barcode other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ConfidenceLevel == other.ConfidenceLevel ||
                    this.ConfidenceLevel != null &&
                    this.ConfidenceLevel.Equals(other.ConfidenceLevel)
                ) && 
                (
                    this.PageNo == other.PageNo ||
                    this.PageNo != null &&
                    this.PageNo.Equals(other.PageNo)
                ) && 
                (
                    this.Coordinates == other.Coordinates ||
                    this.Coordinates != null &&
                    this.Coordinates.SequenceEqual(other.Coordinates)
                ) && 
                (
                    this.Text == other.Text ||
                    this.Text != null &&
                    this.Text.Equals(other.Text)
                ) && 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.ConfidenceLevel != null)
                    hash = hash * 59 + this.ConfidenceLevel.GetHashCode();
                if (this.PageNo != null)
                    hash = hash * 59 + this.PageNo.GetHashCode();
                if (this.Coordinates != null)
                    hash = hash * 59 + this.Coordinates.GetHashCode();
                if (this.Text != null)
                    hash = hash * 59 + this.Text.GetHashCode();
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                return hash;
            }
        }
    }

}
