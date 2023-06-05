package dev.aman;

import java.util.List;

public abstract   class ListItem {

    protected ListItem rightItem;
    protected ListItem leftItem;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext();
    abstract ListItem previous();
    abstract ListItem setPrevious();
    abstract ListItem compareTo();

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value=value;
    }

}
