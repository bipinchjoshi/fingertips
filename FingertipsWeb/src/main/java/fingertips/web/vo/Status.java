/**
 * 
 */
package fingertips.web.vo;


/**
 * @author bipin
 * 
 */
public class Status {
	private String result;

	private ErrorMessage[] error;

	public Status() {

	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	public ErrorMessage[] getError() {
		return error;
	}

	public void setError(ErrorMessage[] error) {
		this.error = error;
	}

}
