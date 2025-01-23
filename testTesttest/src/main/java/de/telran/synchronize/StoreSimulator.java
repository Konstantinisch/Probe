package de.telran.synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class StoreSimulator  {
    //1 уровень сложности: 1. У вас в магазине распродажа. К вам набежало 10 000 клиентов и вы
    // пытаетесь корректно всех обслужить с учетом того,
    //что одновременно у вас внутри магазина может находиться не более 10
    // покупателей(согласно карантинным нормам)
    //и время обслуживания одного покупателя занимает 30 секунд(откорректируйте под себя).
    // Сымитируйте данный процесс
    //работы и подсчитайте за какой период времени вы сможете обслужить данный объем покупателей?
    //Отдельный покупатель - отдельный поток. Какой синхронизатор с библиотеки concurrent Вы бы использовали?
    static final int MAXCOUNTERINSIDE=10;
    static final int MAXCOUNTEROUTSIDE=10_000;
    static final int TIMEOFONE=10;

    public static void main(String[] args) {
        Semaphore semaphore= new Semaphore(MAXCOUNTERINSIDE);
        ExecutorService executorService = Executors.newFixedThreadPool(MAXCOUNTEROUTSIDE);
        long startTime =System.currentTimeMillis();
        for (int i = 1; i <=MAXCOUNTEROUTSIDE ; i++) {
           final int customerId = i;
            executorService.submit(()->{
                try {
                    semaphore.acquire();
                    waitCustomers(customerId);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    semaphore.release();
                }
            });
        }
        executorService.shutdown();
        long endTime = (System.currentTimeMillis()-startTime)/1000;
        System.out.println("Time of service");
    }

    private static void waitCustomers(int customerId) throws InterruptedException {
        System.out.println("Service of customer "+customerId);
        Thread.sleep(TIMEOFONE*1000);
        System.out.println("End of service "+customerId);

    }
}
