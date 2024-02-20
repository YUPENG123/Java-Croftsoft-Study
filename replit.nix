# { pkgs }: {
#     deps = [
#       pkgs.gradle
#       pkgs.ant
#       pkgs.unzip
#         pkgs.graalvm17-ce
#         pkgs.maven
#         pkgs.replitPackages.jdt-language-server
#         pkgs.replitPackages.java-debug
#     ];
# }

# { pkgs, legacyPolygott }: {
# 	deps = [
# 		pkgs.bashInteractive
# 	] ++ legacyPolygott;
# }

 # environment.systemPackages = [
 #    pkgs.zulu8
 #  ]

{ pkgs }: {
    deps = [
      pkgs.unzip
      pkgs.vim
      pkgs.ant
    ];
}