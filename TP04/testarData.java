public class testarData {
    public static void main(String[] args) {

        Data classeData = new Data();

        classeData.apresentaDataAtual();

        System.out.println("Data: " + classeData.mostra1());
        System.out.println("Data: " + classeData.mostra2());
        System.out.println("Dias Corridos: " + classeData.diasTranscorridos());
        System.out.println("Dia: " + classeData.retDia());
        System.out.println("Mes: " + classeData.retMes());
        System.out.println("Ano: " + classeData.retAno());

        if (classeData.bissexto()) {
            System.out.print("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

        System.out.println("--------------------------------------");

        classeData.entraDia();
        classeData.entraMes();
        classeData.entraAno();

        System.out.println("Data: " + classeData.mostra1());
        System.out.println("Data: " + classeData.mostra2());
        System.out.println("Dias Corridos: " + classeData.diasTranscorridos());
        System.out.println("Dia: " + classeData.retDia());
        System.out.println("Mes: " + classeData.retMes());
        System.out.println("Ano: " + classeData.retAno());

        if (classeData.bissexto()) {
            System.out.print("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

    }
}
