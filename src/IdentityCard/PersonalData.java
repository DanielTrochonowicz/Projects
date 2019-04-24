package IdentityCard;

public class PersonalData {

    private String name;
    private String surmane;
    private int day;
    private int year;
    private String month;
    private String pesel;
    private String address;
    private String identityCardNumber;
    private String country;


    public String getName() {
        return name;
    }

    public String getSurmane() {
        return surmane;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getPesel() {
        return pesel;
    }

    public String getAddress() {
        return address;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }
    public String getCountry() {
        return country;
    }

    public PersonalData(PersonalDataBuild personalData) {
        this.name = personalData.name;
        this.surmane = personalData.surmane;
        this.day = personalData.day;
        this.year = personalData.year;
        this.month = personalData.month;
        this.pesel = personalData.pesel;
        this.address = personalData.address;
        this.identityCardNumber = personalData.identityCardNumber;
        this.country = personalData.country;
    }


    @Override
    public String toString() {

        return "\n" + "PERSONAL DATA:" + "\n" +
                "Name:" + name + "\n" +
                "Surmane:" + surmane + "\n" +
                "Day:" + day + "\n" +
                "Month:" + month + "\n" +
                "Year:" + year + "\n" +
                "Month:" + month + "\n" +
                "Country:" + country + "\n" +
                "Address:" + address + "\n" +
                "Pesel:" + pesel + "\n" +
                "IdentityCardNumber:" + identityCardNumber + "\n" ;
    }
    public static class PersonalDataBuild{


        private String name;
        private String surmane;
        private int day;
        private int year;
        private String month;
        private String pesel;
        private String address;
        private String identityCardNumber;
        private String country;


        public PersonalDataBuild(String name, String surmane) {
            this.name = name;
            this.surmane = surmane;
        }

        public PersonalDataBuild setDay(int day) {
            this.day = day;
            return this;
        }


        public PersonalDataBuild setYear(int year) {
            this.year = year;
            return this;
        }

        public PersonalDataBuild setMonth(String month) {
            this.month = month;
            return this;
        }

        public PersonalDataBuild setPesel(String pesel) {
            this.pesel = pesel;
            return this;
        }

        public PersonalDataBuild setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonalDataBuild setIdentityCardNumber(String identityCardNumber) {
            this.identityCardNumber = identityCardNumber;
            return this;
        }

        public PersonalDataBuild setCountry(String country) {
            this.country = country;
            return this;
        }

        public PersonalData personalDataBuild(){
            return new PersonalData(this);
        }

    }
}

