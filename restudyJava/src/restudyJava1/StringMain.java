package sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringMain {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String yyyymmddStr = sf.format(cal.getTime());

		// 月初日取得
		Date firstDate = getFirstDate(cal.getTime());
		String firstDateStr = sf.format(firstDate);

		// 月末日取得
		Date lastDate = getLastDate(cal.getTime());
		String lastDateStr = sf.format(lastDate);

		// yymmdd形式で表示
		String startYymmdd = firstDateStr.substring(2);
		String lastMmdd = lastDateStr.substring(4);

		String filePath = "sample.xls";
		String[] filePathDott = filePath.split("\\.");

		filePath = filePathDott[0]
				.concat(startYymmdd)
				.concat("-")
				.concat(lastMmdd)
				.concat(".")
				.concat(filePathDott[1]);

		System.out.println(filePath);

	}

	public static Date getFirstDate(Date date) {

        if (date==null) return null;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int first = calendar.getActualMinimum(Calendar.DATE);
        calendar.set(Calendar.DATE, first);

        calendar.set(Calendar.HOUR_OF_DAY, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        calendar.set(Calendar.MILLISECOND, 000);

        return calendar.getTime();
    }

    // 月末日を返す
    public static Date getLastDate(Date date) {

        if (date==null) return null;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int last = calendar.getActualMaximum(Calendar.DATE);
        calendar.set(Calendar.DATE, last);

        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);

        return calendar.getTime();
    }


}
