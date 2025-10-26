import java.util.InputMismatchException;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    Account(){
    }

    Account(String id, String name){
        setName(name);
        setId(id);
    }

    Account(String id, String name, int balance){
        setId(id); // use the set for logic
        setName(name);
        setBalance(balance);
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

    public void setBalance(int balance){
        try {
            if(balance  < 0){
                throw new Exception("balance must be a positive number");
            }
            this.balance = balance;
        }catch (InputMismatchException e){
            System.out.println("balance must be of type int");
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
    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("credit went successfully");
        }
        else{
            System.out.println("enter a positive amount");
        }
        return balance;
    }

    public int debit(int amount){
        if(amount > balance){
            System.out.println("you cant withdraw");

        }else {
            System.out.println("debit went successfully");
            balance -=amount;
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if(!another.name.equals(name) && amount <= balance){
            balance -= amount;
            another.balance +=amount;
            System.out.printf("transfer went successfully\n" +
                    "amount after transfer: %d\n",balance);
        }else {
            System.out.println("transfer went unsuccessfully check transfer info");
        }

        return balance;
    }

    public String toString(){
        return String.format("name: %s\nid: %s\nbalance: %d", getName(),getId(),getBalance());
    }
}

