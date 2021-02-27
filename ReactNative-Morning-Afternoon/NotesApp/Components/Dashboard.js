import React, { useEffect,useState } from 'react';
import { StyleSheet, Text, View, ScrollView,TouchableOpacity} from 'react-native';
import { NotesCards } from './NotesCards';
import { FontAwesomeIcon } from '@fortawesome/react-native-fontawesome';
import { faPlus } from '@fortawesome/free-solid-svg-icons';
import { useIsFocused } from "@react-navigation/native";
import AsyncStorage from "@react-native-community/async-storage";

const Dashboard = ({navigation}) => {

  const isFocused = useIsFocused();
  useEffect(() => {
    getNotes();
  }, [isFocused])

  const [notes, setNotesList] = useState([]);

  const getNotes = async () => {
      var allnotes = await AsyncStorage.getItem("allNotes");
      console.log(allnotes);
      console.log("1");
      if (allnotes!=null) {
          allnotes = JSON.parse(allnotes);
      }
      setNotesList(allnotes);
  }

  return (
    <View style = {styles.container}>
    {
    notes!=null && notes.length!=0?
    <ScrollView>
        <NotesCards allnotes={notes} setallNotes = {setNotesList}></NotesCards>
    </ScrollView>
      :
    <View>
        <Text style={styles.emptyText}>
            Add Some Notes    
        </Text>
    </View>
    }
    <TouchableOpacity onPress={() => {navigation.navigate("Add Notes")}} style={styles.fab}>
        <FontAwesomeIcon icon={ faPlus } size={20}/>
    </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#FEEAE6"
  },
  fab: { 
    position: 'absolute', 
    width: 56, 
    height: 56, 
    alignItems: 'center', 
    justifyContent: 'center', 
    backgroundColor: '#FFF', 
    borderRadius: 30, 
    right: 20, 
    bottom: 5,
    elevation: 2,
    color: '#000' 
  },
  emptyText: {
    fontSize: 16,
    color: "black",
    padding: 20,
    fontWeight: "200",
    fontStyle: "italic"
  }, 
});

export default Dashboard