import static com.google.devtools.build.lib.testutil.MoreAsserts.assertThrows;
import difflib.PatchFailedException;
public class PatchUtilTest {
  private FileSystem fs;
  private Scratch scratch;
  public final void initializeFileSystemAndDirectories() throws Exception {
    fs = new InMemoryFileSystem();
    scratch = new Scratch(fs, "/root");
            "new file mode 100644",
    assertThat(PatchUtil.readFile(newFile)).containsExactlyElementsIn(newFileContent);
    assertThat(PatchUtil.readFile(newFile)).containsExactlyElementsIn(newFileContent);
    assertThat(PatchUtil.readFile(oldFile)).isEmpty();
    assertThat(PatchUtil.readFile(oldFile)).containsExactlyElementsIn(newContent);
    assertThat(PatchUtil.readFile(newFile)).containsExactly("line one");
    assertThat(PatchUtil.readFile(newFile)).containsExactlyElementsIn(newContent);
    assertThat(PatchUtil.readFile(foo)).containsExactlyElementsIn(newFoo);
    assertThat(PatchUtil.readFile(bar)).containsExactlyElementsIn(newBar);
    assertThat(PatchUtil.readFile(fooCpp)).containsExactlyElementsIn(newFoo);
    assertThat(PatchUtil.readFile(barCpp)).containsExactlyElementsIn(newBar);
    assertThat(PatchUtil.readFile(foo)).containsExactlyElementsIn(newFoo);
    assertThat(PatchUtil.readFile(foo)).containsExactlyElementsIn(newFoo);
            "diff --git a/foo.cc b/foo.cc",