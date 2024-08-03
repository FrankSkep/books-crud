<script>
    import { onMount } from 'svelte';
    import { writable } from 'svelte/store';
    import ListBooks from '../lib/ListBooks.svelte';

    let books = writable([]);

    onMount(async () => {
        await fetchBooks();
    });

    async function fetchBooks() {
        const response = await fetch('http://localhost:8000/book');
        const data = await response.json();
        books.set(data);
    }
</script>

<ListBooks {books} />