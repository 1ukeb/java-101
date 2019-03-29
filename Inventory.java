import java.util.*;
import java.io.IOException;
public class Inventory
{
    private ArrayList<String> itemNames;
    private ArrayList<Integer> amount;
    private ArrayList<String> amountType;
    private ArrayList<Double> costsPerUnit;
    private ArrayList<Integer> ratios;
    private ArrayList<String> doughSizes;
    private ArrayList<Integer> unitsUsed;
    private Scanner key = new Scanner(System.in);

    Inventory(){
        itemNames = new ArrayList<String>();
        amount = new ArrayList<Integer>();
        amountType = new ArrayList<String>();
        costsPerUnit = new ArrayList<Double>();
        ratios = new ArrayList<Integer>();
        doughSizes = new ArrayList<String>();
        unitsUsed = new ArrayList<Integer>();
        Menu();
    }

    void AddItem(){
        Clear();
        System.out.println("Enter the name of the item.");
        String newName = key.next();
        
        System.out.println("Enter the quantity of the item.");
        int newAmount = key.nextInt();
        
        System.out.println("Enter the quanitity type of the item. (Ex. oz, lb, qt)");
        String newAmountType = key.next();
        
        System.out.println("Enter the price per unit of the item (In $'s)");
        double newCostsPerUnit = key.nextDouble();
        
        itemNames.add(newName);
        amount.add(newAmount);
        amountType.add(newAmountType);
        costsPerUnit.add(newCostsPerUnit);
        ratios.add(0);
        
        System.out.println(newName + " added!");
        BackToMenu();
    }

    void RemoveItem(){
        Clear();
        ListItems();
        
        System.out.println("Which item would you like to remove?");
        int itemIndex = key.nextInt()-1;
        System.out.println(itemNames.get(itemIndex) + " deleted.");
        
        itemNames.remove(itemIndex);
        amount.remove(itemIndex);
        amountType.remove(itemIndex);
        costsPerUnit.remove(itemIndex);
        
        BackToMenu();
    }

    void ListItems(){
        Clear();
        for(int i = 0; i < itemNames.size(); i++){
            System.out.print("1) ");
            System.out.print(itemNames.get(i) + ", ");
            System.out.print(amount.get(i) + " ");
            System.out.print(amountType.get(i) + "'s ");
            System.out.println("// $" + costsPerUnit.get(i));
        }
    }

    void SetDoughRatios(){
        Clear();
        boolean found = false;
        int foundPlace = 0;
        
        System.out.println("Enter name of the item: ");
        String name = key.next();
        
        for(int i = 0; i < itemNames.size(); i++){
            if(itemNames.get(i).equals(name)){
                found = true;
                foundPlace = i;
            }else{
                System.out.println("No item found!");
            }
        }

        if(found){
            System.out.println("Enter the amount of " +name+ " used: ");
            int amountToUse = key.nextInt();
            ratios.set(foundPlace, amountToUse);
            
            System.out.println("Debug: " + ratios.get(foundPlace));
            System.out.println("Debug: " + ratios.get(foundPlace) * costsPerUnit.get(foundPlace));
            BackToMenu();
        }else{
            System.out.println("Error! Item not found.");
            SetDoughRatios();
        }
    }

    void SetDoughSizes(){
        Clear();
        System.out.println("What is the name of your dough size?");
        String size = key.next();
        doughSizes.add(size);
        
        System.out.println("How many units to create this size?");
        int unitsInSize = key.nextInt();
        
        unitsUsed.add(unitsInSize);
        BackToMenu();
    }

    void ListDoughSizes(){
        Clear();
        if(doughSizes.size() > 0){
            for(int i = 0; i < doughSizes.size(); i++){
                double cost = 0;
                int unit = unitsUsed.get(i);
                for(int a = 0; a < itemNames.size(); a++){
                    cost += ratios.get(a) * costsPerUnit.get(a) * unit;
                }
                System.out.println(i+1 + ") " + doughSizes.get(i) + " costs " + cost);
                cost = 0;
            }
        }else{
            System.out.println("No sizes created yet");
        }
    }

    void RemoveDoughSize(){
        Clear();
        ListDoughSizes();
        if(doughSizes.size() > 0){
            System.out.println("Which size would you like to remove?");
            int index = key.nextInt();
            amount.set(index, amount.get(index) - ratios.get(index));
        }
        BackToMenu();
    }

    void TotalCost(){
        Clear();
        float total = 0;
        for(int i = 0; i < itemNames.size(); i++){
            total += costsPerUnit.get(i) * amount.get(i);
        }
        System.out.println("Total Cost: " + total);
        BackToMenu();
    }

    void Exit(){
        Clear();
        System.out.println("Program closed.");
    }

    void BackToMenu(){
        System.out.println("\n1) Press enter to return back to menu.");
        key.nextLine();
        key.nextLine();
        Menu();
    }

    void Clear(){
        System.out.print('\u000C');
    }

    void Menu(){
        Clear();
        System.out.println("/////MENU/////");
        System.out.println("1: Add an item to the inventory");
        System.out.println("2: Remove an item from the inventory");
        System.out.println("3: List the items in the inventory");
        System.out.println("4: Set dough ratios");
        System.out.println("5: Set dough sizes");
        System.out.println("6: List dough sizes");
        System.out.println("7: Remove dough size");
        System.out.println("8: Total Cost");
        System.out.println("9: Exit");
        int selection = key.nextInt();
        if(selection == 1){
            AddItem();
        }else if(selection == 2){
            RemoveItem();
        }else if(selection == 3){
            ListItems();
            BackToMenu();
        }else if(selection == 4){
            SetDoughRatios();
        }else if(selection == 5){
            SetDoughSizes();
        }else if(selection == 6){
            ListDoughSizes();
            BackToMenu();
        }else if(selection == 7){
            RemoveDoughSize();
        }else if(selection == 8){
            TotalCost();
        }else if(selection == 9){
            Exit();
        }
    }
}
