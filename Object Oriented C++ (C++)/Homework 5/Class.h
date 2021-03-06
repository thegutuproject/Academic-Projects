//
//  Class.h
//  Homework 5
//
//  Created by Alexandru Gutu on 11/21/13.
//  Copyright (c) 2013 Alexandru Gutu. All rights reserved.
//

#ifndef Class_h
#define Class_h

#include <iostream>
#include <string>

#include "Students.h"

// Sets maximum quantity to 10
#define MAX 10

using namespace std;

struct Class
{
	
private:
    string course_name;
    int course_code;
    int credits;
    string instructor;
	int counter;
	Students roster[MAX];
    
public:
	// Default Constructors
    Class();
    Class(string cn, int cc, int c, string i, int count);
	
	// Mutators
	void setCoursename (string cn);
	void setCoursecode (int cc);
	void setCredits (int c);
	void setInstructor (string i);
	
	// Accessors
	string getCoursename();
	int getCoursecode();
	int getCredits();
	string getInstructor();
	
	// Functions
	void addStudent();
	void removeStudent();
	void findStudent();
	
	// Print functions
	void printAll();
	void printAllStudents();
	void printClass();
	
	// Input function
	void input();
	
	friend ostream& operator<< (ostream&, const Class&);
	friend istream& operator>> (istream&, Class&);
	
	// Sort function
	void sort(Students roster[], int size);
	
};
#endif