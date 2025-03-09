import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get the current time in UTC (GMT)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmtTime);
        
        // Get the current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime);
        
        // Get the current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Time in PST: " + pstTime);
    }
}

/*
Input: (No input required, program fetches system time automatically)

Output:
Current Time in GMT: 2025-03-09T08:30:45.123Z[GMT]
Current Time in IST: 2025-03-09T14:00:45.123+05:30[Asia/Kolkata]
Current Time in PST: 2025-03-09T00:30:45.123-08:00[America/Los_Angeles]
*/
