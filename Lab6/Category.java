package lab6;

public enum Category {
    RARE("Valuable stone"), FAKE("Faked stone"), SEMIRARE("Semi valuable stone");
    private String category;
     Category(String name){
         this.category = name;
     }

    @Override
    public String toString() {
        return category;
    }
}
