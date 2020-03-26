package indexof.nauka;

public class IndexOfNauka {
    public static void main(String[] args) {

        String text = "W Szczebrzeszynie chrząszcz brzmi w trzcinie";

        int szukam = text.indexOf("trz");
        System.out.println(szukam);

        boolean czysięzaczyna = text.startsWith("P");
        System.out.println(czysięzaczyna);

        String wyciętytekst = text.substring(20);
        System.out.println(wyciętytekst);
    }
}
