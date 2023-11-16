package sec03.chap11;

class Date{
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Date){
            Date date = (Date) obj;
            if(this.day == date.day && this.month == date.month && this.year == date.year){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return day;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        Date date1 = new Date(16,11,2023);
        Date date2 = new Date(16,11,2023);
        Date date3 = new Date(17,11,2023);

        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
        System.out.println(date3.hashCode());

        System.out.println(System.identityHashCode(date1));
        System.out.println(System.identityHashCode(date2));
        System.out.println(System.identityHashCode(date3));
    }
}
