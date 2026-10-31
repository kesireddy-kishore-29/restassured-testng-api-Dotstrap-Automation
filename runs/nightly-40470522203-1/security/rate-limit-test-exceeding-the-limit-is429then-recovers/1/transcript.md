# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 411 | `qa-66359b96-2433-4dfd-9720-7b983ba71f49` |
| 2 | `POST /v1/auth/token` | 200 | 45 | `qa-4d95e1a6-b16a-4d32-8611-089460f1c322` |
| 3 | `GET /v1/accounts/me` | 200 | 33 | `qa-bb5d1e44-f840-431a-ad62-c6cf41864dc1` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-d4367dd9-2fc8-4a0f-b725-b98d5ab0a114` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-2bb5ce52-b5f4-4c00-a5a3-e8d9a6a9e6b6` |
| 6 | `GET /v1/accounts/me` | 200 | 9 | `qa-2db9a2d0-6851-4f9c-adbc-5a84b04f0dd8` |
| 7 | `GET /v1/accounts/me` | 200 | 16 | `qa-86c88844-68d6-420a-965d-6e55e14b3667` |
| 8 | `GET /v1/accounts/me` | 200 | 21 | `qa-eb72f8fc-7cf3-4562-ac8a-b24cf3594c4d` |
| 9 | `GET /v1/accounts/me` | 200 | 19 | `qa-826bcb2a-1287-4633-a918-1274f09ea325` |
| 10 | `GET /v1/accounts/me` | 200 | 14 | `qa-bf0527a1-f29c-4eb6-996c-45c97daf3c5d` |
| 11 | `GET /v1/accounts/me` | 200 | 10 | `qa-98e95fd1-e762-4dcd-8ea6-a1d54693d986` |
| 12 | `GET /v1/accounts/me` | 200 | 10 | `qa-42349111-745c-438e-8be1-a0f3602cb5e3` |
| 13 | `GET /v1/accounts/me` | 200 | 7 | `qa-b231236f-6662-41b6-82d0-a97851b45958` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-00e03962-6328-4ec8-84d9-d7d36c9e46e1` |
| 15 | `GET /v1/accounts/me` | 200 | 14 | `qa-957a26f4-bd70-45e4-8097-9d27b133f61e` |
| 16 | `GET /v1/accounts/me` | 200 | 12 | `qa-4cc97131-1ef9-4134-85ee-48ff85594150` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-81bc07fa-4b74-4226-9268-e2dceb907c51` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-4ea353a9-647a-4ee7-a2af-9e1baf0ef50c` |
| 19 | `GET /v1/accounts/me` | 200 | 9 | `qa-96a79f2d-a327-42f6-a08d-76b0ca94e504` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-7b48b61b-4d46-4c2d-b173-432a0b4c604a` |
| 21 | `GET /v1/accounts/me` | 200 | 13 | `qa-492cd58b-3c0a-40aa-aa08-6462cace2ab8` |
| 22 | `GET /v1/accounts/me` | 200 | 14 | `qa-a2554b0f-2616-4568-b3e3-d9ffd9c53a7b` |
| 23 | `GET /v1/accounts/me` | 200 | 7 | `qa-833dc1f7-b8d0-4411-a887-de48de8f76c9` |
| 24 | `GET /v1/accounts/me` | 200 | 12 | `qa-499b47e7-2121-4eb1-9b0c-af230d583073` |
| 25 | `GET /v1/accounts/me` | 200 | 10 | `qa-cd9f0b75-6373-42c3-bb37-cfd9ec86736c` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-0b8cb366-dfa6-4daf-a90a-9c65237a395e` |
| 27 | `GET /v1/accounts/me` | 200 | 5 | `qa-35439c74-0429-4c94-ba7c-e92fa5536ab7` |
| 28 | `GET /v1/accounts/me` | 200 | 5 | `qa-d21d4d4d-1eed-4194-954d-b59cd54e32f0` |
| 29 | `GET /v1/accounts/me` | 200 | 6 | `qa-61069ae2-22db-4ead-a79e-de9429acd24d` |
| 30 | `GET /v1/accounts/me` | 200 | 10 | `qa-f7d146cd-fbeb-4061-a741-47ac56f11fb6` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-a32cc079-598a-4d88-acc1-53401068a4a6` |
| 32 | `GET /v1/accounts/me` | 200 | 10 | `qa-41995ce6-d08b-42f0-9e3b-d17929ff7e7d` |
| 33 | `GET /v1/accounts/me` | 200 | 11 | `qa-8d74cef9-5256-4bfb-9135-f7114ea0b9b3` |
| 34 | `GET /v1/accounts/me` | 200 | 9 | `qa-f6870581-695a-4b76-a4fc-f76bf0382332` |
| 35 | `GET /v1/accounts/me` | 200 | 11 | `qa-1ac237b6-6311-4b8f-9718-95ec5acc58d0` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-4fafd518-5f6d-4d41-bb4f-05f93815c644` |
| 37 | `GET /v1/accounts/me` | 200 | 13 | `qa-2897a101-ea4a-4d56-af60-8169067dee65` |
| 38 | `GET /v1/accounts/me` | 200 | 6 | `qa-100aa301-48cf-4c10-846a-96fdbf6a56f4` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-f9fa542f-369c-44bb-8ae0-e8ba2d0fa321` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-15ad51b6-1504-445a-aeb3-48f8f6a59af9` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-77f22779-18b1-4b16-b8f6-ecb53da8cc4d` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-150a74ff-a2c1-44b6-924e-8cb9d6891a84` |
| 43 | `GET /v1/accounts/me` | 200 | 10 | `qa-855f8db0-8ddb-4db2-82a2-6ff8cc594133` |
| 44 | `GET /v1/accounts/me` | 200 | 15 | `qa-48ef1180-921a-4e1f-bcca-1cfc56b11f87` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-7c336eb4-8791-4b4a-81f3-26d22cd3af34` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-c39a6743-6649-4930-a5cd-a6bc9a525fe4` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-be252774-2eb9-490d-91d0-91a1936dcafb` |
| 48 | `GET /v1/accounts/me` | 200 | 6 | `qa-3fca6287-dd8d-4a81-ace6-8fa6235963a1` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-230a53e7-88d9-4882-8274-9980ad68eaae` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-cd70418c-863a-4d17-b1df-ec0c7c797b90` |
| 51 | `GET /v1/accounts/me` | 200 | 4 | `qa-83b07274-cfc3-408e-9842-9783a0d82d75` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-65da40d5-5dce-4076-83d1-ff6c71fc43d8` |
| 53 | `GET /v1/accounts/me` | 200 | 4 | `qa-a02d0319-fb2d-40ff-a684-98e006f26945` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-de096a30-669e-46d4-a120-12ff7c89ee53` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-8620b42b-a9b3-4e99-9393-cbf6c940f438` |
| 56 | `GET /v1/accounts/me` | 200 | 4 | `qa-1d0b23ce-bab2-4235-9300-8a1034d3465f` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-67613646-c30b-46ee-b369-4b56e28e5e75` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-88096a0e-218a-4cb4-9268-4d0a7b22ceaa` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-ada60884-43fe-49e4-8540-982fdc935e34` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-7cc67dcb-edb1-4450-ade4-e9cd74c83b0e` |
| 61 | `GET /v1/accounts/me` | 200 | 9 | `qa-b5228ecc-f83c-4fee-b7f6-4398210b9d5a` |
| 62 | `GET /v1/accounts/me` | 200 | 12 | `qa-c0ee11eb-32f1-4be0-8756-bc870172526d` |
| 63 | `GET /v1/accounts/me` | 429 | 9 | `qa-683154a7-f32a-4a8e-bd3d-7673cffb03ba` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-217ae746-1aa3-4b36-a872-14a66c9b454a` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-fb0b7c08-d8b9-427b-8658-65a1791f183e` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-4113819a-f089-41b3-b5dd-334bd0aaac32` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-9689b2a6-0c64-453b-9291-d2d976ee2491` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-e3d7125d-67ec-4ef7-803f-c381456c19c6` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-b4d4272d-696c-4849-8b9e-5bfb626cc062` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-fe103049-be51-465a-bc5e-8bcffd4ca192` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-8d691a42-cbe8-4ce2-afec-e468283a4efe` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-3e4c5774-0f7a-4bf4-b6b2-7214784c082b` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-8e50cb36-3786-4bce-b7e1-80b2ac1b52c1` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-30d69e9c-6bc7-460b-a11d-d57f6c5b9d93` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-9019c9a4-08ac-44be-98c7-01c673263221` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-3cd0f276-ea6a-4de2-af64-bae41119b8ab` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-0dd2b726-6a88-43e0-8e00-b9c8134c0c56` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-573cd728-10d8-4d8d-bb25-0bd239b87129` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-9ddd67c9-ed2e-4272-9733-52e5b9b26c10` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-38b62a50-ccd6-450f-a00b-936b75e08007` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-47a7bcd5-92df-4904-8891-e13cc7b29440` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f2030356-ae59-4ba1-a199-501a5d29d476` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-77020b29-9bb7-4651-99f8-de41048649a7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-66359b96-2433-4dfd-9720-7b983ba71f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66359b96-2433-4dfd-9720-7b983ba71f49
Content-Type: application/json

