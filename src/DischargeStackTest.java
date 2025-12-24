public class DischargeStackTest {


    public static  void main(String[] args) {
        DischargeStack dischargeStack = new DischargeStack();


        System.out.println("Adding 5 records");

        dischargeStack.push(new DischargeRecord(111));
        dischargeStack.push(new DischargeRecord(222));
        dischargeStack.push(new DischargeRecord(333));
        dischargeStack.push(new DischargeRecord(444));
        dischargeStack.push(new DischargeRecord(555));


        dischargeStack.pop();  //remove 555    because (LIFO)
        dischargeStack.pop();  //remove 444


        dischargeStack.printStack();


    }






}
