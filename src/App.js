import React from "react";
import { Outlet, Link } from "react-router-dom";
import './routes/h.css';
import Pic from "./routes/img/Pic.jpg";
import twitter from "./routes/img/twitter.png";
import facebook from "./routes/img/facebook.png";
import instagram from "./routes/img/instagram.png";

export default function App() {
  let loggedIn = localStorage.getItem("isLoggedln")
  if (loggedIn != "yes") {
    return (
      <div>
        <header>
          <h2>Inspir</h2>
        </header>
        <marquee class="up"> Jops Advertisement</marquee>
        <img src={Pic} className="pic" />

        <nav>
          <Link to='/home'><button class="button">Home</button></Link>
          <Link to='/register' ><button class="button">Register</button></Link>
          {/* <Link to='/Disabled'><button class="button">Types</button></Link> */}
          {/* <Link to='/Disableded'><button class="button">Disableds</button></Link> */}
          {/* <Link to='/Volunteer'><button class="button">Volunteer</button></Link> */}
          {/* <Link to='/Volunteers'><button class="button">Volunteers</button></Link> */}
          <Link to='/About'><button class="button">About</button></Link>
          {/* <Link to='/Disableds'><button class="button">Users</button></Link> */}
          <Link to='/login'><button class="button">Login</button></Link>
        </nav>

        <Outlet></Outlet>

        <footer>
        <a class="a" href="https://twitter.com/i/flow/login" ><img src={twitter} width={55} /></a>
        <a class="a" href="https://www.facebook.com/login/"><img src={facebook} width={55} /></a>
        <a class="a" href="https://www.instagram.com/accounts/login/" ><img src={instagram} width={55} /></a>
      </footer>

      </div>)
  }
  return (
    <div>
      <header>
        <h2>Inspir</h2>
      </header>
      <marquee class="up"> jops advertisement</marquee>
      <img src={Pic} className="pic" />

      <nav>
        <Link to='/home'><button class="button">Home</button></Link>
        <Link to='/register' ><button class="button">Register</button></Link>
        <Link to='/Disabled'><button class="button">Types</button></Link>
        <Link to='/Disableded'><button class="button">Disableds</button></Link>
        <Link to='/Volunteer'><button class="button">Volunteer</button></Link>
        <Link to='/Volunteers'><button class="button">Volunteers</button></Link>
        <Link to='/Disableds'><button class="button">Users</button></Link>
        <Link to='/About'><button class="button">About</button></Link>
        <Link onClick={() => { localStorage.setItem("isLoggedln", "no"); window.open("/login", "_self") }} to='/' ><button class="button">Logout</button></Link>
      </nav>

      <Outlet></Outlet>

      <footer>
        <a class="a" href="https://twitter.com/i/flow/login" ><img src={twitter} width={55} /></a>
        <a class="a" href="https://www.facebook.com/login/"><img src={facebook} width={55} /></a>
        <a class="a" href="https://www.instagram.com/accounts/login/" ><img src={instagram} width={55} /></a>
      </footer>

    </div>
  )
}