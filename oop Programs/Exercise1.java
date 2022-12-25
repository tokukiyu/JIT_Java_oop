
// Solved
// 1. The number 198 has the property that 198 = 11 + 99 + 88, i.e., 
//  if each of its digits is concatenated twice and then summed, the result will be the original number. It turns out that 198 is the only
// number with this property. However, the property can be generalized so that each digit is
// concatenated n times and then summed. For example, 2997 = 222+999+999+777 and here each
// digit is concatenated three times. Write val method named checkContenatedSum that tests if val
// number has this generalized property. The signature of the method is int
// checkConcatenatedSum(int n, int catlen) where n is the number and catlen is the number of
// times to concatenate each digit before summing
class App {
    static int checkConcatenatedSum(int n, int catlen) {
        int sum = 0;
        int x = n;
        while (x > 0) {
            int rem = x % 10;
            int val = rem;
            for (int i = 1; i < catlen; i++) {
                val = val * 10 + rem;
            }
            sum += val;
            x /= 10;
        }
        return sum == n ? 1 : 0;
    }

    // SOLVED
    // 2. Write a method named isLegalNumber that takes two arguments. The first
    // argument is an array
    // whose elements are the digits of the number to test. The second argument is
    // the base of the
    // number represented by the first argument. The method returns 1 if the number
    // represented by the
    // array is a legal number in the given base, otherwise it returns 0.
    // For example the number 3214 can be passed to the method as follows:
    // isLegalNumber(new int[] {3, 2, 1}, 4)
    // This call will return 1 because 3214 is a legal base 4 number.
    // However, since all digits of a base n number must be less than n, the
    // following call will return 0 because
    // 3716 is not a legal base 6 number (the digit 7 is not allowed)
    // isLegalNumber(new int[] {3, 7, 1}, 6)
    // Answer
    static int isLegalNumber(int[] arr, int base) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int a = checkConcatenatedSum(2997, 3);
        int b = isLegalNumber(new int[] { 3, 2, 1 }, 4);
        System.out.println(b);
    }
}

// Solved
/*
 * Create the class Movie with an instance of class Movie represents a film.
 * This class has
 * the following three class variables:
 * ● title, which is a String representing the title of the movie
 * ● studio, which is a String representing the studio that made the movie
 * ● rating, which is a String representing the rating of the movie (i.e. PG-13,
 * R, etc)
 */
class Movie {
    String title;
    String studio;
    String rating;

    // a) Write a constructor for the class Movie, which takes a String
    // representing the title of the movie, a String representing the studio,
    // and a String representing the ratin
    // as its arguments, and sets the respective class variables to these values.

    Movie(String title, String studio, String rating) {
        this.studio = studio;
        this.title = title;
        this.rating = rating;
    }

    // b) Write a second constructor for the class Movie, which takes a String
    // representing the title of the movie and a String representing the studio
    // as its arguments, and sets the respective
    // class variables to these values, while the class variable ratingis set to
    // "PG".
    Movie(String title, String studio) {
        this.studio = studio;
        this.title = title;
        rating = "PG";
    }

    // c) Write a method getPG, which takes an array of base type Movies its
    // argument, and returns a new array of only those movies in the input array
    // with a rating of "PG". You may Assume the input array is full of Movie
    // instances.The returned array need not be full.
    public static Movie[] getPG(Movie[] mov) {
        Movie[] pgMov = new Movie[mov.length];
        int newArrayIndex = 0;
        for (int i = 0; i < mov.length; i++) {
            if (mov[i].rating.equals("PG")) {
                pgMov[newArrayIndex] = mov[i];
                newArrayIndex++;
            }
        }
        return pgMov;
    }

    // * d) Write a piece of code that creates an instance of the class Movie with
    // the title
    Movie mov = new Movie("Casino Royale", "Eon Productions", "PG-13");
}
