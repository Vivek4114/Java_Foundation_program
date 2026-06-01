class Calculator{

public static void main(String[] args){

int a = 10, b = 30;

char op = '*';

if(op == '+'){
System.out.println("Addition of" + a + " and " + b + " is " + (a + b ) );

}

else if(op == '-'){
System.out.println("subtration of" + a + " and " + b + " is " + (a - b ) );

}

else if(op == '*'){
System.out.println("multiplication of" + a + " and " + b + " is "  + (a * b ) );

}
else if(op == '/'){
System.out.println("Division of" + a + " and " + b + " is " +(a / b ) );

}

else if(op == '%'){
System.out.println("mod of " + a + " and " + b + " is " + (a % b ) );

}

else{
System.out.println("NO operator " );
}

}
}
