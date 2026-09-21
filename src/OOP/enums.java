package OOP;

public class enums {
    enum week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;//These are enum constants

        week(){
            System.out.println("Constructor called for " + this);
            // this can;t be public or protected only private or default
            // and constructor will be called for all the set of objects in the enum
        }
    } //these are public static final and type is  week, no child classes can be made from this
    static void main() {
        week day = week.Wednesday;

        System.out.println(day);
        System.out.println(day.ordinal());

        for(week x : week.values()){
            System.out.println(x);
        }

        System.out.println(week.valueOf("Monday"));

    };

}
