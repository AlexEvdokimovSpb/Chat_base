package java2.hw6;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Messenger implements Runnable{

    static Scanner sc = new Scanner(System.in);
    private DataOutputStream out;

    public Messenger(DataOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        while (true) {

            System.out.println("Введите сообщение: ");
            String message = sc.nextLine();
            try {
                out.writeUTF(message);
            } catch (IOException e) {
                System.out.println("Ошибка отправки сообщения");
            }

            if (message.equals("/end")) {
                System.out.println("Команда отключиться");
                break;
            }
        }
    }
 }
