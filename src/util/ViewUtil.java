package util;


import model.Event;
import model.enums.EventStatus;
import model.enums.EventType;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class ViewUtil {


    public static void header(){
        System.out.println("""
                 _____             _      _____                               _  \s
                |   __|_ _ ___ ___| |_   |     |___ ___ ___ ___ _____ ___ ___| |_\s
                |   __| | | -_|   |  _|  | | | | .'|   | . | -_|     | -_|   |  _|
                |_____|\\_/|___|_|_|_|    |_|_|_|__,|_|_|_  |___|_|_|_|___|_|_|_| \s
                                                       |___|                     \s
                """);
    }



    public static void mainMenu(){
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        table.setColumnWidth(0, 50, 200);
        table.addCell("Menu", cellStyle);
        table.addCell("1 ) Manage Events", cellStyle);
        table.addCell("2 ) Manage Participants", cellStyle);
        table.addCell("0 ) Exit", cellStyle);
        print(table.render(), true);    }

    public static void printSearchEventMenu() {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.setColumnWidth(0, 50, 100);
        table.addCell("Search Options", cellStyle);
        table.addCell("1)By Code  2)By Name  3)By Type  4)By Date", cellStyle);
        table.addCell("0)Exit", cellStyle);
        print(table.render(), true);
    }


    public static void printMenuEvent() {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.setColumnWidth(0, 50, 100);
        table.addCell("Event Menu", cellStyle);
        table.addCell("1)List All  2)Search  3)Add new  4)Update", cellStyle);
        table.addCell("5)Delete  0)Exit", cellStyle);
        print(table.render(), true);
    }

    public static void printMenuParticipant() {
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.setColumnWidth(0, 50, 100);
        table.addCell("Participant Menu", cellStyle);
        table.addCell("1)List All  2)Search  3)Add new  4)Update", cellStyle);
        table.addCell("5)Delete  0)Exit", cellStyle);
        print(table.render(), true);
    }

    public static void print(String text, boolean isNewLine) {
        if (isNewLine)
            System.out.println(text);
        else
            System.out.print(text);
    }

    public static void printHeader(String text) {
        Table table = new Table(1,
                BorderStyle.UNICODE_ROUND_BOX_WIDE);
        table.addCell(text);
        print(table.render(), true);
    }

    public static void printEventList(List<Event> eventList) {
        // 1. Create table with 6 columns and border style
        Table table = new Table(8, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        // 2. Add table header
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("TYPE");
        table.addCell("START DATE");
        table.addCell("END DATE");
        table.addCell("LOCATION");
        table.addCell("ORGANIZER NAME");
        table.addCell("STATUS");


        // 3. Add table data
        for (Event event : eventList) {
            table.addCell(event.getEventCode());
            table.addCell(event.getEventName());
            table.addCell(event.getEventType().toString());
            table.addCell(event.getStartDate().toString());
            table.addCell(event.getEndDate().toString());
            table.addCell(event.getLocation());
            table.addCell(event.getOrganizerName());
            table.addCell(event.getStatus().toString());
        }

        // 4. Render table
        print(table.render(), true);
    }

    public static void printEventDetail(List<Event> eventList) {
        // 1. Create table with 6 columns and border style
        Table table = new Table(11, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        // 2. Add table header
        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("TYPE");
        table.addCell("START DATE");
        table.addCell("END DATE");
        table.addCell("LOCATION");
        table.addCell("ORGANIZER NAME");
        table.addCell("DESCRIPTION");
        table.addCell("STATUS");
        table.addCell("MAX PARTICIPANT");


        // 3. Add table data
        for (Event event : eventList) {

            table.addCell(event.getId().toString());
            table.addCell(event.getEventCode());
            table.addCell(event.getEventName());
            table.addCell(event.getEventType().toString());
            table.addCell(event.getStartDate().toString());
            table.addCell(event.getEndDate().toString());
            table.addCell(event.getLocation());
            table.addCell(event.getOrganizerName());
            table.addCell(event.getDescription());
            table.addCell(event.getStatus().toString());
            table.addCell(event.getMaxParticipant().toString());
        }
        // 4. Render table
        print(table.render(), true);
    }


    public static void printEventDetailNotList(Event event) {
        // 1. Create table with 6 columns and border style
        Table table = new Table(11, BorderStyle.UNICODE_ROUND_BOX_WIDE);

        // 2. Add table header
        table.addCell("ID");
        table.addCell("CODE");
        table.addCell("NAME");
        table.addCell("TYPE");
        table.addCell("START DATE");
        table.addCell("END DATE");
        table.addCell("LOCATION");
        table.addCell("ORGANIZER NAME");
        table.addCell("DESCRIPTION");
        table.addCell("STATUS");
        table.addCell("MAX PARTICIPANT");


        // 3. Add table data

            table.addCell(event.getId().toString());
            table.addCell(event.getEventCode());
            table.addCell(event.getEventName());
            table.addCell(event.getEventType().toString());
            table.addCell(event.getStartDate().toString());
            table.addCell(event.getEndDate().toString());
            table.addCell(event.getLocation());
            table.addCell(event.getOrganizerName());
            table.addCell(event.getDescription());
            table.addCell(event.getStatus().toString());
            table.addCell(event.getMaxParticipant().toString());
        // 4. Render table
        print(table.render(), true);
    }


    public static void printEnumStatus(){

        ViewUtil.printHeader("Event Status");

        for(EventStatus e : EventStatus.values()){
            System.out.println(e);
        }

    }

    public static void printEnumType(){

        ViewUtil.printHeader("Event Type");

        for(EventType e : EventType.values()){
            System.out.println(e);
        }

    }


}
