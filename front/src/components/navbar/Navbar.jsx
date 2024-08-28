// import React from 'react'
import styles from './Navbar.module.css'
import { Link } from 'react-router-dom'

function Navbar() {
	return (
		<nav className={styles.navBar}>
			<ul className={styles.navBarList}>
				<li>
					<Link to='/'>Home</Link>
				</li>
			
				<li>
					<Link to='/login'>Iniciar sesión</Link>
				</li>
				<li>
					<Link to='/register'>Registrarse</Link>
				</li>
				<li>
					<Link to='/contact'>Contacto</Link>
				</li>
			</ul>
		</nav>
	)
}

export default Navbar
