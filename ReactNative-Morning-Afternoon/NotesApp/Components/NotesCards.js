import React, {useState} from 'react';
import { StyleSheet, Text, View, Button,TouchableOpacity} from "react-native";
import AsyncStorage from "@react-native-community/async-storage";


export const NotesCards = ({ allnotes , navigation, setallNotes }) => {

    const deleteNote = async (id) => {
        let noteList = JSON.parse(await AsyncStorage.getItem("allNotes"));
        for (var i in noteList) {
            if (noteList[i].id == id) {
                noteList.splice(parseInt(i), 1);
            }
        }
        await AsyncStorage.setItem("allNotes", JSON.stringify(noteList));
        noteList = JSON.parse(await AsyncStorage.getItem("allNotes"));
        console.log(noteList)
        setallNotes(noteList)
    }

     return allnotes.map((note) =>
     {
        return(
            <View key={note.id} style = {styles.container}>
                <Text style = {styles.title}>{note.title}</Text>
                <Text style = {styles.source}>{note.description}</Text>
                <View style = {styles.button}>
                    <Button title="Delete" color="red" onPress={() => deleteNote(note.id)}></Button>
                </View>
            </View> 
            
        );
    // });
     });
};

const styles = StyleSheet.create({
    title: {
        fontSize:20,
        color: "black",
        fontWeight: "700",
        padding: 10,
        borderBottomColor: 'black',
        borderBottomWidth: 1,
        fontStyle: "italic"
    },  
    source: {
        fontSize: 16,
        padding: 10,
        color: "black",
        fontWeight: "200",
        fontStyle: "italic"
    },
    container: {
        width: "95%",
        marginRight: "2.5%",
        marginLeft: "2.5%",
        marginVertical: 8,
        borderWidth: 1,
        backgroundColor: "#b5e37f",
        borderTopLeftRadius: 20,
        borderTopRightRadius: 20,
        borderBottomLeftRadius: 20,
        borderBottomRightRadius: 20,
    },
    button:{
        width:"20%",
        alignSelf: "flex-end",
        marginRight:"40%",
        borderRadius: 10,
        marginTop:"5%",
        marginBottom:"1%"
    },
})