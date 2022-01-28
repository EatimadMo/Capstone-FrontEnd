import React, { useState, useContext } from 'react'
import { Link } from 'react-router-dom'
import { useNavigate } from 'react-router-dom';
import axios from "axios"
import './h.css'

export default function Login() {

    const navigate = useNavigate();
    const [email, setEmail] = useState('')
    const [password, setPassword] = useState('')
    function login(e) {
        let disabled = {
            email: email,
            password: password,
        }
        e.preventDefault();
        console.log({ email, password });
        axios({
            method: "get",
            url: 'https://databaseinspir.herokuapp.com/api/inspir/login',
            params: { email: email, password: password }
        })
            .then((res => {
                console.log(res.data)
                if (res.data == "authenticated") {
                    localStorage.setItem("isLoggedln", "yes")
                    window.open("/Home", "_self")
                }
                else {
                    alert(res.data)
                }
            }))
    }
    return (
        <div class="form">
            <div class="pen-title">
                <h1>Log In </h1>
            </div>
            <div class="container">
                <form>
                   Email<br></br>{" "}

                    <input placeholder="Enter.." type="email" required="required" onChange={e => setEmail(e.target.value)} />
                    <br></br>
                    <br></br>

                    Password<br></br>{" "}

                    <input placeholder="Enter.." type="password" required="required" onChange={e => setPassword(e.target.value)} />
                    <br></br>
                    <br></br>

                    <button class="b" onClick={login}> <Link to="/login"></Link> Login</button>
                    <br></br>
                </form>
            </div>
        </div>
    )
}