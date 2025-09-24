
package displaying.time;

public class DisplayingTime {

    public static void main(String[] args) {
    Long totalMillissecounds=System.currentTimeMillis();
    Long totalsecounds=totalMillissecounds/1000;
    Long currentsecounds=totalsecounds%60;
    Long totalminuts=totalsecounds/60;
    Long currentminutes=totalminuts%60;
    Long totalhours=currentminutes/60;
    long currenthours=totalhours%24;
        System.out.println("current time is"+currenthours+":"+currentminutes);
    
    }
    
}
