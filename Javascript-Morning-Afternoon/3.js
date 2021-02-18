function check_string(name){
    var pattern_lion = /^lion/i;
    var pattern_cat = /cat$/i;
    var pattern_abc = /.*ab+c.*/;

    if(pattern_lion.test(name)){
        console.log("Lion Found at position 0");
        return true;
    }

    if(pattern_cat.test(name)){
        var location = name.length - 3;
        console.log("Cat Found at position " + location);
        return true;
    }

    if(pattern_abc.test(name)){
        var location = name.search(/ab+c/);
        console.log("ab+c found at " + location);
        return true;
    }

    console.log("No pattern found");
    return 0;
}

check_string("Lion is a King");
//Lion Found at position 0

check_string("The Lion is a king");
//No pattern found

check_string("He has a cat");
//Cat Found at position 9

check_string("He has a cat name Scout");
//No pattern found

check_string("bdfaaabbbbbbcmjds");
//ab+c found at 5

check_string("aaaaabbbbbdbc");
//No pattern found
