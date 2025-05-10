package com.TechnoGadgets.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;
import jakarta.servlet.http.Part;

/**
 * Utility class for validation methods.
 */
public class ValidationUtil {

    // Validate if a field is null or empty
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    // Validate if a string contains only letters
    public static boolean isAlphabetic(String value) {
        return !isNullOrEmpty(value) && value.matches("^[a-zA-Z]+$"); 
    }

    // Validate if a string starts with a letter and contains only letters & numbers
    public static boolean isAlphanumericStartingWithLetter(String value) {
        return !isNullOrEmpty(value) && value.matches("^[a-zA-Z][a-zA-Z0-9]*$");
    }

    // Validate if the gender is Male, Female, or Other
    public static boolean isValidGender(String value) {
        return !isNullOrEmpty(value) &&
               (value.equalsIgnoreCase("male") ||
                value.equalsIgnoreCase("female") ||
                value.equalsIgnoreCase("other"));
    }

    // Validate if an email follows the correct format
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return !isNullOrEmpty(email) && Pattern.matches(emailRegex, email);
    }

    // Validate if a phone number is 10 digits long (allows all valid numbers)
    public static boolean isValidPhoneNumber(String number) {
        return !isNullOrEmpty(number) && number.matches("^\\d{10}$"); // Any 10-digit number
    }

    // Validate password (Min: 8 chars, 1 uppercase, 1 number, 1 special character)
    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return !isNullOrEmpty(password) && password.matches(passwordRegex);
    }

    // Validate image file extension (jpg, jpeg, png, gif)
    public static boolean isValidImageExtension(Part imagePart) {
        if (imagePart == null || isNullOrEmpty(imagePart.getSubmittedFileName())) {
            return false;
        }
        String fileName = imagePart.getSubmittedFileName().toLowerCase();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") ||
               fileName.endsWith(".png") || fileName.endsWith(".gif");
    }

    // Validate if passwords match
    public static boolean doPasswordsMatch(String password, String retypePassword) {
        return !isNullOrEmpty(password) && !isNullOrEmpty(retypePassword) && password.equals(retypePassword);
    }

    // Validate if a user is at least 16 years old
    public static boolean isAgeAtLeast16(LocalDate dob) {
        if (dob == null) {
            return false;
        }
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears() >= 16;
    }
}