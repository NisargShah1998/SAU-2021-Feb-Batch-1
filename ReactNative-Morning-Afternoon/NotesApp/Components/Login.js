import React, {useState,useEffect} from "react";
import {Text, TextInput, View,Alert ,StyleSheet, Button} from "react-native"
import AsyncStorage from "@react-native-community/async-storage";

const Login = ({navigation}) => {

    const [username,setUsername] = useState("")

    useEffect(() =>{
         isAuthorized()
    }, []);

    const isAuthorized = async () => {
        const username = await AsyncStorage.getItem("username");
        if(username=="Nisarg"){
            navigation.navigate("Dashboard");
        }else{
            Alert.alert(
                "Invalid Username",
                "Please Enter Valid Username to Proceed",
                [
                  { text: "OK", onPress: () => console.log("OK Pressed") }
                ],
                { cancelable: false }
              );
            return true;
        }
    } 

    const logMeIn = () => {
        if(!username){
            Alert.alert(
                "Empty Username",
                "Please Enter Username to Proceed",
                [
                  { text: "OK", onPress: () => console.log("OK Pressed") }
                ],
                { cancelable: false }
              );
            return;
        }  
        AsyncStorage.setItem("username",username)
        if(isAuthorized())
            return;
        navigation.navigate("Dashboard");
        console.log(username)
    }

    return(
        <View style={styles.container}>
            <Text style={styles.loginTextStyle}>Login</Text>
            <TextInput onChangeText={(text) => setUsername(text)} style={styles.textInputStyle} placeholder="Enter Username.."/>
            <View style={styles.button}><Button title="Log in" onPress={logMeIn}/></View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "#FEEAE6"
    },
    loginTextStyle: {
        fontSize: 25,
        fontWeight: "700",
        marginVertical: 10
    },
    textInputStyle: {
        borderWidth: 1,
        borderRadius: 10,
        fontSize: 15,
        padding: 5,
        width: "50%",
        backgroundColor: "#b5e37f",
        fontStyle: "italic"
    },
    button:{
        marginTop:5,
        padding:10,
        width: "30%"
    }

})

export default Login