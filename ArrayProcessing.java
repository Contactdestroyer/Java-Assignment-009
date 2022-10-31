import java.util.Scanner;
public class ArrayProcessing {

int[] a1 = new int[5];
Scanner scoon = new Scanner(System.in);
public ArrayProcessing(){
    scoon = this.scoon;
    a1 = this.a1;
    getNumbers();
    processNumbers();
}
public void getNumbers(){
    System.out.println("Enter 5 separate whole numbers: ");
    for(int i = 0; i < a1.length; i++){
        a1[i] = scoon.nextInt();
    }
}
public void processNumbers(){
    for(boolean again = true; again; again = again()){
        int choice = printMenu();
        if(choice == 1){
            add();
        }
        else if(choice == 2){
            mult();
        }
        else if(choice == 3){
            print();
        }
        else if(choice == 4){
            reverse();
        }else{
            System.out.println("Error...\nPlease enter valid input.");
        }
        }

    }
public int printMenu(){
    int choice;
    System.out.println("1) Add numbers");
    System.out.println("2) Multiply numbers");
    System.out.println("3) Print numbers");
    System.out.println("4) Print number in reverse");
    choice = scoon.nextInt();
    return choice;
}
public void add(){
    int sum = 0;
    for(int i = 0; i< a1.length;i++){
        sum = sum + a1[i];
    }
    System.out.println("All values added together is "+sum);
}
public void mult(){
    int multSum = 1;
    for(int i = 0; i< a1.length;i++){
        multSum = multSum * a1[i];
    }
    System.out.println("All values multiplied together is "+multSum);
}
public void print(){

    for(int i = 0; i< a1.length;i++){
        System.out.println("Number number "+i+" is "+a1[i]);
    }
}

public void reverse(){
    for(int i = a1.length-1; i >= 0 ;i--){
        System.out.println("Number number "+(i+1)+" is "+a1[i]);
    }
}
public boolean again(){
    int agChoice = 0;
    System.out.println("Enter 1 to choose another option, enter anything else to end: ");
    agChoice = scoon.nextInt();
    if (agChoice == 1){
        return true;
    } else {
        return false;
    }
}
    public static void main(String[] args) {
        ArrayProcessing fred = new ArrayProcessing();
    }

}
