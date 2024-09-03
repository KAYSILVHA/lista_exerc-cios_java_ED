package Filas.ex_1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSystem {
    private Queue<Client> queue;

    public QueueSystem() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Client client) {
        queue.add(client);
        System.out.println("Cliente " + client.getName() + " entrou na fila.");
    }

    public Client dequeue() {
        Client client = queue.poll();
        if (client != null) {
            System.out.println("Cliente " + client.getName() + " está sendo atendido.");
        } else {
            System.out.println("Nenhum cliente na fila para atendimento.");
        }
        return client;
    }

    public void listQueue() {
        if (queue.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila:");
            for (Client client : queue) {
                System.out.println(client.getName());
            }
        }
    }
}
