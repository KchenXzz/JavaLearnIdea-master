package dataStructure.list.sqlist;

//这个异常在另一个文件中，为了方便就放一起了
public class PosWrongfulException extends RuntimeException{
    public PosWrongfulException() {

    }
    public PosWrongfulException(String message) {
        super(message);
    }
}