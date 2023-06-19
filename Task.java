package java_sem_4;

import java.util.ArrayDeque;
import java.util.LinkedList;



public class Task {
    
    /* Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
    1) Умножьте два числа и верните произведение в виде связанного списка.
    2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.

    Даны два Deque, цифры в обратном порядке.
    [3,2,1] - пример Deque
    [5,4,3]- пример второго Deque
    1) 123 * 345 = 42 435
    Ответ всегда - связный список, в обычном порядке
    [4,2,4,3,5] - пример ответа*/
    public static void main(String[] args) {
        Integer number1 = 123;
        Integer number2 = -345;

                            //Так как на лекции было плохо рассмотрены оформление функций описал код как смог.

        ArrayDeque<Integer> qu1 = new ArrayDeque<>();               //Преобразует первое число в обратную очередь
        if (number1<0) {
            qu1.addFirst(-1);
            number1 =-number1;
        }
        while (number1>0) {
            qu1.addFirst(number1%10);
            number1=number1/10;
        }

        ArrayDeque<Integer> qu2 = new ArrayDeque<>();               //Преобразует второе число в обратную очередь
        if (number2<0) {
            qu2.addFirst(-1);
            number2 =-number2;
        }
        while (number2>0) {
            qu2.addFirst(number2%10);
            number2=number2/10;
        }


        int a= 0;                                                   //Преобразует первую обратную очередь в число
        while(qu1.peek()!=null){
            if (qu1.peek() == (-1))  { 
                a=-a;
                break;
            }
            a = a +qu1.pop();
            if ((qu1.peek()!=null)&&(qu1.peek()!= -1))  {
                a=a*10;
            }
        }
        int b= 0;                                                   //Преобразует вторую обратную очередь в число
        while(qu2.peek()!=null){
            if (qu2.peek() == (-1))  { 
                b=-b;
                break;
            }
            b = b +qu2.pop();
            if ((qu2.peek()!=null)&&(qu2.peek()!= -1))  {
                b=b*10;
            }
        }

        int res = a * b;                                            //Производит действие
        LinkedList <Integer> ld = new LinkedList<>();               //Преобразует результат в связный список
        if (res<0) {
            ld.addFirst(-1);
            res =-res;
        }
        while (res>0) {
            ld.addFirst(res%10);
            res=res/10;
        }


        
        int sum = a + b;                                            //Производит действие
        LinkedList <Integer> ldSum = new LinkedList<>();            //Преобразует результат в связный список
        if (sum<0) {
            ldSum.addFirst(-1);
            sum =-sum;
        }
        while (sum>0) {
            ldSum.addFirst(sum%10);
            sum=sum/10;
        }

      
        System.out.println(ld);                                     // Вывод результата
        System.out.println(ldSum);
    }
}
