import java.util.Date;
public class Timer{
    private Date start;

    public Timer()
    {
        reset();
    }
    public long getTime()
    {
        Date now = new Date();
        long millis = now.getTime() - start.getTime();
        return millis;
    }
    public void reset()
    {
        start = new Date();
    }
    public String toString( boolean mili )
    {
        long millis = getTime();

        long hours = millis / 1000 / 60 / 60;
        millis -= hours * 1000 * 60 * 60;

        long minutes = millis / 1000 / 60;
        millis -= minutes * 1000 * 60;

        long seconds = millis / 1000;
        millis -= seconds * 1000;

        StringBuffer time = new StringBuffer();
        if( hours > 0 )
            time.append( hours + ":" );
        if( hours > 0 && minutes < 10 )
            time.append( "0" );
        time.append( minutes + ":" );
        if( seconds < 10 )
            time.append( "0" );
        time.append( seconds );

        if( mili ){
            time.append( "." );
            if( millis < 100 )
                time.append( "0" );
            if( millis < 10 )
                time.append( "0" );
            time.append( millis );
        }

        return time.toString();
    }
    @Override
    public String toString()
    {
        return toString( true );
    }
}