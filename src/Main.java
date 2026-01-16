import config.DbConfig;
import service.EventService;
import service.EventServiceImpl;
import util.InputUtil;
import util.ViewUtil;
import view.EventView;

public class Main {
    public static void main(String[] args) {
        DbConfig.init();
        EventService eventService = new EventServiceImpl();
        EventView eventView = new EventView();

        do{
            ViewUtil.header();
            ViewUtil.mainMenu();
            String menuOpt = InputUtil.getText("Enter Option : ");
            if(menuOpt.equals("1")){
                eventView.eventViewMenu(eventService);
            }else if(menuOpt.equals("2")){
               do {
                   ViewUtil.printMenuParticipant();
                   String partMenu = InputUtil.getText("Enter Option : ");
                   if (partMenu.equals("0")) break;
               }while (true);
            }

            if (menuOpt.equals("0")) break;
        }while (true);

    }
}