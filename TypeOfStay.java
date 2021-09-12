package Hotel;

public enum  TypeOfStay {
    WORK("work"), HOLIDAY("holiday");


    final String description;

    TypeOfStay(String description) {
        this.description = description;
    }
    @Override
    public  String toString(){
        return  description;
    }
}
