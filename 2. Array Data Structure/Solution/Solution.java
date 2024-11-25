class Solution{
    public static void main(String[] args){
        Array a1 = new Array(7);
        a1.append(10);
        a1.append(20);
        a1.append(30);
        a1.append(40);
        a1.append(50);
        a1.append(60);
        a1.append(70);
        a1.getValue(6);
        
        a1.display();
    }
}
class Array{
    int lastIndex;
    int size;
    int []ptr;
    public Array(int size){
        this.size = size;
        ptr= new int[size];
        lastIndex=-1;
    }

    //add data after last added position
    public void append(int value){
        if(lastIndex==size-1){
            System.out.println("Array size is full");
        }else{
            lastIndex=lastIndex+1;
            ptr[lastIndex]=value;
            // System.out.println("Append successfully"+ lastIndex);
        }
    }

    // add data on specific index
    public void insert(int index, int value){
        if(index>=size || index>lastIndex+1){
            System.out.println("Invalid Index");
        }else{
            // System.out.println(lastIndex);
            if(lastIndex==size-1){
                System.out.println("Index out of bound at insert element");
            }
            else{
                lastIndex=lastIndex+1;
                for(int i=lastIndex-1;i>=index; i--){
                    ptr[i+1]=ptr[i];
                }
                ptr[index]=value;
                // System.out.println("Insert successfully");
            }
        }
    }

    //Update value
    public void update(int index, int value){
        if( index<=0 || lastIndex+1<index){
            System.out.println("Invalid Index");
        }else{
            ptr[index] = value;
        }
    }

    //delete element from array
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

    public void isFull(){
        if(lastIndex==size-1){
            System.out.println("Array is Full");
        }else{
            System.out.println("Array is not Full");
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

    public void display(){
        if(lastIndex==-1){
            System.out.println("Array is currently empty call append method to add element");
        }else{
            for(int i=0; i<size; i++){
                System.out.println(ptr[i]);
            }
        }
    }
}