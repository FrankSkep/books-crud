<script>
	import Navbar from './../lib/Navbar.svelte';
	import Toast from './../lib/Toast.svelte';
</script>


<Navbar />

<div class="container-md">
  <Toast />
  <slot />
</div>