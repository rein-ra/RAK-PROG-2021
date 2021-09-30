import ItemList from "../componets/ItemList"
import CategoryList from "../componets/CategoryList"
import { Link } from 'react-router-dom';
import { useState, useEffect } from 'react'

function Home(){

    const [isLoading, setIsLoading] = useState(true)
    const [loadedItems, setLoadedItems] = useState([])
    const [loadedCategories, setLoadedCategories] = useState([])

    useEffect(()=>{
        fetch('http://localhost:8080/items').then(res => {
            return res.json()
        }).then(data =>{
            console.log(data)
            setLoadedItems(data)
        })
    }, [])

    useEffect(()=>{
        fetch('http://localhost:8080/itemcategories').then(res => {
            return res.json()
        }).then(data =>{
            console.log(data)
            setIsLoading(false)
            setLoadedCategories(data)
        })
    }, [])
    

    if (isLoading) {
        return(<div>Laeb...</div>)
    }

    return (
        <div>
            <h2>Lisatud tooted:</h2>

            <ItemList items={loadedItems}/>

            <h2>Kategooriad:</h2>
            
            <CategoryList category={loadedCategories}/>

            <Link to="add-item">
                <button>Lisa uus</button>
            </Link>
        </div>
    )
}

export default Home;