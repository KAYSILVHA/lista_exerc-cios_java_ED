package Filas.ex_3;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessQueue {
    private Queue<Process> queue;

    public ProcessQueue() {
        this.queue = new LinkedList<>();
    }


    public void addProcess(Process process) {
        queue.add(process);
        System.out.println("Processo " + process.getProcessId() + " adicionado à fila.");
    }

    public Process removeProcess() {
        Process process = queue.poll();
        if (process != null) {
            System.out.println("Processo " + process.getProcessId() + " está sendo executado.");
        } else {
            System.out.println("Nenhum processo na fila para execução.");
        }
        return process;
    }

    public void listProcesses() {
        if (queue.isEmpty()) {
            System.out.println("A fila de processos está vazia.");
        } else {
            System.out.println("Processos na fila:");
            for (Process process : queue) {
                System.out.println(process.getProcessId());
            }
        }
    }
}
