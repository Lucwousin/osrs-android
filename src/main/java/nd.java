import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class nd {
    static Calendar ae = null;
    static final String[] al = null;
    static final String[][] ax = null;
    public static final int bv = 37;

    static {
        nd.ax = new String[][]{new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, new String[]{"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, new String[]{"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, new String[]{"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, new String[]{"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, new String[]{"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
        nd.al = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        Calendar.getInstance();
        nd.ae = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    nd() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("nd.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static String al(long arg8) {
        nd.ae.setTime(new Date(arg8));
        int v8 = nd.ae.get(7);
        int v9 = nd.ae.get(5);
        int v0 = nd.ae.get(2);
        int v1 = nd.ae.get(1);
        int v3 = nd.ae.get(11);
        int v4 = nd.ae.get(12);
        int v5 = nd.ae.get(13);
        return nd.al[v8 - 1] + ", " + v9 / 10 + v9 % 10 + "-" + nd.ax[0][v0] + "-" + v1 + " " + v3 / 10 + v3 % 10 + ":" + v4 / 10 + v4 % 10 + ":" + v5 / 10 + v5 % 10 + " GMT";
    }
}

