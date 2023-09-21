package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String descricaoAtracao) {
        eventosMap.put(data, new Evento(nomeEvento, descricaoAtracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        /* coleções distintas
        Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();
        // não retornada a data
        eventosMap.get()*/

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O Próximo evento: "+ proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 15), "Evento 1", "Atração 01");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.NOVEMBER, 15), "Evento 2", "Atração 02");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 05), "Evento 3", "Atração 03");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.MARCH, 12), "Evento 4", "Atração 04");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
