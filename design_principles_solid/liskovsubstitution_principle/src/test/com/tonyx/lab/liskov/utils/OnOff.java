package test.com.tonyx.lab.liskov.utils;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 8-dic-2006
 * Time: 14.24.57
 * To change this template use File | Settings | File Templates.
 */
class OnOff {
    private boolean flagState=false;
    public void setState(boolean state)
    {
        this.flagState=state;
    }
    public boolean getState()
    {
        return flagState;
    }
}
