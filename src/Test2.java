class Test2 {
    static void extract(int n, String[] arr)
    {
        if (n == 0) {
            return;
        }

        int a = n % 10;
        n = n / 10;

        extract(n, arr);

        System.out.print(arr[a]);
        System.out.print(" ");
    }

    public static void main(String args[])
    {
        String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        extract(3581, arr);
    }
}
