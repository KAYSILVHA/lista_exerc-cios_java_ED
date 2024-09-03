package Filas.ex_2;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    private Queue<PrintJob> queue;

    public PrintQueue() {
        this.queue = new LinkedList<>();
    }

    public void addPrintJob(PrintJob printJob) {
        queue.add(printJob);
        System.out.println("Trabalho de impressão " + printJob.getDocumentName() + " adicionado à fila.");
    }

    public void processNextJob() {
        PrintJob printJob = queue.poll();
        if (printJob != null) {
            System.out.println("Processando trabalho de impressão: " + printJob.getDocumentName());
        } else {
            System.out.println("Nenhum trabalho de impressão na fila.");
        }
    }

    public void listPrintJobs() {
        if (queue.isEmpty()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            System.out.println("Trabalhos de impressão na fila:");
            for (PrintJob printJob : queue) {
                System.out.println(printJob.getDocumentName());
            }
        }
    }
}
