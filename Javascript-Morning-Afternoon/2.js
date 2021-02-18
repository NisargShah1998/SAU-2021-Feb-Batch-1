var add = (function() {
    var counter = 0;
    return function() { 
        counter += 1; 
        return counter;
    }
})();

console.log(add());  //1
console.log(add());  //2
console.log(add());  //3


/*
Here the variable add is assigned to return the value of a self invoking function.
Self invoking function is invoked automatically without being called and it runs only once.
Due to this the counter is set to zero and returns a function expression which is incrementing the counter.
So, now add becomes a function and can also access the counter variable. This is called Javascript closure.
It makes possible to have private variables in functions.
The counter will now only change when add function is called.
So, the closure is a function having access to the parent scope, even after the parent function has closed.
*/