package Strong_Password_Checker_II_2299;

class StrongChecker {

    public boolean strongPasswordCheckerII(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
        String specials = "!@#$%^&*()-+";

        char prev = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c == prev) return false; // adjacent identical
            prev = c;

            if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specials.indexOf(c) != -1) hasSpecial = true;
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        StrongChecker obj = new StrongChecker();

        String test = "IloveJava123!";
        System.out.println("Password: " + test);
        System.out.println("Is Strong? " + obj.strongPasswordCheckerII(test));
    }
}
