/* 
 * Vision
 *
 * Sphereon Vision APIs
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@sphereon.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Sphereon.SDK.Vision.Client.SwaggerDateConverter;

namespace Sphereon.SDK.Vision.Model
{
    /// <summary>
    /// Result
    /// </summary>
    [DataContract]
    public partial class Result :  IEquatable<Result>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Result" /> class.
        /// </summary>
        /// <param name="VendorResults">The results for specific vendor..</param>
        /// <param name="Labels">The labels that are predicted on the input..</param>
        /// <param name="Ocr">The ocr result that are found on the input. .</param>
        public Result(Dictionary<string, VendorResult> VendorResults = default(Dictionary<string, VendorResult>), List<Tag> Labels = default(List<Tag>), List<Tag> Ocr = default(List<Tag>))
        {
            this.VendorResults = VendorResults;
            this.Labels = Labels;
            this.Ocr = Ocr;
        }
        
        /// <summary>
        /// The input filename.
        /// </summary>
        /// <value>The input filename.</value>
        [DataMember(Name="filename", EmitDefaultValue=false)]
        public string Filename { get; private set; }

        /// <summary>
        /// The results for specific vendor.
        /// </summary>
        /// <value>The results for specific vendor.</value>
        [DataMember(Name="vendorResults", EmitDefaultValue=false)]
        public Dictionary<string, VendorResult> VendorResults { get; set; }

        /// <summary>
        /// The labels that are predicted on the input.
        /// </summary>
        /// <value>The labels that are predicted on the input.</value>
        [DataMember(Name="labels", EmitDefaultValue=false)]
        public List<Tag> Labels { get; set; }

        /// <summary>
        /// The ocr result that are found on the input. 
        /// </summary>
        /// <value>The ocr result that are found on the input. </value>
        [DataMember(Name="ocr", EmitDefaultValue=false)]
        public List<Tag> Ocr { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Result {\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  VendorResults: ").Append(VendorResults).Append("\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  Ocr: ").Append(Ocr).Append("\n");
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
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Result);
        }

        /// <summary>
        /// Returns true if Result instances are equal
        /// </summary>
        /// <param name="input">Instance of Result to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Result input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Filename == input.Filename ||
                    (this.Filename != null &&
                    this.Filename.Equals(input.Filename))
                ) && 
                (
                    this.VendorResults == input.VendorResults ||
                    this.VendorResults != null &&
                    this.VendorResults.SequenceEqual(input.VendorResults)
                ) && 
                (
                    this.Labels == input.Labels ||
                    this.Labels != null &&
                    this.Labels.SequenceEqual(input.Labels)
                ) && 
                (
                    this.Ocr == input.Ocr ||
                    this.Ocr != null &&
                    this.Ocr.SequenceEqual(input.Ocr)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Filename != null)
                    hashCode = hashCode * 59 + this.Filename.GetHashCode();
                if (this.VendorResults != null)
                    hashCode = hashCode * 59 + this.VendorResults.GetHashCode();
                if (this.Labels != null)
                    hashCode = hashCode * 59 + this.Labels.GetHashCode();
                if (this.Ocr != null)
                    hashCode = hashCode * 59 + this.Ocr.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
