import { Route, Routes } from 'react-router-dom'
import './App.css'
import Navbar from './components/navbar/Navbar'
import Home from './views/home/Home'
import Login from './views/login/Login'
import ErrorPage from './views/ErrorPage/ErrorPage'
import Detail from './views/detail/Detail'

function App() {
	return (
		<>
			<Navbar />
			<Routes>
				<Route path='/' element={<Home />} />
				<Route path='/login' element={<Login />} />
				<Route path='/detail' element={<Detail />} />
				<Route path='/*' element={<ErrorPage />} />
			</Routes>

		</>
	)
}

export default App
