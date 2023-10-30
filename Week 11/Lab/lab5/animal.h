//
// Created by Chester Yee on 15/10/23.
//

#ifndef LAB5_ANIMAL_H
#define LAB5_ANIMAL_H
#include <string>
using namespace std;


enum COLOR
{
    Green,
    Blue,
    White,
    Black,
    Brown
};

class Animal
{
public:
    Animal();
    Animal(string n, COLOR c);
    ~Animal();
    virtual void speak() const;
    virtual void move() = 0;
    string getColorName(COLOR c) const
    {
        switch (c)
        {
            case Green:
                return "Green";
            case Blue:
                return "Blue";
            case White:
                return "White";
            case Black:
                return "Black";
            case Brown:
                return "Brown";
            default:
                return "Unknown";
        }
    }


private:
    string _name;
    COLOR _color;
};

class Mammal : public Animal
{
public:
    Mammal();
    Mammal(string n, COLOR c);
    ~Mammal();
    void eat() const;
    void move();

private:
    string owner;
};


#endif //LAB5_ANIMAL_H
