package holiday;

public class SelectedPackage {

    private TransportToThePlaceOfHolidays transportToThePlaceOfHolidays = null;
    private HolidayProgram holidayProgram = null;
    private HolidayPackage holidayPackage = null;

    public SelectedPackage(String holidays){

        if (holidays.equalsIgnoreCase("Spain")){
            holidayPackage = new HolidayPackageAverage();
            transportToThePlaceOfHolidays = new TransportToThePlaceOfHolidaysByPlaneBus();
            holidayProgram = new HolidayProgramFreeTime();

        }else if (holidays.equalsIgnoreCase("France")){
            holidayPackage = new HolidayPackageStandard();
            transportToThePlaceOfHolidays= new TransportToThePlaceOfHolidaysByCar();
            holidayProgram = new HolidayProgramEveningOutingAtTheParty();

        }else if (holidays.equalsIgnoreCase("China")){
            holidayPackage = new HolidayPackageMaximum();
            transportToThePlaceOfHolidays = new TransportToThePlaceOfHolidaysByPlane();
            holidayProgram = new HolidayProgramSightseeing();

        }else if (holidays.equalsIgnoreCase("Poland")) {
            holidayPackage = new HolidayPackageMaximum();
            transportToThePlaceOfHolidays = new TransportToThePlaceOfHolidaysByPlane();
            holidayProgram = new HolidayProgramSightseeing();
        }
    }
    public void holidays(){
        holidayProgram.holidayProgram();
        transportToThePlaceOfHolidays.transportToThePlaceOfHolidays();
        holidayPackage.holidayPackage();
    }
}
