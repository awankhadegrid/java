class Problem {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[1]);
        int b=Integer.parseInt(args[2]);
        if(args[0].equals("+")){
            System.out.println(a+b);
        }
        else if(args[0].equals("-")){
            System.out.println(a-b);
        }
        else if(args[0].equals("*")){
            System.out.println(a*b);
        }else {
            System.out.println("Unknown operator");
        }
    }
}