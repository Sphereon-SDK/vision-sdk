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
    /// Lifecycle settings. When no lifecycle settings are supplied, the job and files will be deleted directly after processing the job.
    /// </summary>
    [DataContract]
    public partial class Lifecycle :  IEquatable<Lifecycle>, IValidatableObject
    {
        /// <summary>
        /// The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually.
        /// </summary>
        /// <value>The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActionEnum
        {
            
            /// <summary>
            /// Enum DELETE for value: DELETE
            /// </summary>
            [EnumMember(Value = "DELETE")]
            DELETE = 1,
            
            /// <summary>
            /// Enum NONE for value: NONE
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE = 2
        }

        /// <summary>
        /// The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually.
        /// </summary>
        /// <value>The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually.</value>
        [DataMember(Name="action", EmitDefaultValue=false)]
        public ActionEnum? Action { get; set; }
        /// <summary>
        /// Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing.
        /// </summary>
        /// <value>Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum DONE for value: JOB_DONE
            /// </summary>
            [EnumMember(Value = "JOB_DONE")]
            DONE = 1
        }

        /// <summary>
        /// Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing.
        /// </summary>
        /// <value>Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing.</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Lifecycle" /> class.
        /// </summary>
        /// <param name="Action">The action to perform. Delete the files or leave the files exists after processing. The files can be delete manually..</param>
        /// <param name="Type">Determine when to delete the job and associated files.  JOB_DONE means delete directly after the job finished processing..</param>
        public Lifecycle(ActionEnum? Action = default(ActionEnum?), TypeEnum? Type = default(TypeEnum?))
        {
            this.Action = Action;
            this.Type = Type;
        }
        


        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Lifecycle {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
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
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Lifecycle);
        }

        /// <summary>
        /// Returns true if Lifecycle instances are equal
        /// </summary>
        /// <param name="input">Instance of Lifecycle to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Lifecycle input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Action == input.Action ||
                    (this.Action != null &&
                    this.Action.Equals(input.Action))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
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
                if (this.Action != null)
                    hashCode = hashCode * 59 + this.Action.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
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
