public class Solution2 {
    public static void main(String[] args){
        DynArray d1 = new DynArray(10);
        d1.append(1);
        d1.append(2);
        d1.append(3);
        d1.append(4);
        d1.display();
        //you can call many other methods accoding requirements
    }
}
class  DynArray {
    int size;
    int lastIndex;
    int []ptr;

    DynArray(int size ){
        
        ptr=new int[size];
        lastIndex=-1;
    }

    void append(int value){
        if(lastIndex >= ptr.length-1){
            doubleArray();
        }
        else{
            lastIndex=lastIndex+1;
            ptr[lastIndex]=value;
        }
    }

    public void insert(int index, int value){
        if(index>=size || index>lastIndex+1){
            System.out.println("Invalid Index");
        }else{
            if(lastIndex==size-1){
                System.out.println("Index out of bound at insert element");
            }
            else{
                lastIndex=lastIndex+1;
                for(int i=lastIndex-1;i>=index; i--){
                    ptr[i+1]=ptr[i];
                }
                ptr[index]=value;
            }
        }
    }

    void doubleArray(){
        int []temp = new int[ptr.length*2];
        for (int i = 0; i < ptr.length; i++) {
            temp[i] = ptr[i];
        }
        ptr = temp;
    }

    void halfArray(){
        int newSize = ptr.length/2;
        int []temp = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            temp[i] = ptr[i];
        }
        ptr = temp;
        System.out.println("half array length = "+ptr.length);
    }

    public void update(int index, int value){
        if( index<=0 || lastIndex+1<index){
            System.out.println("Invalid Index for update");
        }else{
            ptr[index] = value;
        }
    }

    public void delete(int index){
        if(index>=size || index>lastIndex+1){
            System.out.println("Invalid Index for delete element");
        }else{
            for(int i=index+1; i<=lastIndex; i++){
                ptr[i-1]=ptr[i];
            }
            ptr[lastIndex]=0;
            lastIndex=lastIndex-1;
        }
    }

    public void getTotal(){
        System.out.println("Total number of array element is = "+(lastIndex+1));
    }

    public void isEmpty(){
        if(lastIndex==-1){
            System.out.println("Array is empty");
        }else{
            System.out.println("Array is not empty");
        }
    }

    public void getValue(int index){
        if(index>lastIndex || index<0){
            System.out.println("Invalid index for read value from array");
        }
        System.out.println("value is \""+ptr[index]+"\" on index "+ index);
    }

    public void getCapacity(){
        System.out.println("remaining capasity is "+ (size-lastIndex-1));
    }

    void displayLength(){
        System.out.println("length = "+ptr.length);
    }

    void display(){
        if(lastIndex==-1){
            System.out.println("Array is currently empty call append method to add element");
        }else{
            if(lastIndex<ptr.length/2){
                halfArray();
            }
            for(int i=0; i<ptr.length; i++){
                System.out.println(ptr[i]);
            }
        }
    }
}