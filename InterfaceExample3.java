package com.sara;

interface Member{
    void callback();
}

class Store{
    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m){
        mem[count++] = m;
    }

    void inviteSale(){
        for(int i = 0; i < count; i++)
            mem[i].callback();
    }
}

class Customer implements Member{
    String name;

    Customer(String name){
        this.name = name;
    }

    public void callback(){
        System.out.println("Ok I will visit");
    }

}

public class InterfaceExample3 {
    public static void main(String[] args){
        Store st = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        st.register(c1);
        st.register(c2);
        st.inviteSale();
    }
}
