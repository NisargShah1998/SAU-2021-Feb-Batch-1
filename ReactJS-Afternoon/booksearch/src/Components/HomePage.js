import {getBookData} from "../bookdata";
import React,{useState} from "react";
import TextField from '@material-ui/core/TextField';
import { makeStyles } from '@material-ui/core/styles';
import { CardContent, Grid } from "@material-ui/core";
import {BookList} from './BookList'

const useStyles = makeStyles((theme) => ({
    root: {
      '& > *': {
        margin: theme.spacing(1),
        width: '98%',
      },
    },
}));

const useStyles1 = makeStyles({
    root: {
      minWidth: 200,
    },
    title: {
      fontSize: 14
    },
    pos: {
      marginBottom: 12
    },
    gridContainer: {
      paddingLeft: "40px",
      paddingRight: "40px",
    }
});
export  function HomePage(){

    const [searchItem, setSearchItem] = useState('##');
    const [books, setBooks] = useState(getBookData());
    const classess = useStyles();
    const classes = useStyles1();
    
    const GetBookList = ({books}) =>
    {
         return ( <Grid container
        spacing={4}
        className={classes.gridContainer}
        >  
        <BookList books={books}></BookList>
        </Grid>
       )
    };

    const Search = () =>
    {
        if(searchItem=='##')
            return books;
        return books.filter((item) => item.title.toLowerCase().includes(searchItem.toLowerCase()));
    };

    const setItem = (e) =>
    {
        if(e.target.value !== '')
            setSearchItem(e.target.value);
        else
            setSearchItem('##');

    }

    return(
        <div>
            <div>
                <h1 align="Center">Books List</h1>
            </div>
            <form className={classess.root} noValidate autoComplete="off">
                <TextField id="outlined-basic" onChange={setItem} label="Enter Book Name" variant="outlined" />
                <GetBookList books= {Search()} />
            </form>
        </div>
    )
}