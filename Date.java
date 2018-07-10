public class Date {
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int day;
    private int month;
    private int year;
    Date(int day,int month,int year){
        if(day>0&&day<31) {
            this.day = day;
        }
        else{
            System.out.println("invalid day");
        }
        if(month>0&&month<12) {
            this.month = month;
        }
        else{
            System.out.println("invalid month");
        }
        if(year>0&&year<2018) {
            this.year = year;
        }
        else{
            System.out.println("invalid year");
        }
    }
    int maxDays() {
        int max = daysInMonth[this.month - 1];
        // correction for Feb
        return max;
    }

    public void addDays(int n) {
        int day = this.day += n;
        int month = this.month;
        int year = this.year;
        while (day > maxDays()) {
            day = day - maxDays();
            month++;
            if (month > 12) {
                year++;
                month = 1;
            }
        }
        System.out.println(date+"/"+month+"/"+year);
    }
    public static void main(String[] args){
        Date obj= new Date(04,10,1996);
        obj.addDays(30);
    }
}
