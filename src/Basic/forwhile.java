package Basic;
class forwhile {
    public static void main(String[] args) {

        int count = 0;
        int result1 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count += 1;
                result1 += i;

            }
        }
        System.out.println(count + "   " + result1);

        count = 0;
        result1 = 0;

        int i = 1;
        while (i <= 100) {
            i++;
            if (i % 2 == 0) {
                count += 1;
                result1 += i;
            }
        }
        System.out.println(count + "   " + result1);

        count = 0;
        result1 = 0;

        i = 1;
        do {
            if (i % 2 == 0) {
                count += 1;
                result1 += i;
            }
            i++;
        } while (i <= 100);
        System.out.println(count + "   " + result1);

    }
}