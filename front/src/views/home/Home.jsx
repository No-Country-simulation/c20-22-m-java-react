// import React from 'react'

import styles from './Home.module.css'

function Home() {
	return (
		<main className={styles.container}>
			<h1 className={styles.title}>Título de la app</h1>
			<p className={styles.subtitle}>Perdiste tu mascota? Encontraste una mascota perdida? </p>
			<p className={styles.subtitle}>Aquí las mascotas y sus humanos se reencuentran</p>

			<div className={styles.buttonsContainer}>
				<button type='button' className={styles.buttonPerdi} onClick={() => console.log('click')}>
					Perdí mi mascota
				</button>
				<button type='button' className={styles.buttonEncontre} onClick={() => console.log('click')}>
					Encontré una mascota
				</button>
			</div>
		</main>
	)
}

export default Home