--- request body ---
{"handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","password":"****","region":"eu"}

--- response: 201 in 411 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-66359b96-2433-4dfd-9720-7b983ba71f49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-211c20ef0694
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4d95e1a6-b16a-4d32-8611-089460f1c322

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d95e1a6-b16a-4d32-8611-089460f1c322
Content-Type: application/json

--- request body ---
{"handle":"qa-211c20ef0694","password":"****"}

--- response: 200 in 45 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d95e1a6-b16a-4d32-8611-089460f1c322
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb5d1e44-f840-431a-ad62-c6cf41864dc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb5d1e44-f840-431a-ad62-c6cf41864dc1
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb5d1e44-f840-431a-ad62-c6cf41864dc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4367dd9-2fc8-4a0f-b725-b98d5ab0a114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4367dd9-2fc8-4a0f-b725-b98d5ab0a114
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4367dd9-2fc8-4a0f-b725-b98d5ab0a114
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bb5ce52-b5f4-4c00-a5a3-e8d9a6a9e6b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb5ce52-b5f4-4c00-a5a3-e8d9a6a9e6b6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bb5ce52-b5f4-4c00-a5a3-e8d9a6a9e6b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-2db9a2d0-6851-4f9c-adbc-5a84b04f0dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db9a2d0-6851-4f9c-adbc-5a84b04f0dd8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db9a2d0-6851-4f9c-adbc-5a84b04f0dd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-86c88844-68d6-420a-965d-6e55e14b3667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c88844-68d6-420a-965d-6e55e14b3667
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c88844-68d6-420a-965d-6e55e14b3667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb72f8fc-7cf3-4562-ac8a-b24cf3594c4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb72f8fc-7cf3-4562-ac8a-b24cf3594c4d
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb72f8fc-7cf3-4562-ac8a-b24cf3594c4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-826bcb2a-1287-4633-a918-1274f09ea325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-826bcb2a-1287-4633-a918-1274f09ea325
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-826bcb2a-1287-4633-a918-1274f09ea325
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf0527a1-f29c-4eb6-996c-45c97daf3c5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0527a1-f29c-4eb6-996c-45c97daf3c5d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf0527a1-f29c-4eb6-996c-45c97daf3c5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-98e95fd1-e762-4dcd-8ea6-a1d54693d986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98e95fd1-e762-4dcd-8ea6-a1d54693d986
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-98e95fd1-e762-4dcd-8ea6-a1d54693d986
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-42349111-745c-438e-8be1-a0f3602cb5e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42349111-745c-438e-8be1-a0f3602cb5e3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-42349111-745c-438e-8be1-a0f3602cb5e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-b231236f-6662-41b6-82d0-a97851b45958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b231236f-6662-41b6-82d0-a97851b45958
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b231236f-6662-41b6-82d0-a97851b45958
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-00e03962-6328-4ec8-84d9-d7d36c9e46e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e03962-6328-4ec8-84d9-d7d36c9e46e1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-00e03962-6328-4ec8-84d9-d7d36c9e46e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-957a26f4-bd70-45e4-8097-9d27b133f61e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-957a26f4-bd70-45e4-8097-9d27b133f61e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-957a26f4-bd70-45e4-8097-9d27b133f61e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cc97131-1ef9-4134-85ee-48ff85594150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc97131-1ef9-4134-85ee-48ff85594150
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cc97131-1ef9-4134-85ee-48ff85594150
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-81bc07fa-4b74-4226-9268-e2dceb907c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81bc07fa-4b74-4226-9268-e2dceb907c51
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-81bc07fa-4b74-4226-9268-e2dceb907c51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ea353a9-647a-4ee7-a2af-9e1baf0ef50c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ea353a9-647a-4ee7-a2af-9e1baf0ef50c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ea353a9-647a-4ee7-a2af-9e1baf0ef50c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-96a79f2d-a327-42f6-a08d-76b0ca94e504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96a79f2d-a327-42f6-a08d-76b0ca94e504
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-96a79f2d-a327-42f6-a08d-76b0ca94e504
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b48b61b-4d46-4c2d-b173-432a0b4c604a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b48b61b-4d46-4c2d-b173-432a0b4c604a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b48b61b-4d46-4c2d-b173-432a0b4c604a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-492cd58b-3c0a-40aa-aa08-6462cace2ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-492cd58b-3c0a-40aa-aa08-6462cace2ab8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-492cd58b-3c0a-40aa-aa08-6462cace2ab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2554b0f-2616-4568-b3e3-d9ffd9c53a7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2554b0f-2616-4568-b3e3-d9ffd9c53a7b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2554b0f-2616-4568-b3e3-d9ffd9c53a7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-833dc1f7-b8d0-4411-a887-de48de8f76c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833dc1f7-b8d0-4411-a887-de48de8f76c9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-833dc1f7-b8d0-4411-a887-de48de8f76c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-499b47e7-2121-4eb1-9b0c-af230d583073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-499b47e7-2121-4eb1-9b0c-af230d583073
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-499b47e7-2121-4eb1-9b0c-af230d583073
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd9f0b75-6373-42c3-bb37-cfd9ec86736c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd9f0b75-6373-42c3-bb37-cfd9ec86736c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd9f0b75-6373-42c3-bb37-cfd9ec86736c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b8cb366-dfa6-4daf-a90a-9c65237a395e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b8cb366-dfa6-4daf-a90a-9c65237a395e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b8cb366-dfa6-4daf-a90a-9c65237a395e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-35439c74-0429-4c94-ba7c-e92fa5536ab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35439c74-0429-4c94-ba7c-e92fa5536ab7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-35439c74-0429-4c94-ba7c-e92fa5536ab7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-d21d4d4d-1eed-4194-954d-b59cd54e32f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d21d4d4d-1eed-4194-954d-b59cd54e32f0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d21d4d4d-1eed-4194-954d-b59cd54e32f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-61069ae2-22db-4ead-a79e-de9429acd24d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61069ae2-22db-4ead-a79e-de9429acd24d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-61069ae2-22db-4ead-a79e-de9429acd24d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7d146cd-fbeb-4061-a741-47ac56f11fb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d146cd-fbeb-4061-a741-47ac56f11fb6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7d146cd-fbeb-4061-a741-47ac56f11fb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-a32cc079-598a-4d88-acc1-53401068a4a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a32cc079-598a-4d88-acc1-53401068a4a6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a32cc079-598a-4d88-acc1-53401068a4a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-41995ce6-d08b-42f0-9e3b-d17929ff7e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41995ce6-d08b-42f0-9e3b-d17929ff7e7d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-41995ce6-d08b-42f0-9e3b-d17929ff7e7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d74cef9-5256-4bfb-9135-f7114ea0b9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d74cef9-5256-4bfb-9135-f7114ea0b9b3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d74cef9-5256-4bfb-9135-f7114ea0b9b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6870581-695a-4b76-a4fc-f76bf0382332

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6870581-695a-4b76-a4fc-f76bf0382332
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6870581-695a-4b76-a4fc-f76bf0382332
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ac237b6-6311-4b8f-9718-95ec5acc58d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ac237b6-6311-4b8f-9718-95ec5acc58d0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ac237b6-6311-4b8f-9718-95ec5acc58d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-4fafd518-5f6d-4d41-bb4f-05f93815c644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fafd518-5f6d-4d41-bb4f-05f93815c644
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fafd518-5f6d-4d41-bb4f-05f93815c644
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-2897a101-ea4a-4d56-af60-8169067dee65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2897a101-ea4a-4d56-af60-8169067dee65
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2897a101-ea4a-4d56-af60-8169067dee65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-100aa301-48cf-4c10-846a-96fdbf6a56f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-100aa301-48cf-4c10-846a-96fdbf6a56f4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-100aa301-48cf-4c10-846a-96fdbf6a56f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9fa542f-369c-44bb-8ae0-e8ba2d0fa321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fa542f-369c-44bb-8ae0-e8ba2d0fa321
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9fa542f-369c-44bb-8ae0-e8ba2d0fa321
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-15ad51b6-1504-445a-aeb3-48f8f6a59af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ad51b6-1504-445a-aeb3-48f8f6a59af9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-15ad51b6-1504-445a-aeb3-48f8f6a59af9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-77f22779-18b1-4b16-b8f6-ecb53da8cc4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77f22779-18b1-4b16-b8f6-ecb53da8cc4d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-77f22779-18b1-4b16-b8f6-ecb53da8cc4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-150a74ff-a2c1-44b6-924e-8cb9d6891a84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150a74ff-a2c1-44b6-924e-8cb9d6891a84
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-150a74ff-a2c1-44b6-924e-8cb9d6891a84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-855f8db0-8ddb-4db2-82a2-6ff8cc594133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-855f8db0-8ddb-4db2-82a2-6ff8cc594133
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-855f8db0-8ddb-4db2-82a2-6ff8cc594133
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-48ef1180-921a-4e1f-bcca-1cfc56b11f87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ef1180-921a-4e1f-bcca-1cfc56b11f87
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-48ef1180-921a-4e1f-bcca-1cfc56b11f87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c336eb4-8791-4b4a-81f3-26d22cd3af34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c336eb4-8791-4b4a-81f3-26d22cd3af34
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c336eb4-8791-4b4a-81f3-26d22cd3af34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-c39a6743-6649-4930-a5cd-a6bc9a525fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39a6743-6649-4930-a5cd-a6bc9a525fe4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c39a6743-6649-4930-a5cd-a6bc9a525fe4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-be252774-2eb9-490d-91d0-91a1936dcafb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be252774-2eb9-490d-91d0-91a1936dcafb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-be252774-2eb9-490d-91d0-91a1936dcafb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-3fca6287-dd8d-4a81-ace6-8fa6235963a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fca6287-dd8d-4a81-ace6-8fa6235963a1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fca6287-dd8d-4a81-ace6-8fa6235963a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-230a53e7-88d9-4882-8274-9980ad68eaae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-230a53e7-88d9-4882-8274-9980ad68eaae
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-230a53e7-88d9-4882-8274-9980ad68eaae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd70418c-863a-4d17-b1df-ec0c7c797b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd70418c-863a-4d17-b1df-ec0c7c797b90
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd70418c-863a-4d17-b1df-ec0c7c797b90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-83b07274-cfc3-408e-9842-9783a0d82d75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83b07274-cfc3-408e-9842-9783a0d82d75
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-83b07274-cfc3-408e-9842-9783a0d82d75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-65da40d5-5dce-4076-83d1-ff6c71fc43d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65da40d5-5dce-4076-83d1-ff6c71fc43d8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-65da40d5-5dce-4076-83d1-ff6c71fc43d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-a02d0319-fb2d-40ff-a684-98e006f26945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a02d0319-fb2d-40ff-a684-98e006f26945
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a02d0319-fb2d-40ff-a684-98e006f26945
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-de096a30-669e-46d4-a120-12ff7c89ee53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de096a30-669e-46d4-a120-12ff7c89ee53
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-de096a30-669e-46d4-a120-12ff7c89ee53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-8620b42b-a9b3-4e99-9393-cbf6c940f438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8620b42b-a9b3-4e99-9393-cbf6c940f438
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-8620b42b-a9b3-4e99-9393-cbf6c940f438
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d0b23ce-bab2-4235-9300-8a1034d3465f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d0b23ce-bab2-4235-9300-8a1034d3465f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d0b23ce-bab2-4235-9300-8a1034d3465f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-67613646-c30b-46ee-b369-4b56e28e5e75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67613646-c30b-46ee-b369-4b56e28e5e75
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-67613646-c30b-46ee-b369-4b56e28e5e75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-88096a0e-218a-4cb4-9268-4d0a7b22ceaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88096a0e-218a-4cb4-9268-4d0a7b22ceaa
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-88096a0e-218a-4cb4-9268-4d0a7b22ceaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-ada60884-43fe-49e4-8540-982fdc935e34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada60884-43fe-49e4-8540-982fdc935e34
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada60884-43fe-49e4-8540-982fdc935e34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cc67dcb-edb1-4450-ade4-e9cd74c83b0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cc67dcb-edb1-4450-ade4-e9cd74c83b0e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cc67dcb-edb1-4450-ade4-e9cd74c83b0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5228ecc-f83c-4fee-b7f6-4398210b9d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5228ecc-f83c-4fee-b7f6-4398210b9d5a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5228ecc-f83c-4fee-b7f6-4398210b9d5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0ee11eb-32f1-4be0-8756-bc870172526d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ee11eb-32f1-4be0-8756-bc870172526d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0ee11eb-32f1-4be0-8756-bc870172526d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-683154a7-f32a-4a8e-bd3d-7673cffb03ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-683154a7-f32a-4a8e-bd3d-7673cffb03ba
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-683154a7-f32a-4a8e-bd3d-7673cffb03ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-683154a7-f32a-4a8e-bd3d-7673cffb03ba"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-217ae746-1aa3-4b36-a872-14a66c9b454a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217ae746-1aa3-4b36-a872-14a66c9b454a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-217ae746-1aa3-4b36-a872-14a66c9b454a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-217ae746-1aa3-4b36-a872-14a66c9b454a"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb0b7c08-d8b9-427b-8658-65a1791f183e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb0b7c08-d8b9-427b-8658-65a1791f183e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb0b7c08-d8b9-427b-8658-65a1791f183e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fb0b7c08-d8b9-427b-8658-65a1791f183e"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-4113819a-f089-41b3-b5dd-334bd0aaac32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4113819a-f089-41b3-b5dd-334bd0aaac32
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4113819a-f089-41b3-b5dd-334bd0aaac32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4113819a-f089-41b3-b5dd-334bd0aaac32"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-9689b2a6-0c64-453b-9291-d2d976ee2491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9689b2a6-0c64-453b-9291-d2d976ee2491
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9689b2a6-0c64-453b-9291-d2d976ee2491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9689b2a6-0c64-453b-9291-d2d976ee2491"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3d7125d-67ec-4ef7-803f-c381456c19c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d7125d-67ec-4ef7-803f-c381456c19c6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3d7125d-67ec-4ef7-803f-c381456c19c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e3d7125d-67ec-4ef7-803f-c381456c19c6"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4d4272d-696c-4849-8b9e-5bfb626cc062

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4d4272d-696c-4849-8b9e-5bfb626cc062
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4d4272d-696c-4849-8b9e-5bfb626cc062
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b4d4272d-696c-4849-8b9e-5bfb626cc062"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe103049-be51-465a-bc5e-8bcffd4ca192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe103049-be51-465a-bc5e-8bcffd4ca192
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe103049-be51-465a-bc5e-8bcffd4ca192
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fe103049-be51-465a-bc5e-8bcffd4ca192"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d691a42-cbe8-4ce2-afec-e468283a4efe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d691a42-cbe8-4ce2-afec-e468283a4efe
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d691a42-cbe8-4ce2-afec-e468283a4efe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8d691a42-cbe8-4ce2-afec-e468283a4efe"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e4c5774-0f7a-4bf4-b6b2-7214784c082b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e4c5774-0f7a-4bf4-b6b2-7214784c082b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e4c5774-0f7a-4bf4-b6b2-7214784c082b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3e4c5774-0f7a-4bf4-b6b2-7214784c082b"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e50cb36-3786-4bce-b7e1-80b2ac1b52c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e50cb36-3786-4bce-b7e1-80b2ac1b52c1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e50cb36-3786-4bce-b7e1-80b2ac1b52c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8e50cb36-3786-4bce-b7e1-80b2ac1b52c1"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-30d69e9c-6bc7-460b-a11d-d57f6c5b9d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d69e9c-6bc7-460b-a11d-d57f6c5b9d93
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30d69e9c-6bc7-460b-a11d-d57f6c5b9d93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-30d69e9c-6bc7-460b-a11d-d57f6c5b9d93"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-9019c9a4-08ac-44be-98c7-01c673263221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9019c9a4-08ac-44be-98c7-01c673263221
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9019c9a4-08ac-44be-98c7-01c673263221
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9019c9a4-08ac-44be-98c7-01c673263221"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-3cd0f276-ea6a-4de2-af64-bae41119b8ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd0f276-ea6a-4de2-af64-bae41119b8ab
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3cd0f276-ea6a-4de2-af64-bae41119b8ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3cd0f276-ea6a-4de2-af64-bae41119b8ab"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-0dd2b726-6a88-43e0-8e00-b9c8134c0c56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dd2b726-6a88-43e0-8e00-b9c8134c0c56
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dd2b726-6a88-43e0-8e00-b9c8134c0c56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0dd2b726-6a88-43e0-8e00-b9c8134c0c56"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-573cd728-10d8-4d8d-bb25-0bd239b87129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573cd728-10d8-4d8d-bb25-0bd239b87129
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-573cd728-10d8-4d8d-bb25-0bd239b87129
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-573cd728-10d8-4d8d-bb25-0bd239b87129"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ddd67c9-ed2e-4272-9733-52e5b9b26c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ddd67c9-ed2e-4272-9733-52e5b9b26c10
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ddd67c9-ed2e-4272-9733-52e5b9b26c10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9ddd67c9-ed2e-4272-9733-52e5b9b26c10"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-38b62a50-ccd6-450f-a00b-936b75e08007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38b62a50-ccd6-450f-a00b-936b75e08007
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38b62a50-ccd6-450f-a00b-936b75e08007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-38b62a50-ccd6-450f-a00b-936b75e08007"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-47a7bcd5-92df-4904-8891-e13cc7b29440

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47a7bcd5-92df-4904-8891-e13cc7b29440
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-47a7bcd5-92df-4904-8891-e13cc7b29440
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5492f59f-57d4-480f-b4ea-8bf0b9877189","handle":"qa-211c20ef0694","displayName":"QA 211c20ef0694","region":"eu","role":"user","createdAt":"2026-10-27T08:00:26.023329292Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2030356-ae59-4ba1-a199-501a5d29d476

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2030356-ae59-4ba1-a199-501a5d29d476
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2030356-ae59-4ba1-a199-501a5d29d476
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-77020b29-9bb7-4651-99f8-de41048649a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77020b29-9bb7-4651-99f8-de41048649a7
Content-Type: application/json

--- request body ---
{"handle":"qa-211c20ef0694","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77020b29-9bb7-4651-99f8-de41048649a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77020b29-9bb7-4651-99f8-de41048649a7"}
```
