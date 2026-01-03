class OutlierTest {
    public static String encryptString(String input) {
        if (!input.matches("^[a-z]+$")) {
            throw new IllegalArgumentException("Input must contain only lowercase letters");
        }
        
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Get the base position in alphabet (0-25)
            int alphabetPosition = currentChar - 'a';
            // Add the string position to move forward in the alphabet
            int newPosition = (alphabetPosition + i) % 26;
            // Convert back to character
            char encryptedChar = (char)('a' + newPosition);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        // Test the encryption method
        try {
            String test = "hello";
            String encrypted = encryptString(test);
            System.out.println("Original: " + test);
            System.out.println("Encrypted: " + encrypted);
            
            // Additional test cases
            test = "xyz";
            encrypted = encryptString(test);
            System.out.println("\nOriginal: " + test);
            System.out.println("Encrypted: " + encrypted);
            
            test = "abcde";
            encrypted = encryptString(test);
            System.out.println("\nOriginal: " + test);
            System.out.println("Encrypted: " + encrypted);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
