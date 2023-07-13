import React, { useState } from "react";
import { Link } from "react-router-dom";
import './App.css';

export const Register = (props) => {
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');
    const [name, setName] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(email);
    }

    return (
        <div className="b">
        
        <div className="auth-form-container">
        <center>
            <h2>REGISTER</h2>
            <form className="register-form" onSubmit={handleSubmit}>
          
                <label htmlFor="name">FULL NAME</label>
                <input value={name} name="name" onChange={(e) => setName(e.target.value)} id="name" placeholder="Enter your Name" />
                <label htmlFor="email">EMAIL</label>
                <input value={email} onChange={(e) => setEmail(e.target.value)} type="email" placeholder="Enter Email" id="email" name="email" />
                <label htmlFor="password">PASSWORD</label>
                <input value={pass} onChange={(e) => setPass(e.target.value)} type="password" placeholder="Enter password" id="password" name="password" />
                <button type="submit">REGISTER</button>
                
            </form>
            <Link to="/Login">Already have an account? Login here.</Link>
            </center>
        </div>
        </div>
    )
}
