
public class numSquares {
    private boolean isPerfectSquare(int n) {
        double temp = n;
        temp = Math.sqrt(temp);
        int checker = (int) temp;
        if (Math.abs(temp - checker) == 0) {
            return true;
        }
        return false;
    }

    private boolean isSumOfTwoPerfectSquares(int n) {
        for (int i = 0; i <= Math.pow(n, 0.5); i++) {
            double square = Math.pow(n - Math.pow(i, 2), 0.5);
            if (square == (int) square) {
                return true;
            }
        }
        return false;
    }

    // not finished yet
    public int numSquares(int n) {

        // return 1 if n itself is a perfect square
        // to determine a perfect square we can use a sqrt function and check the result

        if (isPerfectSquare(n))
            return 1;
        // create a list that contains the perfect square that we will use

        // ArrayList <Integer> list = new ArrayList<>();

        // 1 can be used for all the cases but we want to improve the amount
        // to the least amount of time i.e. all 1s (worst / most of perfect square that
        // sum to n)
        // if no improvement is found then return the amount of perfect square we use

        // Knowing the limits of n is 1 and 10000
        // I will cheat a little bit here and place the 100 items into the list
        // variables

        // for (int i = 1; i < 101; i++){
        // list.add((int)Math.pow(i, 2));
        // }

        // using this list as a cache / memory, we can square root n, then take the
        // Math.floor
        // of that number, use it as an indice to get the first perfect square of the
        // list

        // then we should use a for loop to check if the difference between n and s is a
        // perfect square

        // Math way:
        // there are only 4 answers: 1, 2, 3, 4
        // sum of 2 square theoerm
        // 3 square theoerm

        // so if the number is a perfect square return 1
        // if for a < 7, b < 1249, n = 4^a (8b + 7) return 4
        // n's prime decompostion, one of them needs to be congrunent to 3 mod 4 and its
        // expontent is even
        // else return 3
        if (isSumOfTwoPerfectSquares(n))
            return 2;

        // int a = 0;
        // int b = 0;
        // while (a < 7) {
        // b = 0;
        // while (b < 1249) {
        // int check = (int) Math.pow(4, a) * (8 * b + 7);
        // if (n == check) {
        // return 4;
        // }
        // b++;
        // }
        // a++;
        // }

        int tempN = n;

        if (tempN % 8 == 7) {
            return 4;
        }

        while (tempN % 4 == 0) {
            tempN /= 4;
            if (tempN % 8 == 7) {
                return 4;
            }
        }

        return 3;
    }
}
