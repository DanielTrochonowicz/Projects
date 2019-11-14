package alkomat;

import java.text.DecimalFormat;

public class Alcohol {

    private String name;
    private float alkoPower;

    public static final float THE_DENSITY_RATIO_OF_ETHYL_ALCOHOL = 0.789f;

    public Alcohol(String name, float alkoPower) {
        this.name = name;
        this.alkoPower = alkoPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAlkoPower() {
        return alkoPower;
    }

    public void setAlkoPower(float alkoPower) {
        this.alkoPower = alkoPower;
    }

    String calculatePerMil(int quantity, int weight, boolean male){

        //promile=ilosc wypitego alko/(wsp. 0,7 facet, 0.6 kobieta *masa)

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        float genderRatel;
        String gender = "";

        if (male){
            gender = "Man";
            genderRatel = 0.7f;
        }else {
            gender = "Woman";
            genderRatel = 0.6f;
        }
        float power = (float) (quantity * alkoPower * THE_DENSITY_RATIO_OF_ETHYL_ALCOHOL) / (weight * genderRatel);

        String description = ("" + gender + " (" + weight + " kg) will have " + (decimalFormat.format(power + 0.01f)
                + "‰ blood-alcohol content after drinking " + quantity + " [ml] of " + getName()));

        return  description;
    }
}
