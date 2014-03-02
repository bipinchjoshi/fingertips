/**
 * 
 */
package fingertips.web.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author bipin
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorMessage {

	Errors[] errors;

	/**
	 * @return the errors
	 */
	public Errors[] getErrors() {
		return errors;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public void setErrors(Errors[] errors) {
		this.errors = errors;
	}

}
