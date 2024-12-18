<script>
    import { goto } from '$app/navigation';
    import { writable } from 'svelte/store';

    let books = writable([]); // store the books in a writable store

    let currentPage = 0;
    let totalPages = 1;

    async function fetchBooks(page = 0) {
        const response = await fetch(`http://localhost:8000/api/books?page=${page}`);
        const data = await response.json();
        books.set(data.content || []);
        currentPage = data.pageable.pageNumber;
        totalPages = data.totalPages;
    }

    function navigateToEditBook(id) {
        goto(`/edit/${id}`);
    }

    function navigateToDelBook(id) {
        const confirmed = confirm('Are you sure you want to delete this book?');
        if (confirmed) {
            goto(`/delete/${id}`);
        }
    }

    function nextPage() {
        fetchBooks(currentPage + 1);
    }

    function prevPage() {
        fetchBooks(currentPage - 1);
    }

    fetchBooks();
</script>

<h2 class="text-center my-4">Book List</h2>

<div class="table-responsive">
    <table class="table table-striped table-hover">
        <thead class="table-dark">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
                <th scope="col">Edition</th>
                <th scope="col">Pages</th>
                <th scope="col">Actions</th>
            </tr>
        </thead>
        <tbody>
            {#each $books as book}
                <tr>
                    <td>{book.id}</td>
                    <td>{book.title}</td>
                    <td>{book.author}</td>
                    <td>{book.edition}</td>
                    <td>{book.numberOfPages}</td>
                    <td>
                        <button class="btn btn-primary btn-sm me-2" on:click={() => navigateToEditBook(book.id)}>Edit</button>
                        <button class="btn btn-danger btn-sm" on:click={() => navigateToDelBook(book.id)}>Delete</button>
                    </td>
                </tr>
            {/each}
        </tbody>
    </table>
</div>

<div class="d-flex justify-content-between">
    <button class="btn btn-secondary" on:click={prevPage} disabled={currentPage === 0}>Previous</button>
    <button class="btn btn-secondary" on:click={nextPage} disabled={currentPage >= totalPages - 1}>Next</button>
</div>