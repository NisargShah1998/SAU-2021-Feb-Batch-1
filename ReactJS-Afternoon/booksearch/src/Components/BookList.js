import React, {useState} from 'react';
import "../App.css";
import {Link} from "react-router-dom";
import Card from "@material-ui/core/Card";
import CardContent from "@material-ui/core/CardContent";
import { Grid } from "@material-ui/core";
import { makeStyles } from "@material-ui/core/styles";


const useStyles = makeStyles({
    root: {
      backgroundColor: 'lightgray',
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

export const BookList= ({books}) =>{
    const classes = useStyles();
    // const [books] = useState(getData());

    return books.map((book) =>
    {
       
        return(
            <Grid item xs={12} sm={6} md={4}>
            <Card className={classes.root} variant="outlined">
            <CardContent>
            <div key = {book.id}>
                <h2>{book.id}</h2>
                <h3>{book.title}</h3>
                <p>Writer: {book.author}</p>
                <Link to={`/${book.id}`}> <button>View Description</button></Link>
            </div>
            </CardContent>
          </Card>
          </Grid>
        )   
    });
};