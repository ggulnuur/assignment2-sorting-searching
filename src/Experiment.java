public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();

        searcher.search(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("\n==============================");
            System.out.println("Array size: " + size);

            // RANDOM ARRAY
            int[] randomArr = sorter.generateRandomArray(size);

            // SORTED ARRAY
            int[] sortedArr = randomArr.clone();
            sorter.advancedSort(sortedArr);

            // ---- SORTING RANDOM ----
            System.out.println("\n--- RANDOM ARRAY ---");

            long bubbleTime = measureSortTime(randomArr, "basic");
            long mergeTime = measureSortTime(randomArr, "advanced");

            System.out.println("Bubble Sort: " + bubbleTime);
            System.out.println("Merge Sort: " + mergeTime);

            if (bubbleTime < mergeTime) {
                System.out.println("Bubble is faster");
            } else {
                System.out.println(" Merge is faster");
            }

            // ---- SORTING SORTED ----
            System.out.println("\n--- SORTED ARRAY ---");

            long bubbleTimeSorted = measureSortTime(sortedArr, "basic");
            long mergeTimeSorted = measureSortTime(sortedArr, "advanced");

            System.out.println("Bubble Sort: " + bubbleTimeSorted);
            System.out.println("Merge Sort: " + mergeTimeSorted);

            // ---- SEARCH ----
            int target = randomArr[size / 2];

            long searchTime = measureSearchTime(randomArr, target);
            System.out.println("\nLinear Search time: " + searchTime);
        }
    }
}