import java.util.Scanner;

/**
 * @author Douglas Reis e Lucas Aquino
 */

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    public ConsultaAgendada() {
        ConsultaAgendada.quantidade++;
        Data classeData = new Data();
        this.data = classeData;
        Hora classeHora = new Hora();
        this.hora = classeHora;
        this.setNomePaciente();
        this.setNomeMedico();
    }

    public ConsultaAgendada(int hora, int min, int seg, int dia, int mes, int ano, String paciente, String medico) {
        ConsultaAgendada.quantidade++;
        Hora classeHora = new Hora(hora, min, mes);
        this.hora = classeHora;
        Data classeData = new Data(dia, mes, ano);
        this.data = classeData;
        this.nomePaciente = paciente;
        this.nomeMedico = medico;

    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        ConsultaAgendada.quantidade++;
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setData(int ano, int mes, int dia) {
        this.data.setAno(ano);
        this.data.setMes(mes);
        this.data.setDia(dia);
    }

    public void setHora() {
        this.hora.setHor();
        this.hora.setMin();
        this.hora.setSeg();
    }

    public void setHora(int hora, int min, int seg) {
        this.hora.setHor(hora);
        this.hora.setMin(min);
        this.hora.setSeg(seg);
    }

    public void setNomePaciente() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome do paciente: ");
            this.setNomePaciente(scan.nextLine());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomeMedico() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome do medico: ");
            this.setNomeMedico(scan.nextLine());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public static int getAmostra() {
        return ConsultaAgendada.quantidade;
    }

    public String getData() {
        return this.data.getDataFormatada();
    }

    public String getHora() {
        return this.hora.getHora1();
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

}
