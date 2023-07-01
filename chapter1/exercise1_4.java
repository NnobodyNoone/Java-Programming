public class exercise1_4 {
    public static void main(String[] args) {
        int one_b=7;
        int one_d=13;
        int one_im=45;
        int current_pop=312032486;
        int one_year=365*24*60*60;
        one_year=one_year*1;

        int birth_per_year=one_year/one_b;
        int death_per_year=one_year/one_d;
        int immi_per_year=one_year/one_im;

        int one_in=birth_per_year+immi_per_year-death_per_year;
        int five_in=one_in*5;

        int total_pop=current_pop+five_in;



        System.out.println(total_pop);
    }
}
