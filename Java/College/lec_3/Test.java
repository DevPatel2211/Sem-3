class time {
    int hours;
    int minutes;
    int seconds;
    static int count;
    {
        count++;
    }

    // Default constructor
    time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    // Parameterised Constructors
    public time(int hr, int min, int sec) {
        hours = hr;
        minutes = min;
        seconds = sec;
    }

    // copy constructor
    public time(time t) {
        hours = t.hours;
        minutes = t.minutes;
        seconds = t.seconds;
    }

    public void printTimeDetails() {
        System.out.println("Hours :" + hours + "\tMinutes :" + minutes + "\tSeconds :" + seconds);
    }

    public void addTime(time t1, time t2) {
        System.out.println("Hours :" + (t1.hours + t2.hours) + "\tMinutes :" + (t1.minutes + t2.minutes) + "\tSeconds :"
                + (t1.seconds + t2.seconds));
    }

    public void subtractTime(time t1, time t2) {
        System.out.println("Hours :" + (t1.hours - t2.hours) + "\tMinutes :" + (t1.minutes - t2.minutes) + "\tSeconds :"
                + (t1.seconds - t2.seconds));
    }

    static int countObjects() {
        return count;
    }
}

class Test {
    public static void main(String args[]) {
        time t1 = new time(5, 35, 45);
        time t2 = new time(5, 35, 45);
        time t3 = new time();
        time t4 = new time();
        time t5 = t1;
        time t6 = new time(t1);
        t1.printTimeDetails();
        t2.printTimeDetails();
        t3.addTime(t1, t2);
        t4.subtractTime(t1, t2);
        t5.printTimeDetails();
        t6.printTimeDetails();
        System.out.println(time.countObjects());
    }
}
