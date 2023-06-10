package Basic;
class Switchcase7 {
    public static void main(String[] args) {
        String season = "summer";
        String result;

        switch (season) {
            case "Spring":
                result = "1";
                break;

            case "summer":
                result = "2";
                break;

            case "autumn":
                result = "3";
                break;

            case "winter":
                result = "4";
                break;
            default:
                result = "错误";
                break;
        }
        System.out.println(result);

        int result1 = 60;
        boolean result2 = (result1 >= 60);

        String result3 = String.valueOf(result2);

        switch (result3) {
            case "true":
                System.out.println("1");
                break;
            case "false":
                System.out.println("2");

        }

    }
}