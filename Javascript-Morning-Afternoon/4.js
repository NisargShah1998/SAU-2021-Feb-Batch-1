var arr = [5,47,23,21,74,35,10,46,81,3]

function manipulate_array(arr){
    var final_array = [];

    console.log("Initial Array");
    console.log(arr);
    //[5, 47, 23, 21, 74, 35, 10, 46, 81, 3]
    console.log();

	arr.sort(function(a, b){
	return a - b;
	});

    console.log("Sorted Array");
    console.log(arr);
    //[3, 5, 10, 21, 23, 35, 46, 47, 74, 81]
    console.log();

    for(i in arr){
        arr[i] = arr[i]*10;
    }

    console.log("Multiply Array by 10");
    console.log(arr);
    //[30, 50, 100, 210, 230, 350, 460, 470, 740, 810]
    console.log();

    for(i in arr){
        if(arr[i]%3==0){
            final_array.push(arr[i]);
        }
    }

    console.log("Numbers which are divisible by 3");
    console.log(final_array);
    //[ 30, 210, 810 ]

    return final_array;
}

var manipulated_array = manipulate_array(arr);
console.log(manipulated_array);
//[ 30, 210, 810 ]