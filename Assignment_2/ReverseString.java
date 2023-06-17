class ReverseString {
    public static void main(String[] args) {
        String websiteString = "The Testing Academy";
        String reversedString = reverse(websiteString);
        System.out.println(reversedString);

        String testString = "Anthony Krese";
        String reversedName = reverse(testString);
        System.out.println(reversedName);

        String inputName = "Japan";
        StringBuilder reversedCountry = new StringBuilder(inputName).reverse();
        String backwardCountry = reversedCountry.toString();
        System.out.println(backwardCountry);

    }
    public static String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

}
