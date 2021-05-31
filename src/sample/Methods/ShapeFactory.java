package sample.Methods;

public class ShapeFactory {
    public Shape createShape(String findModule){
        if(findModule.equals("МОДУЛЬ")){
            return new Modulus();
        }
        else if(findModule.equals("ПОДСИСТЕМА")){
            return new Subsystem();
        }
        else if(findModule.equals("БИБЛИОТЕКА")){
            return new Library();
        }
        else if(findModule.equals("ОБЛАСТЬ ДАННЫХ")){
            return new DataArea();
        } else{
            return null;
        }
    }
}
