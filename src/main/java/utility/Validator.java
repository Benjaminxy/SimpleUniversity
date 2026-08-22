package utility;

public  class Validator {

    private static final String SPECIAL_CHARACTERS = "!@#$%^&";


    public boolean isValidName(String name) {

        if (name == null || name.isBlank() || name.length() < 3) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            // A name can contain letters and spaces
            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidNationalCode(String nationalCode) {

        if (nationalCode == null || nationalCode.length() != 10) {
            return false;
        }

        for (int i = 0; i < nationalCode.length(); i++) {
            char ch = nationalCode.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (SPECIAL_CHARACTERS.indexOf(ch) >= 0) {
                hasSpecialCharacter = true;
            }

            if (hasDigit
                    && hasUpperCase
                    && hasLowerCase
                    && hasSpecialCharacter) {
                return true;
            }
        }

        return false;
    }
}