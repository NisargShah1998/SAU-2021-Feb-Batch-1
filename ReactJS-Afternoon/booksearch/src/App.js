import './App.css';
import {Switch,BrowserRouter,Route} from "react-router-dom";
import {BookDetails} from "./Components/BookDetail";
import {getBookData} from "./bookdata";
import {HomePage} from './Components/HomePage'



function App() {

  const routingId = (props) =>{
      const id = props.match.params.Id;

      return (
          <BookDetails book={getBookData().filter((item)=> item.id === id)[0]}/>
      )
  }

  return (
    <div>
        <BrowserRouter>
            <Switch>
                <Route path={'/'} component={HomePage} exact></Route>
                <Route path={'/:Id'} component={routingId}></Route>
            </Switch>
        </BrowserRouter>
    </div>
  );
}

export default App;
