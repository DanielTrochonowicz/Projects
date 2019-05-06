package IdentityCard;

public class MainIdentityCard {

    public static void main(String[] args) {

        PersonalData person = new PersonalData

                .PersonalDataBuild("Daniel", "Kowalski")
                .setDay(18)
                .setMonth("Lipiec")
                .setYear(1986)
                .setCountry("Poland")
                .setAddress("Ogrodowa 4, 05-200 Wołomin")
                .setPesel("84075805012")
                .setIdentityCardNumber("Axj9039787")
                .personalDataBuild();
        System.out.println(person.toString());
    }
}


