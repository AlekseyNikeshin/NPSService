package tech.itpark;

public class NPSService {
    public double nps(int[] votes) {
        int detractors = 0;
        int promouters = 0;
        int neutrals = 0;
        for (int vote : votes) {
            if (vote >= 9) {
                promouters++;
            }
            if (vote == 7 || vote == 8) {
                neutrals++;
            }
            if (vote < 7) {
                detractors++;
            }
        }
            if (promouters == detractors) {
                return 0;
            }

        int quantity = promouters + detractors + neutrals;
        return (promouters*100.0/quantity) - (detractors*100.0/quantity);
    }
}
