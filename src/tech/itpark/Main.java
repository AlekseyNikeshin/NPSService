package tech.itpark;

public class Main {
    public static void main(String[] args) {
        int[] votes = {9, 10, 4,7,8,10,7,7, 9,10,10,10, 9};
        NPSService service = new NPSService();
        double nps = service.nps(votes);
        System.out.println(nps);
    }

}