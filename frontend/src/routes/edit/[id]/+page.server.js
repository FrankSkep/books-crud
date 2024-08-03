export async function load({ params }) {
    let id = params.id;
    
    // Obtengo el libro por su id
    const response = await fetch(`http://localhost:8000/book/${id}`);
    const book = await response.json();
    
    return book;
}