import React, {useState} from 'react';
import { Link } from 'react-router-dom';
export const Login = (props) => {
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(email);
    }

    return (
        <div className='b'>
        <div className="auth-form-container">
        <center>
            <h2>LOGIN</h2>
            <form className="login-form" onSubmit={handleSubmit}>
                <label htmlFor="email">EMAIL</label>
                <input value={email} onChange={(e) => setEmail(e.target.value)} type="EMAIL" placeholder="Enter the email" id="email" name="email" />
                <label htmlFor="password">PASSWORD</label>
                <input value={pass} onChange={(e) => setPass(e.target.value)} type="PASSWORD" placeholder="Enter the password" id="password" name="password" />
                <button type="submit">LOGIN </button>
            </form>
            <Link  to="/reg">Don't have an account? Register here.</Link>
            
            </center>
        </div>
        </div>
    )
}
export default Login;