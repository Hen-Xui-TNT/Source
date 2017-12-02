/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.frm_main;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author HuyNhan
 */
public class BLL_clock {
    public static void clock() {
        Thread clock = new Thread() {
        public void run() {
   try {
    while (true) {
     Calendar cal = new GregorianCalendar();
     int second = cal.get(Calendar.SECOND);
     int minute = cal.get(Calendar.MINUTE);
     int hour = cal.get(Calendar.HOUR_OF_DAY);
     String thu;
     int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
     if(dayOfWeek==1){thu ="Chủ nhật"; }
     else{thu ="Thứ "+ Integer.toString(dayOfWeek);}
     int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
     int month = cal.get(Calendar.MONTH);
     int year = cal.get(Calendar.YEAR);

        frm_main.lbl_gio.setText(hour + ":" + minute + ":" + second);
    // timeSystemBD.setText(hour + ":" + minute + ":" + second);
     //timeSystemTK.setText(hour + ":" + minute + ":" + second);
        frm_main.lbl_ngay.setText(thu + " ngày " + dayOfMonth + " tháng " + (month + 1) + " năm " + year);
     //calendarTK.setText(thu + dayOfWeek + " ngày " + dayOfMonth + " tháng " + (month + 1) + " năm " + year);
     sleep(1000);
    }
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
 };
 clock.start();
}
}
