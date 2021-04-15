public class Switch {
    public static String ErrorCodesEnglishString(String key) {
        switch (key) {
            case "ERR_FILE_NOT_FOUND":
                return "Error: File Not Found";
            case "ERR_ACCESS_DENIED":
                return "Access is denied to this file.";
            default:
                return "Translation Error: Invalid Translation Key";
        }
    }
    public static void main(String[]args) {
        String code = "ERR_ACCESS_DENIED";
        System.out.println(ErrorCodesEnglishString(code));
    }
}