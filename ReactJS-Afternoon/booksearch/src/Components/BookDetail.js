import Card from "@material-ui/core/Card";
import CardContent from "@material-ui/core/CardContent";
import { makeStyles } from "@material-ui/core/styles";


const useStyles = makeStyles({
    root: {
      backgroundColor: 'lightgray',
      marginTop: '10%',
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

export const BookDetails = ({book}) =>
{
    const classes = useStyles();
    return(
        <Card className={classes.root} variant="outlined">
        <CardContent>
        <div key = {book.id}>
            <h2>Book Id: {book.id}</h2>
            <h3>Title:   {book.title}</h3>
            <p>Author:   {book.author}</p>
            <p>Description: {book.description}</p>
        </div>
        </CardContent>
      </Card>
    )
}