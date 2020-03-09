package snippet;

public class Xpath {

	public static void main(String[] args) {
		
		//Xpath Syntax
		// ( "//tagname[@attribute='value']")  // ("//input[@type='email']")
		// ("//*[@attribute='value']")         // ("//*[@type='email']")
		//	if no constant value ( //tagname[contains(attribute,'value')]) // (//input[contains(id,'email')])
		
		
		
		/* What if there is no costant value for any attribute then write below Xpath
		 * Syntax ( //tagname[contains(attribute,'value')]) - Xpath regular expression
		 * Eg  <input id="email123">
		 *  //input[contains(id,'email')]
		 *  		
		*/
	}

}
