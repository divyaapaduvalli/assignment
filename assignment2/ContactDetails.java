package assignment2;

public class contactDetails {
    int max;
    int count;
    String[] list;
    contactDetails(){
        max=10;
        count=0;
        list= new String[max];
    }
    contactDetails(int m){
        max=m;
        count=0;
        list= new String[max];
    }
    public void add(String name,long num,int c){
        String contactInfo= name +" "+ num;

        count=c+1;

        if(count<=max){
            list[c]=contactInfo;
        }
        else{
            System.out.println("crossed the limit. you cant enter any more.");
        }
    }
    public String toString() {
        String temp="";
        for (int i = 0; i < max; i++) {
            temp=temp+" "+list[i];
        }
        return temp;
    }
   /* public void list(){
        for(int i=0;i<max;i++){
            System.out.println("\n"+list[i]);
        }*/
    }
