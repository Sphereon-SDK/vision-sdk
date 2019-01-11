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
    /// StatusMessage
    /// </summary>
    [DataContract]
    public partial class StatusMessage :  IEquatable<StatusMessage>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StatusMessage" /> class.
        /// </summary>
        /// <param name="Time">The time that the status message occurred..</param>
        /// <param name="Message">A status message, which can be informational, warning or error. A message here does not indicate an error perse..</param>
        public StatusMessage(DateTime? Time = default(DateTime?), string Message = default(string))
        {
            this.Time = Time;
            this.Message = Message;
        }
        
        /// <summary>
        /// The time that the status message occurred.
        /// </summary>
        /// <value>The time that the status message occurred.</value>
        [DataMember(Name="time", EmitDefaultValue=false)]
        public DateTime? Time { get; set; }

        /// <summary>
        /// A status message, which can be informational, warning or error. A message here does not indicate an error perse.
        /// </summary>
        /// <value>A status message, which can be informational, warning or error. A message here does not indicate an error perse.</value>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StatusMessage {\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
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
            return this.Equals(input as StatusMessage);
        }

        /// <summary>
        /// Returns true if StatusMessage instances are equal
        /// </summary>
        /// <param name="input">Instance of StatusMessage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StatusMessage input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
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
                if (this.Time != null)
                    hashCode = hashCode * 59 + this.Time.GetHashCode();
                if (this.Message != null)
                    hashCode = hashCode * 59 + this.Message.GetHashCode();
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