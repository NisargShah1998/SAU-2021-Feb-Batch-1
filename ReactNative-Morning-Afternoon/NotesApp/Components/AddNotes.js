import React, {useState} from "react";
import {View, StyleSheet, TextInput, Button} from "react-native";
import AsyncStorage from "@react-native-community/async-storage";


export const AddNotes = ({navigation}) =>
{
    const [title,setTitle] = useState('');
    const [description,setDescription] = useState('');

    const submit = async () =>{
            let notesList = JSON.parse(await AsyncStorage.getItem("allNotes"));
            console.log("Hi");
            console.log(notesList);
            if (notesList==null || notesList.length==0) {
                console.log("Empty");
                notesList = [{id: 1,title: title,description: description}];
            } 
            else {
                let id = notesList.length + 1;
                console.log(id)
                console.log(notesList)
                for(let i=1;i<=50;i++){
                    let check = notesList.filter((item)=>item.id == i)
                    console.log(check)
                    if(check.length==0){
                        console.log(id);
                        id = i;
                        break;
                    }
                }
                notesList.push({id: id,title: title,description: description})
            }
            await AsyncStorage.setItem("allNotes", JSON.stringify(notesList));
            navigation.navigate('Dashboard');
    }

    return(
        <View style={styles.container}>
            <TextInput onChangeText={setTitle} placeholder="Enter Title" style={styles.title}/>
            <TextInput onChangeText={setDescription} placeholder="Enter Description" multiline={true} numberOfLines={8}
                style={styles.description}/>
            <View style={styles.button}><Button  title={'Add'} onPress={submit}/></View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: "center",
        justifyContent: "center",
        backgroundColor: "#FEEAE6"
    },
    
    title: {
        fontSize: 15,
        borderRadius: 10,
        padding: 10,
        width: "70%",
        backgroundColor: "#b5e37f",
        fontStyle: "italic",
        marginBottom: 40
    },

    description: {
        borderRadius: 10,
        fontSize: 15,
        padding: 5,
        width: "70%",
        backgroundColor: "#b5e37f",
        fontStyle: "italic",
        marginBottom: 40,
    },

    button: {
        width:250
    }
})

