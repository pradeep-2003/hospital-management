
import './App.css';
// import './style.css';
import Registration from './home';
import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import { Login } from './Login';
import { Register } from './Register';
import Service from './Service';
import About from './About';
import Contact from './Contact';
function App() {
  return (
    <div className='App1'>
      <Router>
        <Routes>
        <Route path="/" element={<Registration />} />
          <Route path="/Login" element={<Login />} />
          <Route path="/reg" element={<Register />} />
          <Route path="/service" element={<Service/>}/>
          <Route path="/About" element={<About/>}/>
          <Route path="/Contact" element={<Contact/>}/>
        </Routes>
      </Router>

    </div>
  );
}

export default App;