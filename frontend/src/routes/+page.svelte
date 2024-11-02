<script>
    import { onMount } from 'svelte';
    import { writable } from 'svelte/store';
    import ListBooks from '../lib/ListBooks.svelte';

    let books = writable([]);

    onMount(async () => {
        const response = await fetch('http://localhost:8000/api/books');
        const data = await response.json();
        books.set(data);
    });
</script>

<ListBooks {books} />