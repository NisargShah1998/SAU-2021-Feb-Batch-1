//Array Methods
//concat()
var indoor_sports = ["Chess","Carrom","Table Tennis"];
var outdoor_sports = ["Cricket","Football","Tennis"];
var sports = indoor_sports.concat(outdoor_sports);
console.log(sports);
//[ 'Chess', 'Carrom', 'Table Tennis', 'Cricket', 'Football', 'Tennis' ]
console.log();


//every()
//Check if every number is a multiple of 5
var numbers = [15,25,30,75,95];
function check_multiple_of_5(number){
    return number%5==0;
}
console.log(numbers.every(check_multiple_of_5));
// true
console.log();


//filter()
//Filter numbers which are divisible by 10
var numbers = [20,10,8,35,50,70,4]
var divby10 = numbers.filter(num => {
    return num%10 == 0;
});
console.log(divby10);
//[ 20, 10, 50, 70 ]
console.log();


//forEach()
//Multiply each number by 3
var numbers = [1,2,3,4,5]
var answers = []
numbers.forEach(num => {
    answers.push(num*3);
});
console.log(answers);
//[ 3, 6, 9, 12, 15 ]
console.log();


//indexOf()
//It will return the first index of an element which is matched in array else return -1
var sports = [ 'Cricket', 'Carrom', 'Table Tennis', 'Chess', 'Football', 'Chess' ]
console.log(sports.indexOf('Chess'));
//3
console.log(sports.indexOf('Tennis'));
//-1
console.log();


//join()
//It will join all the elements of array into a single string
var fullname = ['My','name','is','Nisarg','Shah']
console.log(fullname.join(' '));
//My name is Nisarg Shah
console.log();


//lastIndexOf()
//It will return the last index of an element which is matched in array else return -1
var sports = [ 'Cricket', 'Carrom', 'Table Tennis', 'Chess', 'Football', 'Chess' ]
console.log(sports.lastIndexOf('Chess'));
//5
console.log(sports.lastIndexOf('Tennis'));
//-1
console.log();


//map()
//Multiply each element of array by 3. In map it will return new array
var numbers = [1,2,3,4,5]
var answers = numbers.map(num => num*3);
console.log(answers);
//[ 3, 6, 9, 12, 15 ]
console.log();


//pop()
//Removes the last element of an array and return that element
var numbers = [1,2,3,4,5]
console.log(numbers.pop());
//5
console.log(numbers);
//[ 1, 2, 3, 4 ]
console.log();


//push()
//Adds the element into the end of an array and returns new Length
var numbers = [1,2,3,4,5]
console.log(numbers.push(8));
//6
console.log(numbers);
//[ 1, 2, 3, 4, 5, 8 ]
console.log();


//reduce()
//It reduce the array into single element from left to right by applying given function by taking two elements at a time
var numbers = [5,10,15,20,25]
console.log(numbers.reduce((num1, num2) => num1 + num2))
//75 (sum of all element in arrays)
console.log();


//reduceRight()
//It reduce the array into single element from right to left by applying given function by taking two elements at a time
var numbers = [5,10,15,20,25]
console.log(numbers.reduceRight((num1, num2) => num1 - num2))
//-25 (25-20-15-10-5)
console.log();


//reverse()
//reverse the order of the array
var numbers = [5,10,15,20,25]
console.log(numbers.reverse());
//[ 25, 20, 15, 10, 5 ]
console.log()


//shift()
//removes the first element of an array and returns the element
var sports = [ 'Cricket', 'Carrom', 'Table Tennis', 'Chess', 'Football', 'Chess' ]
console.log(sports.shift());
//Cricket
console.log(sports)
//[ 'Carrom', 'Table Tennis', 'Chess', 'Football', 'Chess' ]
console.log();


//slice()
//Extracts the section mentioned and returns new array
var sports = [ 'Cricket', 'Carrom', 'Table Tennis', 'Chess', 'Football', 'Chess' ]
console.log(sports.slice(2,6));
//[ 'Table Tennis', 'Chess', 'Football', 'Chess' ]
console.log();


//some()
//It will return true if any element of array satisfies the condition
var numbers = [2,4,6,9,10]
console.log(numbers.some((num) => num%2==1)) //check if any element in array is odd
//true
console.log();


//toSource()
//represents the source code of an object
function Dog(name, breed, color, sex) {
    this.name = name;
    this.breed = breed;
    this.color = color;
    this.sex = sex;
}
  
theDog = new Dog('Gabby', 'Lab', 'chocolate', 'female');
//theDog.toSource();
//({name:"Gabby", breed:"Lab", color:"chocolate", sex:"female"})


//sort()
//Sort the elements of array
var numbers = [4,5,8,2,1,6]
numbers.sort();
console.log(numbers);
//[ 1, 2, 4, 5, 6, 8 ]
console.log()


//splice()
//Adds and/or removes elements from an array
var numbers = [1,2,2,5,6]
numbers.splice(2,1,3,4); // remove 1 element from index 2 i.e. 2  and add 3,4 from index 2
console.log(numbers);
//[ 1, 2, 3, 4, 5, 6 ]
console.log();


//toString()
//returns a string representing elements of an array
var fullname = ['My','name','is','Nisarg','Shah']
console.log(fullname.toString());
//My,name,is,Nisarg,Shah
console.log()


//unshift()
//Add elements at starting of array and return new length
var numbers = [3,4,5,6];
console.log(numbers.unshift(1,2));
//6
console.log(numbers);
//[ 1, 2, 3, 4, 5, 6 ]