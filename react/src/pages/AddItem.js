import AddCategoryForm from "../componets/AddCategoryForm";
import AddItemForm from "../componets/AddItemForm";

function AddItem(){
    function itemSubmitHandler(item){
        fetch('http://localhost:8080/items', {
            method: 'POST',
            body: JSON.stringify(item),
            headers:{
                'Content-type' : 'application/json'
            }
        })
    }

    function categorySubmitHandler(category){
        fetch('http://localhost:8080/itemcategories', {
            method: 'POST',
            body: JSON.stringify(category),
            headers:{
                'Content-type' : 'application/json'
            }
        })
    }

    return (
        <div>
            <h1>Lisa uus ese</h1>
        
            <AddItemForm onAddItem={itemSubmitHandler}/>
            
            <h1>Lisa uus kategooria</h1>

            <AddCategoryForm onAddCategory={categorySubmitHandler}/>

        </div>
    )
}

export default AddItem;