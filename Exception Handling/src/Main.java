void main() {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    String userInput = input.nextLine();

    try{
        int number = Integer.parseInt(userInput);
        System.out.println("You entered the number: " + number);
    }
    catch (NumberFormatException e){
        System.out.println("Error: That is not a valid number! Please enter digits only.");
    }

        System.out.println("Great job!");

    }
