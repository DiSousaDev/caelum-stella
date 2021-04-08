package br.com.caelum.stella.validation.ie;

import br.com.caelum.stella.MessageProducer;
import br.com.caelum.stella.validation.Validator;

public class IERioDeJaneiroValidatorTest extends IEValidatorTest {

	public IERioDeJaneiroValidatorTest() {
		super(wrongCheckDigitUnformattedString, validUnformattedString, validFormattedString, validValues);
	}

	private static final String validFormattedString = "78.045.30-2";
		
	private static final String validUnformattedString = "78045302";
	
	private static final String wrongCheckDigitUnformattedString = "78045304";
	
	private static final String[] validValues = { validFormattedString, "53.518.02-8", "71.294.24-2" };

	@Override
	protected Validator<String> getValidator(MessageProducer messageProducer, boolean isFormatted) {
		return new IERioDeJaneiroValidator(messageProducer, isFormatted);
	}

}
