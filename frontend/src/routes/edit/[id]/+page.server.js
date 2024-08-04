export async function load({ params }) {
    let id = params.id;
    
    // Obtencion del libro
    const response = await fetch(`http://localhost:8000/book/${id}`);
    const book = await response.json();
    
    return book;
}