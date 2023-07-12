import React, { useState } from "react";

export const Register = (props) => {
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');
    const [name, setName] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(email);
    }

    return (
        <div className="auth-form-container">
            <h2>REGISTER</h2>
        <form className="register-form" onSubmit={handleSubmit}>
        <br></br> <label htmlFor="name">Full name</label>
          <input value={name} name="name" onChange={(e) => setName(e.target.value)} id="name" placeholder="full Name" />  <br></br>
          <br></br> <label htmlFor="email">Email</label>
            <input value={email} onChange={(e) => setEmail(e.target.value)}type="email" placeholder="youremail@gmail.com" id="email" name="email" />  <br></br>
            <br></br> <label htmlFor="password">password</label>
            <input value={pass} onChange={(e) => setPass(e.target.value)} type="password" placeholder="****" id="password" name="password" />  <br></br>
            <br></br>   <button type="submit">Register</button>
        </form>
        <br></br><button className="link-btn" onClick={() => props.onFormSwitch('login')}>Existing account? Login here.</button>  <br></br>
    </div>
    )
}