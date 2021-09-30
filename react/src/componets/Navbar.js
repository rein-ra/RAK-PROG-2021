import './navbar.css'
import { Link } from 'react-router-dom';

function Navbar(){
    return (
        <div className="navbar">
            <Link to="/">
                <img className="webbanner" src="webstor.png" alt="banner"/>
            </Link>
            <Link to="cart">
                <img className="cartico" src="trolley.svg" alt="norm käru"/>
            </Link>
        </div>
    )
}

export default Navbar;