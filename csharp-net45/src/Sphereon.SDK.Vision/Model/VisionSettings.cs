/* 
 * Vision
 *
 * Sphereon Vision APIs
 *
 * OpenAPI spec version: 0.1
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
    /// Vision settings
    /// </summary>
    [DataContract]
    public partial class VisionSettings :  IEquatable<VisionSettings>
    {
        /// <summary>
        /// Gets or Sets StorageProvider
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StorageProviderEnum
        {
            
            /// <summary>
            /// Enum SUPPLIER for "API_SUPPLIER"
            /// </summary>
            [EnumMember(Value = "API_SUPPLIER")]
            SUPPLIER
        }

        /// <summary>
        /// Gets or Sets Vendor
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum VendorEnum
        {
            
            /// <summary>
            /// Enum Google for "google"
            /// </summary>
            [EnumMember(Value = "google")]
            Google,
            
            /// <summary>
            /// Enum Microsoft for "microsoft"
            /// </summary>
            [EnumMember(Value = "microsoft")]
            Microsoft,
            
            /// <summary>
            /// Enum Clarifai for "clarifai"
            /// </summary>
            [EnumMember(Value = "clarifai")]
            Clarifai
        }


        /// <summary>
        /// Gets or Sets DetectionTypes
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DetectionTypesEnum
        {
            
            /// <summary>
            /// Enum LABEL for "LABEL"
            /// </summary>
            [EnumMember(Value = "LABEL")]
            LABEL,
            
            /// <summary>
            /// Enum TEXT for "TEXT"
            /// </summary>
            [EnumMember(Value = "TEXT")]
            TEXT,
            
            /// <summary>
            /// Enum FACIAL for "FACIAL"
            /// </summary>
            [EnumMember(Value = "FACIAL")]
            FACIAL,
            
            /// <summary>
            /// Enum LOGO for "LOGO"
            /// </summary>
            [EnumMember(Value = "LOGO")]
            LOGO
        }

        /// <summary>
        /// Gets or Sets StorageProvider
        /// </summary>
        [DataMember(Name="storageProvider", EmitDefaultValue=false)]
        public StorageProviderEnum? StorageProvider { get; set; }
        /// <summary>
        /// Gets or Sets Vendor
        /// </summary>
        [DataMember(Name="vendor", EmitDefaultValue=false)]
        public VendorEnum? Vendor { get; set; }
        /// <summary>
        /// Gets or Sets DetectionTypes
        /// </summary>
        [DataMember(Name="detectionTypes", EmitDefaultValue=false)]
        public List<DetectionTypesEnum> DetectionTypes { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="VisionSettings" /> class.
        /// </summary>
        /// <param name="StorageProvider">StorageProvider.</param>
        /// <param name="Vendor">Vendor.</param>
        /// <param name="DetectionTypes">DetectionTypes.</param>
        public VisionSettings(StorageProviderEnum? StorageProvider = null, VendorEnum? Vendor = null, List<DetectionTypesEnum> DetectionTypes = null)
        {
            this.StorageProvider = StorageProvider;
            this.Vendor = Vendor;
            this.DetectionTypes = DetectionTypes;
        }
        
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VisionSettings {\n");
            sb.Append("  StorageProvider: ").Append(StorageProvider).Append("\n");
            sb.Append("  Vendor: ").Append(Vendor).Append("\n");
            sb.Append("  DetectionTypes: ").Append(DetectionTypes).Append("\n");
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
            return this.Equals(obj as VisionSettings);
        }

        /// <summary>
        /// Returns true if VisionSettings instances are equal
        /// </summary>
        /// <param name="other">Instance of VisionSettings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VisionSettings other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.StorageProvider == other.StorageProvider ||
                    this.StorageProvider != null &&
                    this.StorageProvider.Equals(other.StorageProvider)
                ) && 
                (
                    this.Vendor == other.Vendor ||
                    this.Vendor != null &&
                    this.Vendor.Equals(other.Vendor)
                ) && 
                (
                    this.DetectionTypes == other.DetectionTypes ||
                    this.DetectionTypes != null &&
                    this.DetectionTypes.SequenceEqual(other.DetectionTypes)
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
                if (this.StorageProvider != null)
                    hash = hash * 59 + this.StorageProvider.GetHashCode();
                if (this.Vendor != null)
                    hash = hash * 59 + this.Vendor.GetHashCode();
                if (this.DetectionTypes != null)
                    hash = hash * 59 + this.DetectionTypes.GetHashCode();
                return hash;
            }
        }
    }

}
