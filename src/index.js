import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import App from './App';
import Volunteers from "./routes/volunteers";
import Volunteer from "./routes/volunteer";
import Disableds from "./routes/disableds";
import Disabled from "./routes/disabled";
import Disableded from "./routes/disableded";
import About from "./routes/about";
import Home from "./routes/home";
import Login from "./routes/login";
import Register from "./routes/register";
import './routes/h.css';


ReactDOM.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />}>
        <Route path="/login" element={<Login />}>
        </Route>
        <Route path="/register" element={<Register />}>
        </Route>
        <Route path="home" element={<Home />} />
        <Route path="volunteers" element={<Volunteers />} />
        <Route path="volunteer" element={<Volunteer />} />
        <Route path="/disableds" element={<Disableds />} />
        <Route path="/disabled" element={<Disabled />} />
        <Route path="/disableded" element={<Disableded />} />
        <Route path="/about" element={<About />} />
        

      </Route>
    </Routes>
  </BrowserRouter>

  , document.getElementById('root'));
