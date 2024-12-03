
public class Primes {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] boolArr = new boolean[n + 1];

        for (int i = 2; i < n+1; i++) {
            boolArr[i] = true;
        }
        int i = 0;
        while (i < n + 1) {
            if (boolArr[i] == false) {
                i++;
            } else if (boolArr[i] == true) {
                for (int j = i + 1; j < n + 1; j++) {
                    if (j % i == 0) {
                        boolArr[j] = false;
                    }
                }
                i++;
            }
        }
        String output = "Prime numbers up to " + n + ":";
        int counter = 0;
        for (int j = 0; j < boolArr.length; j++) {
            if (boolArr[j] == true) {
                output += ("\n" + j);
                counter++;
            }
        }
        if (counter > 0) {
            double primesPercentage = ((double) counter / n) * 100;
            System.out.print(output);
            System.out.println("\nThere are " + counter + " primes between 2 and " + n + " (" + (int) primesPercentage + "% are primes)");
        }

    }
}
