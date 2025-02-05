class Main {
    public static void main(String[] args) {
        
        // create a string with white spaces
        String str = "    ";

        // check if str1 is null or empty
        System.out.println("str is " + isNullEmpty(str));
    }

    // method check if string is null or empty
    public static String isNullEmpty(String str) {

        // check if string is null
        if (str == null) {
            return "NULL";
        }

        // check if string is empty
        else if (str.trim().isEmpty()){
            return "EMPTY";
        }

        else {
            return "neither NULL nor EMPTY";
        }
    }
}