//
// Created by Chester Yee on 15/10/23.
//
#include <iostream>
#include "animal.h"
#include "childAnimal.h"

using namespace std;

int main() {
    int i = 0;
    int choice = 1;

    Mammal *mammals[3];



    while (choice != 5) {
        cout << "Select the animal to send to Zoo :" << endl;
        cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;

        cin >> choice;

        switch (choice) {
            case 1:
                mammals[i] = new Dog("Lassie", White, "Andy");
                break;
            case 2:
                mammals[i] = new Cat("Jane", Black, "Andy");
                break;
            case 3:
                mammals[i] = new Lion("Jack", White, "Andy");
                break;
            case 4:
                for (Mammal* &mammal : mammals) {
                    mammal->move();
                    mammal->speak();
                    mammal->eat();
                }
                i = 0;
                break;
            default:
                break;
        }
        i++;
    }
    return 0;
}