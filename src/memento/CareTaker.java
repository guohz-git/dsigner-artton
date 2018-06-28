package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础内容保存对象
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
