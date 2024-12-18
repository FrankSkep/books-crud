export async function load({ params }) {
    const response = await fetch(
        `http://localhost:8000/api/books/${params.id}`,
    );
    const book = await response.json();
    return book;
}
