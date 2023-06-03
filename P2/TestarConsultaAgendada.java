import java.util.ArrayList;
import java.util.List;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class TestarConsultaAgendada {
    public static void main(String[] args) {

        List<String> conteudoArquivo = new ArrayList();

        ConsultaAgendada p1 = new ConsultaAgendada(10, 15, 30, 14, 10, 2023, "Douglas", "Marcos");
        System.out.println("---------- AGENDAMENTO DE CONSULTA ----------");
        conteudoArquivo.add("---------- AGENDAMENTO DE CONSULTA ----------");
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        conteudoArquivo.add("\nNome do paciente: " + p1.getNomePaciente());
        System.out.println("Data: " + p1.getData());
        conteudoArquivo.add("\nData: " + p1.getData());
        System.out.println("Horario: " + p1.getHora());
        conteudoArquivo.add("\nHorario: " + p1.getHora());
        System.out.println("Medico: " + p1.getNomeMedico());
        conteudoArquivo.add("\nMedico: " + p1.getNomeMedico());

        System.out.println("---------- AGENDAMENTO DE CONSULTA ----------");
        ConsultaAgendada p2 = new ConsultaAgendada();
        conteudoArquivo.add("\n---------- AGENDAMENTO DE CONSULTA ----------");
        System.out.println("Nome do paciente: " + p2.getNomePaciente());
        conteudoArquivo.add("\nNome do paciente: " + p2.getNomePaciente());
        System.out.println("Data: " + p2.getData());
        conteudoArquivo.add("\nData: " + p2.getData());
        System.out.println("Horario: " + p2.getHora());
        conteudoArquivo.add("\nHorario: " + p2.getHora());
        System.out.println("Medico: " + p2.getNomeMedico());
        conteudoArquivo.add("\nMedico: " + p2.getNomeMedico());

        System.out.println("---------- AGENDAMENTO DE CONSULTA ----------");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        conteudoArquivo.add("\n---------- AGENDAMENTO DE CONSULTA ----------");
        System.out.println("Nome do paciente: " + p1.getNomePaciente());
        conteudoArquivo.add("\nNome do paciente: " + p1.getNomePaciente());
        System.out.println("Data: " + p1.getData());
        conteudoArquivo.add("\nData: " + p1.getData());
        System.out.println("Horario: " + p1.getHora());
        conteudoArquivo.add("\nHorario: " + p1.getHora());
        System.out.println("Medico: " + p1.getNomeMedico());
        conteudoArquivo.add("\nMedico: " + p1.getNomeMedico());

        System.out.println("Quantidade de consultas: " + ConsultaAgendada.getAmostra());
        conteudoArquivo.add("\nQuantidade de consultas: " + ConsultaAgendada.getAmostra());

        Path p = Paths.get("./ConsultaAgendada.txt");
        String conteudo = "";

        for (int i = 0; i < conteudoArquivo.size(); i++) {
            conteudo += conteudoArquivo.get(i);
        }

        byte data[] = conteudo.getBytes();

        try (OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(p, CREATE, APPEND))) {
            out.write(data, 0, data.length);
        } catch (IOException x) {
            System.err.println(x);
        }

    }
}
