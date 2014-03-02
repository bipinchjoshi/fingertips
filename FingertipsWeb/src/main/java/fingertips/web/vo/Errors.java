/**
 * 
 */
package fingertips.web.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author bipin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Errors {
	private String field;
	@JsonProperty("rejected-value")
	private String rejectedValue;
	private String message;

	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}

	/**
	 * @param field
	 *            the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}

	/**
	 * @return the rejectedValue
	 */
	public String getRejectedValue() {
		return rejectedValue;
	}

	/**
	 * @param rejectedValue
	 *            the rejectedValue to set
	 */
	public void setRejectedValue(String rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
