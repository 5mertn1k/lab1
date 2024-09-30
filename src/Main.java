import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main m = new Main();
        //1.2
        System.out.println("Введите число, чтобы узнать сумму двух последних его цифр:");
        int chislo = in.nextInt();
        System.out.print("Сумма двух последних  цифр числа " + chislo + " = ");
        System.out.println(m.sumLastNums(chislo));
        //1.4
        System.out.println("Если число положительное-вернётся true, иначе-false.Введите число:");
        int pol = in.nextInt();
        System.out.println(m.isPositive(pol));
        //1.6
            System.out.println("Если будет введена большая буква из диапазона  ‘A’ - ‘Z’, то будет выведено true, иначе-false. Введите букву:");
            char bykva = in.next().charAt(0);
            System.out.println(m.isUpperCase(bykva));
        //1.8
        System.out.println("Введите 2 числа.Если какое-либо из этих чисел делится на другое без остатка, то будет выведено true, иначе - false. ");
        System.out.println("Введите 1 число:");
        int first = in.nextInt();
        System.out.println("Введите 2 число:");
        int second = in.nextInt();
        System.out.println(m.isDivisor(first, second));
        //1.10
        System.out.println("Введите 5 чисел, чтобы сложить последовательно их разряды единиц и получить ответ:");
        System.out.println("Введите 1 число:");
        int num1 = in.nextInt();
        System.out.println("Введите 2 число:");
        int num2 = in.nextInt();
        System.out.println("Введите 3 число:");
        int num3 = in.nextInt();
        System.out.println("Введите 4 число:");
        int num4 = in.nextInt();
        System.out.println("Введите 5 число:");
        int num5 = in.nextInt();
        System.out.println(m.lastNumSum(m.lastNumSum(m.lastNumSum(m.lastNumSum(num1, num2), num3), num4), num5));
        //2.2
        System.out.println("Введите 2 числа, 1 будет делится на 2:");
        System.out.println("ведите 1 число:");
        int delimoe=in.nextInt();
        System.out.println("ведите 2 число:");
        int delitelb=in.nextInt();
        System.out.println(m.safeDiv(delimoe,delitelb));
        //2.4
        System.out.println("Введите 2 числа, компьютер их сравнит:");
        System.out.println("Введите 1 число:");
        int cravn=in.nextInt();
        System.out.println("Введите 2 число:");
        int cravn2=in.nextInt();
        System.out.println(m.makeDecision(cravn,cravn2));
        //2.6
        System.out.println("Введите 3 числа: если любые 2 в сумме дадут третье-true, иначе-false:");
        System.out.println("Введите 1 число:");
        int a=in.nextInt();
        System.out.println("Введите 2 число:");
        int b=in.nextInt();
        System.out.println("Введите 3 число:");
        int c=in.nextInt();
        System.out.println(m.sum3(a,b,c));
        //2.8
        System.out.println("Введите число, а программа правильно определит какое из слов:лет,год,года нужно вставить:");
        int age=in.nextInt();
        System.out.println(m.age(age));
        //2.10
        System.out.println("Напишите день недели(с заглавной буквы), а программа напишет все дни до конца недели:");
        String week=in.nextLine();
        m.printDays(week);
        //3.2
        System.out.println("Введите число,а программа напишет все числа в обратном порядке до 0:");
        int obr=in.nextInt();
        System.out.println(m.reverseListNums(obr));
        //3.4
        System.out.println("Введите 2 числа: число и степень, в которую возведется число:");
        System.out.println("Число:");
        int x=in.nextInt();
        System.out.println("Степень:");
        int y=in.nextInt();
        System.out.println(m.pow(x,y));
        //3.6
        System.out.println("Введите число: если все знаки одинаковые-true, иначе-false:");
        int odin=in.nextInt();
        System.out.println(m.equalNum(odin));
        //3.8
        System.out.println("Введите число и увидите как в каждой строке,равных вашему числу, будут звездочки в каждой столько, какая строка по счету:");
        int zvezda=in.nextInt();
        m.leftTriangle(zvezda);
        //3.10
        m.guessGame();
        //4.2
        System.out.println("Введите количество чисел в массиве:");
        int qwer=in.nextInt();
        int[] mas=new int[qwer];
        System.out.println("Введите "+ qwer+ " чисел в массив:");
        for(int i=0;i<mas.length;i++){
            int ch=in.nextInt();
            mas[i]=ch;
        }
        System.out.println("Введите число, у которого хотите узнать последнее вхождение:");
        int vxod=in.nextInt();
        System.out.println("Индекс последнего  входа(-1 если не входит):");
        System.out.println(m.findLast(mas,vxod));
        //4.4
        System.out.println("Введите количество чисел в массиве:");
        int qwer1=in.nextInt();
        int[] arr=new int[qwer1];
        System.out.println("Введите "+ qwer1+ " чисел в массив:");
        for(int i=0;i<arr.length;i++){
            int ch=in.nextInt();
            arr[i]=ch;
        }
        System.out.println("Нужно будет ввести новое значение и индекс, куда мы вставляем новый элемент:");
        System.out.println("Значение:");
        int znach=in.nextInt();
        System.out.println("Индекс:");
        int pos= in.nextInt();
        System.out.println("Новый полученный массив:");
        int[] newar=m.add(arr,znach,pos);
        for(int i:newar){
            System.out.print(i+" ");
        }
        System.out.println();
        //4.6
        System.out.println("Введите количество чисел в массиве:");
        int qwer2=in.nextInt();
        int[] masik=new int[qwer2];
        System.out.println("Введите "+ qwer2+ " чисел в массив:");
        for(int i=0;i<masik.length;i++){
            int ch=in.nextInt();
            masik[i]=ch;
        }
        System.out.println("Измененный массив:");
        m.reverse(masik);
        //4.8
        System.out.println("Введите количество чисел в 1 массиве:");
        int qwer3=in.nextInt();
        int[] massiv=new int[qwer3];
        System.out.println("Введите "+ qwer3+ " чисел в 1 массив:");
        for(int i=0;i<massiv.length;i++){
            int ch=in.nextInt();
            massiv[i]=ch;
        }
        System.out.println("Введите количество чисел во 2 массиве:");
        int qwer4=in.nextInt();
        int[] massiv2=new int[qwer4];
        System.out.println("Введите "+ qwer4+ " чисел во 2 массив:");
        for(int i=0;i<massiv2.length;i++){
            int ch=in.nextInt();
            massiv2[i]=ch;
        }
        System.out.println("Массив, объединяющий оба:");
        int[] massiv3=m.concat(massiv,massiv2);
        for(int i:massiv3){
            System.out.print(i+" ");
        }
        System.out.println();
        //4.10
        System.out.println("Введите количество чисел в массиве:");
        int qwer5=in.nextInt();
        int[] last=new int[qwer5];
        System.out.println("Введите "+ qwer5+ " чисел в массив:");
        for(int i=0;i<last.length;i++){
            int ch=in.nextInt();
            last[i]=ch;
        }
        System.out.println("Массив без отрицательных чисел:");
        int[] last1=m.deleteNegative(last);
        for(int i:last1){
            System.out.print(i+" ");
        }
        System.out.println();
        in.close();

    }

    //1.2
    public int sumLastNums(int x){
        return (x%10+x/10%10);
    }
    //1.4
    public boolean isPositive(int x) {
        if (x>0) {
            return true;
        }
        else{
            return false;
        }
    }
    //1.6
    public boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z') {
            return true;
        } else {
            return false;
        }
    }
    //1.8
    public boolean isDivisor (int a, int b){
        if (b==0 || a==0){
            return false;
        }
        else if ((a%b==0) || (b%a==0)){
            return true;
        }
        else{
            return false;
        }
    }
    //1.10
    public int lastNumSum(int c, int b){
        return c%10+b%10;
    }
    //2.2
    public double safeDiv (int x, int y){
        if (y==0){
            return 0;
        }
        else{
            return x/y;
        }
    }
    //2.4
    public String makeDecision (int x, int y){
        if (x>y){
            return x+">"+y;
        }
        else if(x<y){
            return x+"<"+y;
        }
        else{
            return x+"="+y;
        }
    }
    //2.6
    public boolean sum3 (int x, int y, int z){
        if (x+y==z || x+z==y || z+y==x){
            return true;
        }
        else{
            return false;
        }
    }
    //2.8
    public String age (int x){
        if(x%10==1 && x!=11){
            return x+" год";
        }else if ((x%10==2 || x%10==3 || x%10==4) && (x!=12 &&x!=13 && x!=14)){
            return x+" года";
        }else{
            return x+" лет";
        }
    }
    //2.10
    public void printDays (String x) {
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("это не день недели"); break;
        }

    }
    //3.2
    public String reverseListNums(int x){
        String s="";
        while (x>=0){
            s+=x+" ";
            x--;
        }
        return s;
    }
    //3.4
    public int pow (int x, int y){
        int rez=1;
        for(int i=0;i<y;i++){
            rez=rez*x;
        }
        return rez;
    }
    //3.6
    public boolean equalNum (int x){
        int prov=x%10;
        int k=0;
        while(x>0){
            if(x%10!=prov){
                k=1;
            }
            x/=10;
        }
        if(k==0){
            return true;
        }
        else{
            return false;
        }
    }
    //3.8
    public void leftTriangle (int x){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //3.10
    public void guessGame(){
        int k=1;
        Scanner in =  new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9:");
        int me=in.nextInt();
        Random rand = new Random();
        int pc= rand.nextInt(10);
        while(pc!=me){
            System.out.println("Вы не угадали, попробуйте ещё раз:");
            k+=1;
            me=in.nextInt();
        }
        System.out.println("Поздравляю, вы угадали! Количество попыток: "+k);

    }
    public int findLast (int[] arr, int x){
        int k=0;
        int i=arr.length-1;
        while(i>=0){
            if((x==arr[i]) && (k==0)){
                k=1;
                return i;
            }
            i--;
        }
        return -1;

    }
    public int[]add (int[] arr, int x, int pos){
        int[] nov=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            nov[i]=arr[i];
        }
        nov[pos]=x;
        for(int i=pos;i<arr.length;i++){
            nov[i+1]=arr[i];
        }
        return nov;
    }
    public void reverse (int[] arr){
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[arr.length-1-i];
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public int[] concat (int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i< arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int k=0;
        for(int i=arr1.length;i<arr1.length+arr2.length;i++){

            arr3[i]=arr2[k];
            k++;
        }
        return arr3;
    }
    public int[] deleteNegative (int[] arr){
        int count=0;
        for(int i:arr){
            if(i>=0){
                count++;
            }
        }
        int[] arr2=new int[count];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr2[k]=arr[i];
                k++;
            }

        }
        return arr2;
    }

}