public class NameDetails {
    private String last;
   private String first;

    public void setLast(String last) {
        this.last = last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String get_first_last() {
        return first+" "+ last;
    }
}
