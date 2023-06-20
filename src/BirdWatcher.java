
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean isCountZero = false;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                isCountZero = true;
            } else {
                return isCountZero;
            }
        }
        return isCountZero;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int today = getToday();

        if(numberOfDays > 6) {
            numberOfDays = 6;
            count = count + today;

            for(int i = 0; i < numberOfDays; i++) {
                count = count + birdsPerDay[i];
            }
            return count;
        } else {
            for(int i = 0; i < numberOfDays; i++) {
                count = count + birdsPerDay[i];
            }
            return count;
        }
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4) {
                count++;
            }
        }
        return count;
    }
}
