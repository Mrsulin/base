package club.sulin.struct;

/**
 * Title: MyStack
 */
public class MyStack {
    int []elements;

    public MyStack(){
        elements=new int[0];
    }

    //压入元素
    public void push(int element){
        int []newArr=new int[elements.length+1];

        for(int i=0;i<elements.length;i++){
            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;
        elements=newArr;
    }

    public int pop(){
        if(elements.length==0){
            throw  new RuntimeException("struct is empty");
        }
       int element= elements[elements.length-1];
       //创建一个新的数组
        int []newArr=new int[elements.length-1];
        //原数组中除了最后一个元素，复制进入
        for(int i=0;i<elements.length-1;i++){
            newArr[i]=elements[i];
        }
        elements=newArr;
        return element;
    }
}
