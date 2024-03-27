class hellohello {
    public static void main(String[] args) {

        int n = 10, firstTerm = 0, secondTerm = 1;

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
