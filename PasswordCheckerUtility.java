import java.util.ArrayList;
public interface PasswordCheckerUtility {
	public static boolean isValidPassword(String passwordString) throws LengthException, NoDigitException, NoUpperAlphaException, NoLowerAlphaException, InvalidSequenceException {
		return false;
	}
	public static boolean isWeakPassword(String passwordString) throws LengthException, NoDigitException, NoUpperAlphaException, NoLowerAlphaException, InvalidSequenceException {
		return false;
	}
	public ArrayList<String>invalidPasswords(ArrayList<String> passwords);
	public static ArrayList<String>validPasswords(ArrayList<String> passwords) {
		return passwords;
	}

	}
	


