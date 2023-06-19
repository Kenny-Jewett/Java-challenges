import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;

public class LogLevels {


        public static String message(String logLine) {
           String[] arrOfStr = logLine.split(":");
           String logstr = arrOfStr[1];

            return logstr.trim();
        }

        public static String logLevel(String logLine) {
            String[] arrOfStr = logLine.split("]");
            String indexStr = arrOfStr[0].toLowerCase();
            return indexStr.subSequence(1, indexStr.length()).toString();
        }

        public static String reformat(String logLine) {
            String[] indexStr = logLine.split(":");
            String logLevel = indexStr[0];
            String formatLog = logLevel.toLowerCase().substring(1, logLevel.length() - 1);
            String messageFormat = indexStr[1].trim();
            return messageFormat + " (" + formatLog + ")";
        }

}
