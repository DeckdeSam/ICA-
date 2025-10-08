#include<iostream>
#include<cstdlib>
#include<conio.h>
using namespace std;
int main()
{
    int r,l,b,area_r,choice;
    float area_circle;
    cout<<"*********Menu***********";
    cin>>choice;
    cout<<endl<<"1.Area of circle";
    cout<<endl<<"2.Area of Rectangle";
    cout<<"3.Exit";
    cout<<endl<<"enter your choicw=";
    cin>>choice;
    switch (choice)
    {
    case 1:
           cout<<"enter radius of circle=";
           cin>>r;
           area_circle=(float)(22/7.0f)*(r*r);
           cout<<endl<<"Area of cirlce="<<area_circle;
        break;
        
    case 2:
          cout<<"enter length of rectangle=";
          cin>>r;
          cout<<"enter breadth of rectangle=";
          area_r=(1*b);
          cout<<endl<<"Area of rectangle="<<area_r;
          break;
    case 3:
          cout<<endl<<"Press any key to exit";
          getch();
          exit(0);       
    
    default:
           cout<<"Invalide choice";
    }
    return 0;
}