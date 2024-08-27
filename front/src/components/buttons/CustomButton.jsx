import React from 'react'

export default function CustomButton({ children, styles, type = 'button' }) {
	return (
		<button className='custom-button' type={type} style={styles}>
			{children}
		</button>
	)
}
