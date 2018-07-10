public class Date {
    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int day;
    private int month;
    private int year;
    Date(int d,int m,int y){
        if(d>0&&d<31) {
            day = d;
        }
        else{
            System.out.println("invalid day");
        }
        if(m>0&&m<12) {
            month = m;
        }
        else{
            System.out.println("invalid month");
        }
        if(y>0&&y<2018) {
            year = y;
        }
        else{
            System.out.println("invalid year");
        }
    }
    int maxDays() {
        int md = daysInMonth[month - 1];
        // correction for Feb
        return md;
    }

    public void addDays(int n) {
        int d = this.day += n;
        int m = this.month;
        int y = this.year;
        while (d > maxDays()) {
            d = d - maxDays();
            m++;
            if (m > 12) {
                y++;
                m = 1;
            }
        }
        System.out.println(d+"/"+m+"/"+y);
    }
    public static void main(String[] args){
        Date obj= new Date(04,10,1996);
        obj.addDays(30);
    }
}
