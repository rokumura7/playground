<template>
  <button
    class="px-2 text-white bg-blue-500 rounded hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500 focus:ring-opacity-50"
    @click="submit"
  >
    {{ label }}
  </button>
</template>

<script lang="ts">
import { defineComponent, SetupContext } from 'vue'

export default defineComponent({
  name: 'MyButton',
  props: {
    label: {
      type: String,
      default: "I'm button!",
    },
  },
  setup(props: { label: string }, context: SetupContext) {
    const submit = () => context.emit('submit')
    return {
      submit,
    }
  },
})
</script>
