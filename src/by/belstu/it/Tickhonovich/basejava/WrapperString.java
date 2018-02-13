package by.belstu.it.Tickhonovich.basejava;


public  class WrapperString {
    private String str;

    @Override
    public String toString() {
        return "WrapperString{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperString that = (WrapperString) o;

        return str != null ? str.equals(that.str) : that.str == null;
    }

    @Override
    public int hashCode() {
        return str != null ? str.hashCode() : 0;
    }

    public WrapperString(String str) {
        this.str = str;
    }

    public String getStr() {

        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public WrapperString() {
    }
    public  void replace(char oldchar, char newchar){
        char old = oldchar;
        char newc = newchar;

        System.out.println(old + " " + newc );
    }

}
/**
 * @author Maxim
 * @version 1.0.
 *
 */
