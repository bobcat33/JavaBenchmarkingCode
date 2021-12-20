public class Main {
    public static void main(String[] args) {
        int numLoops = 10; // TODO set number of loops

        long[] times = new long[numLoops];
        long start, finish;

        // Variable init start ----------------------

        // TODO variable initialisation here

        // Variable init finish ---------------------

        for (int i = 0; i < numLoops; i++) {
            System.out.println("Started test " + (i + 1));
            start = System.currentTimeMillis();

            // Benchmark code start ----------------------

            // TODO benchmark code here

            // Benchmark code finish ---------------------

            finish = System.currentTimeMillis();
            times[i] = finish - start;
            System.out.println("Test completed in " + times[i] + "ms");
        }

        long total = 0;
        for (long time : times)
            total += time;

        System.out.println("Process took an average of " + (total / numLoops) + "ms repeated " + numLoops + " times.");

    }
}
