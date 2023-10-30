//
// Created by Chester Yee on 15/10/23.
//

#ifndef LAB5_CHILDANIMAL_H
#define LAB5_CHILDANIMAL_H
#include <stdio.h>
#include "animal.h"
using namespace std;

class Dog : public Mammal
{
public:
    Dog(string n, COLOR c, string owner);
    ~Dog();
    void speak() const override;
    void move();
};

class Cat : public Mammal
{
public:
    Cat(string n, COLOR c, string owner);
    ~Cat();
    void speak() const override;
    void move();

};

class Lion : public Mammal
{
public:
    Lion(string n, COLOR c, string owner);
    ~Lion();
    void speak() const override;
    void move();
};


#endif //LAB5_CHILDANIMAL_H
