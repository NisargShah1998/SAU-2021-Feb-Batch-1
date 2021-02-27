import React from 'react';
import { StyleSheet} from 'react-native';
import { createStackNavigator } from "@react-navigation/stack";
import { NavigationContainer } from "@react-navigation/native";
import Login from './Components/Login';
import Dashboard from './Components/Dashboard';
import { AddNotes } from './Components/AddNotes';
import { enableScreens } from 'react-native-screens';

enableScreens();

const Stack = createStackNavigator();


export default function App() {

  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name = "Login" component ={Login}/>
        <Stack.Screen name = "Dashboard" component ={Dashboard}/>
        <Stack.Screen name = "Add Notes" component ={AddNotes}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#FEEAE6",
    alignItems: 'center',
    justifyContent: 'center',
  },
});
