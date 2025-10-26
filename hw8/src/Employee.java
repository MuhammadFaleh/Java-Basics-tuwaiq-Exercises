import java.util.InputMismatchException;

public class Employee {

    private String id;
    private String name;
    private int salary;

    Employee(){
    }

    Employee(String id, String name, int balance){
        setId(id); // use the set for logic
        setName(name);
        setSalary(balance);
    }

    public void setId(String id){
        try {
            if(id.length() < 10){
                throw new Exception(String.format("the id is not long enough %d length"
                        ,id.length()));
            }
            for (int i =0; i<id.length(); i++){
                if(!Character.isDigit(id.charAt(i))){
                    throw new Exception("id must only contain numbers");
                }
            }
            this.id = id;
        }catch (InputMismatchException e){
            System.out.println("id should be of type String");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void setName(String name){
        try {
            if(name.length() < 4){
                throw new Exception(String.format("the name is not long enough %d length"
                        ,name.length()));
            }
            //username allow for digits no need to block numbers
            this.name = name;
        }catch (InputMismatchException e){
            System.out.println("name should be of type String");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setSalary(int salary){
        try {
            if(salary  < 0){
                throw new Exception("salary must be a positive number");
            }
            this.salary = salary;
        }catch (InputMismatchException e){
            System.out.println("salary must be of type int");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getId(){
        if(id == null){
            return "";
        }
        return id;
    }
    public String getName(){
        if(name == null){
            return "";
        }
        return name;
    }
    public int getSalary(){

        return salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raisedSalary(int percent){
        int raised = (int) (salary*(percent / 100.0f));
        return salary + raised; //should be double;
    }


    public String toString(){
        return String.format("name: %s\nid: %s\nsalary: %d", name,id,salary);
    }
}

