import React from "react";

function Fun(){
    const [counter, setCounter] = React.useState(0)

    function addFun(){
        setCounter(counter + 1)
    }

    return (
        <>
            <h1>Fun counter { counter }</h1>
            <button onClick={ addFun }>More fun</button>
            <button onClick={ () => setCounter(counter - 1) }>Remove fun</button>
        </>
    )
}

export default Fun
